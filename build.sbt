
name := "spark-bigquery"
organization := "com.ovoenergy"
scalaVersion := "2.11.12"

spName := "ovotech/spark-bigquery"
sparkVersion := "2.2.0"
sparkComponents := Seq("core", "sql")
spAppendScalaVersion := false
spIncludeMaven := true
spIgnoreProvided := true
parallelExecution in Test := false
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-hive" % "2.2.0" % "test",
  "com.holdenkarau" %% "spark-testing-base" % "2.2.0_0.8.0" % "test",
  "com.google.cloud.bigdataoss" % "bigquery-connector" % "0.10.4-hadoop2"
    exclude ("com.google.guava", "guava-jdk5"),
  "joda-time" % "joda-time" % "2.9.3",
  "org.mockito" % "mockito-core" % "1.8.5" % "test",
  "org.scalatest" %% "scalatest" % "2.2.5" % "test"
)

// Release settings
releaseCrossBuild             := false
publishArtifact in Test := false
publishMavenStyle := true
bintrayOrganization := Some("ovotech")
bintrayRepository := "maven-private"
bintrayOmitLicense := true
