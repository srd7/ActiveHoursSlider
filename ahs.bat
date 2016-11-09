rem Author: srd7
rem src: https://github.com/srd7/ActiveHoursSlider

@echo off

rem Get current time.
rem replace ' ' to '0'.
set now=%time: =0%

rem Extract hour
set hour=%now:~0,2%

rem Start hour is 2 hours ago.
rem End hour is 10 hours later.
set /a "start_hour = (%hour% + 22) %% 24, end_hour = (%hour% + 10) %% 24"

reg add HKLM\SOFTWARE\Microsoft\WindowsUpdate\UX\Settings /v ActiveHoursStart /t REG_DWORD /d %start_hour% /f
reg add HKLM\SOFTWARE\Microsoft\WindowsUpdate\UX\Settings /v ActiveHoursEnd /t REG_DWORD /d %end_hour% /f
