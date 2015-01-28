package edu.luc.cs

import scala.util.Try
import scala.io.StdIn.readLine

package object ui {

  def promptLine(prompt : String) : String = {
     print(prompt)
     readLine()
  } 

  def getBooleanOption(s : String) : Option[Boolean] = 
     Try(s.toBoolean).toOption
  
  def getIntOption(s : String) : Option[Int] =
     Try(s.toInt).toOption

  def getLongOption(s : String) : Option[Long] =
    Try(s.toLong).toOption

  def getFloatOption(s : String) : Option[Float] =
    Try(s.toFloat).toOption

  def getDoubleOption(s : String) : Option[Double] =
    Try(s.toDouble).toOption

  def getBoolean(s : String, defaultValue : Boolean) : Boolean = 
     getBooleanOption(s).getOrElse(defaultValue)
  
  def getInt(s : String, defaultValue : Int) : Int =
     getIntOption(s).getOrElse(defaultValue)

  def getLong(s : String, defaultValue : Long) : Long =
    getLongOption(s).getOrElse(defaultValue)

  def getFloat(s : String, defaultValue : Float) : Float =
    getFloatOption(s).getOrElse(defaultValue)

  def getDouble(s : String, defaultValue : Double) : Double =
    getDoubleOption(s).getOrElse(defaultValue)

  def promptBoolean(message : String, defaultValue : Boolean) : Boolean =
    getBooleanOption(promptLine(message)).getOrElse(defaultValue)
  
  def promptInt(message : String, defaultValue : Int) : Int =
     getIntOption(promptLine(message)).getOrElse(defaultValue)

  def promptLong(message : String, defaultValue : Long) : Long =
    getLongOption(promptLine(message)).getOrElse(defaultValue)

  def promptFloat(message : String, defaultValue : Float) : Float =
    getFloatOption(promptLine(message)).getOrElse(defaultValue)

  def promptDouble(message : String, defaultValue : Double) : Double =
    getDoubleOption(promptLine(message)).getOrElse(defaultValue)

}
