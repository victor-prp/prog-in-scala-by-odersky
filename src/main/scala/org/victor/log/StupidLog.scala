package org.victor.log

import org.victor.log.LogLevel._

/**
 * @author victorp
 */
class StupidLog (val currentLevel:LogLevel) {


  def info(msg:String ): Unit ={
    if (shouldWrite(LogLevel.INFO)) {
      println(msg)
    }
  }

  def warn(msg:String ): Unit ={
    if (shouldWrite(LogLevel.WARN)) {
      println(msg)
    }
  }

  def error(msg:String ): Unit ={
    if (shouldWrite(LogLevel.WARN)) {
      println(msg)
    }
  }

  def shouldWrite(invokedLevel:LogLevel):Boolean = currentLevel.id <= invokedLevel.id

}

object StupidLog{
  def apply(level: LogLevel.Value) = new StupidLog(level)

}