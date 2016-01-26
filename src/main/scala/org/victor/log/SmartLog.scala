package org.victor.log

import org.victor.log.LogLevel._

/**
 * Shows how 'by-name' parameter can be used in order to call the received
 * function only if needed and to have the feel a String is passes (and not a function)
 * in case of logger it is critical not to construct string unless you really need it
 * (for performance boost)
 * <p>
 * @author victorp
 */
class SmartLog(val currentLevel:LogLevel) {


  def info(logProducer: => String ): Unit ={
    if (shouldWrite(LogLevel.INFO)) {
      println(logProducer)
    }
  }

  def warn(logProducer: => String ): Unit ={
    if (shouldWrite(LogLevel.WARN)) {
      println(logProducer)
    }
  }

  def error(logProducer: => String ): Unit ={
    if (shouldWrite(LogLevel.WARN)) {
      println(logProducer)
    }
  }

  def shouldWrite(invokedLevel:LogLevel):Boolean = currentLevel.id <= invokedLevel.id

}

object SmartLog{
  def apply(level: LogLevel.Value) = new SmartLog(level)

}
