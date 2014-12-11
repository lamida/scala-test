name := "scala-test-playing"

version := "1.0"

scalaVersion := "2.11.4"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test" withSources() withJavadoc()

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.12.1" % "test"withSources() withJavadoc()

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.6" withSources() withJavadoc(),
  "junit" % "junit" % "4.10" withSources() withJavadoc(),
  "org.testng" % "testng" % "6.1.1" withSources() withJavadoc()
)


