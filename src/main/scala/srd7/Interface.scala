package srd7

import java.io._
import java.awt._
import java.awt.event._
import javax.imageio.ImageIO

// ref: http://d.hatena.ne.jp/fuzzhead/20081027/p1
object Interface {
  implicit class FileExtension(val file: File) {
    def /(path: String) = new File(file, path)
  }

  private[this] val iconFilename = "alarm_clock_259px_1200967_easyicon.net.png"
  private[this] val appName = "ActiveHoursSlider"

  // Icon image
  private[this] def readImage: Image = {
    val iconFile = Thread.currentThread.getContextClassLoader.getResourceAsStream(iconFilename)
    ImageIO.read(iconFile)
  }

  private[this] val tasktray: TrayIcon = {
    val menuItem = new MenuItem("終了");
    menuItem.addActionListener(new ActionListener() {
      override def actionPerformed(e: ActionEvent) {
        sys.exit(0)
      }
    })

    val menu = new PopupMenu()
    menu.add(menuItem)

    val icon: TrayIcon = new TrayIcon(readImage)
    icon.setImageAutoSize(true)
    icon.setPopupMenu(menu)

    SystemTray.getSystemTray().add(icon)

    icon
  }

  // TODO: Fix
  def connect: Unit = ()

  def notify(message: String): Unit = {
    tasktray.displayMessage(appName, message, TrayIcon.MessageType.INFO)
  }
}
