name := "RosettaLoadTest"

version := "0.1"

enablePlugins(GatlingPlugin)

scalaVersion := "2.13.4"

val gatlingVersion = "3.5.1"
libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion % "test,it"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % gatlingVersion % "test,it"