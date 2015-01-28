organization := "edu.luc.cs"

name := "introcs-scala-ui"

version := "0.1"

scalaVersion := "2.11.5"

// Enable publishing of library jar to Bintray

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

seq(bintrayPublishSettings:_*)

bintray.Keys.bintrayOrganization in bintray.Keys.bintray := Some("loyolachicagocode")
