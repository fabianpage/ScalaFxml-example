scalaVersion := "2.10.1"

scalacOptions ++= Seq(
    "-feature",
    "-deprecation"
)

version :="0.1.2-SNAPSHOT"

parallelExecution := true

name := "scalafxml-example"

organization := "com.github.nuriaion"

fork := true

resolvers ++= Seq(
    "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
    "Sonatype Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
    "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases",
    "Nuriaion Snapshots" at "http://github.com/Nuriaion/maven-repo/raw/master/snapshots",
    "Nuriaion Releases" at "http://github.com/Nuriaion/maven-repo/raw/master/releases"
)

libraryDependencies ++= Seq(
    "org.scalaz" %% "scalaz-core" % "7.0.0",
    "org.scalafx" %% "scalafx" % "1.0.0-M3"
)

libraryDependencies ++= Seq(
    "org.specs2" %% "specs2" % "1.14" % "test",
    "org.scalatest" %% "scalatest" % "1.9.1" % "test",
    "org.scalacheck" %% "scalacheck" % "1.10.0" % "test",
    "junit" % "junit" % "4.11" % "test",
    "org.pegdown" % "pegdown" % "1.2.0" % "test"
)

testOptions in Test += Tests.Argument("junitxml", "html", "console", "markup")

publishArtifact in Compile := true

scalafxmlSettings

unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/jfxrt.jar"))