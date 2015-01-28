# Scala-UI

Pedagogically appropriate functions for user input handling in Scala
(sans exceptions!)

# Getting Scala-UI

We are working on properly syncing Scalaµ from Bintray's jcenter to
Maven Central.

Meanwhile, you can resolve the dependency on Scalaµ by adding these
lines to your `build.sbt`.

    resolvers += "loyolachicagocode@bintray" at "http://dl.bintray.com/loyolachicagocode/maven"

    libraryDependencies += "edu.luc.cs" %% "introcs-scala-ui" % "0.1"

You can also just clone this project and play around with the example
worksheets.

# Quick Start

    import edu.luc.cs.ui._

    val n = promptInt("What is your favorite number? ", -1)
    println(s"Thank you for entering the number $n.")

# Running the Sample App

    $ sbt test:run
    ...
    What is your favorite number? 7
    Thank you for entering the number 7.
