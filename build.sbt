name := "scala-test-playing"

version := "1.0"

scalaVersion := "2.11.4"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test" withSources() withJavadoc()

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.12.1" % "test"withSources() withJavadoc()



