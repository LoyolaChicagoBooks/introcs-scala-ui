[![Build Status](https://travis-ci.org/LoyolaChicagoBooks/introcs-scala-ui.svg?branch=master)](https://travis-ci.org/LoyolaChicagoBooks/introcs-scala-ui)
[![Coverage Status](https://coveralls.io/repos/LoyolaChicagoBooks/introcs-scala-ui/badge.svg)](https://coveralls.io/r/LoyolaChicagoBooks/introcs-scala-ui)

# Scala-UI

Pedagogically appropriate functions for user input handling in Scala
(sans exceptions!)

# Getting Scala-UI

To use Scala-UI in your sbt-based project, add these lines to your `build.sbt`

    scalaVersion := "2.11.5"

    resolvers += "loyolachicagocode@bintray" at "http://dl.bintray.com/loyolachicagocode/maven"

    libraryDependencies += "edu.luc.cs" %% "introcs-scala-ui" % "x.y.z"

where `x.y.z` is the most recent version number of this package available on
[Bintray](https://bintray.com/loyolachicagocode/maven/introcs-scala-ui/view#files).


# Quick Start

    import edu.luc.cs.ui._

    val n = promptInt("What is your favorite number? ", -1)
    println(s"Thank you for entering the number $n.")

# Running the Sample App

    $ sbt test:run
    ...
    What is your favorite number? 7
    Thank you for entering the number 7.
