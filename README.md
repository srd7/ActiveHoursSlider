# ActiveHoursSlider

## 概要
Windows 10 (Home) で、自動的に再起動されないように、アクティブ時間を定期的に変更します。

簡単な方は [こちら](https://github.com/srd7/ActiveHoursSlider/tree/master)

## 注意
**レジストリを書き換えます**。使用は**自己責任**でお願いします。  
このソフトウェアを使ったことで問題が発生しても、**作者は一切責任を負いません**。  

## 使い方
https://github.com/srd7/ActiveHoursSlider/blob/batch-and-task-scheduler/ahs.bat  
ここから最新の `ahs.bat` をダウンロードします。

この `ahs.bat` をタスクスケジューラに登録してください。  
登録方法は「タスクスケジューラ 登録」とかでぐぐってください。

実行すると、レジストリを書き換えます。

## FAQ

### うまく動かないんだけど
作者 → https://twitter.com/srnk6

### こんな機能が欲しい
作者 → https://twitter.com/srnk6

## 詳細
実行するとレジストリを書き換えます。  
書き換えるレジストリは

`HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\WindowsUpdate\UX\Settings`

の中にある

`ActiveHoursStart` と `ActiveHoursEnd` の2つです。

現在時刻の2時間前をアクティブ時間の開始時刻、10時間後を終了時刻に書き換えます。


## LICENSE
MIT
