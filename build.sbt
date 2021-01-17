ThisBuild / scalaVersion     := "2.13.4"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "hello-graal-purs",
    libraryDependencies += "org.graalvm.sdk" % "graal-sdk" % "20.3.0"
  )
