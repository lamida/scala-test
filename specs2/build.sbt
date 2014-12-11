name := "exploring-specs2"

version := "1.0"

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.2" % "test" withSources() withJavadoc(),
  "org.specs2" % "specs2-core_2.11" % "2.4.14" withSources() withJavadoc(),
  "joda-time" % "joda-time" % "2.6" withSources() withJavadoc(),
  "junit" % "junit" % "4.10" withSources() withJavadoc(),
  "org.testng" % "testng" % "6.1.1" withSources() withJavadoc()
)

