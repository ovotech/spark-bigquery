resolvers += "bintray-spark-packages" at "https://dl.bintray.com/spark-packages/maven/"
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.2")
addSbtPlugin("org.spark-packages" % "sbt-spark-package" % "0.2.4")
addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.5.2")
