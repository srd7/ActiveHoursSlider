package srd7

import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global
import java.util.Calendar
import akka.actor._

object Main {
  def main(args: Array[String]) {
    val system = ActorSystem()
    val actor = system.actorOf(Props[RunningActor])

    val delay = 5.second
    val span  = 1.hour

    // TODO: Fix
    Interface.connect

    system.scheduler.schedule(delay, span, actor, 'run)
  }
}

class RunningActor extends Actor {
  def receive = {
    case 'run => {
      val calendar = Calendar.getInstance

      val hour = calendar.get(Calendar.HOUR_OF_DAY)

      // Start hour is 2 hours ago.
      // End hour is 10 hours later.
      val startHour = (hour + 22) % 24;
      val endHour   = (hour + 10) % 24;

      val message = s"アクティブ時間を${startHour}時から${endHour}時に変更しました。"

      // TODO: Fix synchronous code to asynchronous
      Command.start(startHour)
      Command.end(endHour)
      Interface.notify(message)
    }
  }
}
