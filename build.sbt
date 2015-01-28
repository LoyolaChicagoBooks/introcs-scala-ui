organization := "edu.luc.cs"

name := "introcs-scala-ui"

version := "0.1"

scalaVersion := "2.11.5"

// The next few lines will work only with sbt-scoverage version 0.99.7.1.
// Do not update until sbt-scoverage 1.0 stabilizes!

instrumentSettings

org.scoverage.coveralls.CoverallsPlugin.coverallsSettings

// Enable publishing of library jar to Bintray

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

seq(bintrayPublishSettings:_*)

bintray.Keys.bintrayOrganization in bintray.Keys.bintray := Some("loyolachicagocode")
