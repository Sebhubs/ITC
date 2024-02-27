ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "Connecting_To_PostGres"
  )

libraryDependencies += "org.postgresql" % "postgresql" % "42.2.23"

