name := "Shopppers Project"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
"org.apache.spark" %% "spark-core" % "1.0.0",
"org.apache.spark" %% "spark-sql"  % "1.0.0"
)

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"
