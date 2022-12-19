ThisBuild / scalaVersion := "3.2.1"

lazy val bootstrap = project
  .in(file("bootstrap"))
  .settings(
    libraryDependencies ++= Seq(
      "com.raquo" %%% "laminar" % "0.14.5"
    )
  )
  .enablePlugins(ScalaJSPlugin)

lazy val example = project
  .in(file("example"))
  .settings(
    scalaJSUseMainModuleInitializer := true,
    Compile / mainClass := Some("Example")
  )
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(bootstrap)
