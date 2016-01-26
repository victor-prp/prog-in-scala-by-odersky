package org.victor.log

/**
 * @author victorp
 */
object LogLevel extends Enumeration{
  type LogLevel = Value

  val INFO = Value(1,"info")
  val WARN = Value(2,"warn")
  val ERROR = Value(3,"error")
}
