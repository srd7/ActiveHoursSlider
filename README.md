# ActiveHoursSlider

## 概要
Windows 10 (Home) で、自動的に再起動されないように、アクティブ時間を定期的に変更します。

## 注意
**レジストリを書き換えます**。使用は**自己責任**でお願いします。  
このソフトウェアを使ったことで問題が発生しても、**作者は一切責任を負いません**。  

## 使い方
https://github.com/srd7/ActiveHoursSlider/releases  
ここから最新の `ActiveHoursSlider.exe` をダウンロードします。

起動すると、タスクトレイに常駐します。  
アプリ起動時と、その後1時間ごとにレジストリを書き換えます。

いらなくなったら、タスクトレイを右クリックして終了してください。

パソコン起動時にアプリを起動したい場合は
`windows 10 スタートアップ 設定`
なりでぐぐってください。

## FAQ

### うまく動かないんだけど
ごめんなさい。きちんとは動作確認できてないです。

### いちいち通知がくるのうるさい
設定できるように改善します（そのうち）

### 1時間ごとじゃなくて3時間ごとにできないの？
設定できるように改善します（そのうち）

### こんな機能が欲しい
作者 → https://twitter.com/srnk6

### 自分でビルドしたい
`sbt assembly`

## 詳細
1時間ごとにレジストリを書き換えます。  
書き換えるレジストリは

`HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\WindowsUpdate\UX\Settings`

の中にある

`ActiveHoursStart` と `ActiveHoursEnd` の2つです。

現在時刻の2時間前をアクティブ時間の開始時刻、10時間後を終了時刻に書き換えます。

アイコン画像は

http://www.easyicon.net/language.ja/1200967-alarm_clock_icon.html

を使わせていただいています。

## LICENSE
MIT
