import sbt._
import Keys._
import play.Project._

object Achaia3Build extends Build {

  object V {
    val astyanax = "1.56.42"
  }

  val appName         = "Achaia3"
  val appVersion      = "0.0.1-SNAPSHOT"

  val appDependencies = Seq(
    jdbc,
    anorm,
    "com.netflix.astyanax" % "astyanax-core" % V.astyanax exclude("org.slf4j", "slf4j-log4j12"),
    "com.netflix.astyanax" % "astyanax-thrift" % V.astyanax exclude("org.slf4j", "slf4j-log4j12"),
    "com.netflix.astyanax" % "astyanax-entity-mapper" % V.astyanax exclude("org.slf4j", "slf4j-log4j12"),
    "scalastyanax" %% "scalastyanax" % "1.0.7-SNAPSHOT",
    "com.google.code.findbugs" % "jsr305" % "1.3.+",
    "org.specs2" %% "specs2" % "2.2.2" % "test",
    "org.mockito" % "mockito-all" % "1.9.5" % "test"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    scalaVersion        := "2.10.3",
    scalacOptions       := Seq("-unchecked", "-deprecation", "-feature", "-language:implicitConversions", "-language:postfixOps"),
    scalacOptions in Test ++= Seq("-Yrangepos"),
    javaOptions in Test += "-Dconfig.file=conf/test-application.conf",
    javaOptions in Test += "-Dlogger.file=conf/logger.xml")

}
