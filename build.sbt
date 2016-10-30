lazy val root = (project in file(".")).
  settings(
    name := "ActiveHoursSlider",
    version := "1.0.0",
    scalaVersion := "2.11.8",
    scalacOptions := Seq(
      "-unchecked", "-deprecation", "-feature"
    ),
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % "2.4.11"
    ),
    fork := true
  )

