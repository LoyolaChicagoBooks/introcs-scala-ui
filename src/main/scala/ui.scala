// Will think of a proper org structure later.
package edu.luc.cs

import scala.util.{Try, Success, Failure}
import scala.io.StdIn.readLine

package object ui {

  def promptLine(prompt : String) : String = {
     print(prompt)
     readLine()
  } 

  def getIntOption(s : String) : Option[Int] = {
     Try(s.toInt).toOption
  }

  def getInt(s : String, defaultValue : Int) : Int =  {
     getIntOption(s).getOrElse(defaultValue)
  }

  def promptInt(message : String, defaultValue : Int) : Int = {
     getIntOption(promptLine(message)).getOrElse(defaultValue)
  }


  // TODO: Replicate the above for handling other primitive types.
}



