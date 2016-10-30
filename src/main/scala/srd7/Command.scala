package srd7

import scala.sys.process._

object Command {
  private[this] val regStart = "ActiveHoursStart"
  private[this] val regEnd   = "ActiveHoursEnd"

  private[this] def command(key: String, value: Int) = {
    s"""reg add HKLM\\SOFTWARE\\Microsoft\\WindowsUpdate\\UX\\Settings /v ${key} /t REG_DWORD /d ${value} /f"""
  }

  private[srd7] def start(value: Int) = {
    command(regStart, value).!!
  }

  private[srd7] def end(value: Int) = {
    command(regEnd, value).!!
  }
}
