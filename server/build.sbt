name := "server"

version := "0.1"

scalaVersion := "2.12.7"

val akkaVersion = "2.6.8"
val scalaTestVersion = "3.0.5"
val akkaHttpVersion = "10.2.0"

libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)

libraryDependencies ++= Seq(
  // akka streams
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  // akka http
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion,
  // testing
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,

  // JWT
  "com.pauldijou" %% "jwt-spray-json" % "2.1.0",
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion
)
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion
)