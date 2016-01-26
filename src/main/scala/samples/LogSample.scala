package samples

import java.lang.System._

import com.typesafe.scalalogging
import org.slf4j.LoggerFactory
import org.victor.log.{StupidLog, SmartLog, LogLevel}

/**
 * @author victorp
 */
object LogSample extends App{

  /**
   * Lets see different logs (smart, stupid and scala) in action
   */
  val smartInfoLog = SmartLog(LogLevel.INFO)
  smartInfoLog.info("this is smart log that prints info message")


  val stupidInfoLog = StupidLog(LogLevel.INFO)
  smartInfoLog.info("this is stupid log that prints info message")

  val scalaDefaultLog = scalalogging.Logger(LoggerFactory.getLogger("default-log"))
  scalaDefaultLog.info("this is a scala log that prints info message")

  /**
   * Lets demonstrate Stupid and Smart loggers - both will not print a message if not required
   */

  val smartErrorLog = SmartLog(LogLevel.ERROR)

  //since the log is in error level the next invocation will not print it
  //additionally it will not even construct the log string since it uses 'by-name' parameter
  smartErrorLog.info("a"+"b"+"c"+"d")


  val stupidErrorLog = StupidLog(LogLevel.ERROR)

  //since the log is in error level the next invocation will not print it
  //since this log is not so smart the log message will be constructed and unnecessary calculations will be done
  stupidErrorLog.info("a"+"b"+"c"+"d")



  /**
   * Lets check performance
   */
  val testRange =  0 to 10000000

  testAndPrintResults("scala",i => scalaDefaultLog.trace("line"+i+";"+i+1+";"+i+2))

  testAndPrintResults("smart",i => smartErrorLog.info("line"+i+";"+i+1+";"+i+2))

  testAndPrintResults("stupid",i => stupidErrorLog.info("line"+i+";"+i+1+";"+i+2))


  /**
   * Conclusions
   * StupidLog is very bad: a simple developer mistake make lead to terrible performance impact
   * SmartLog is very good: it does actual work only if it shoud to
   * scalalogging.Logger is the best: it uses macros (and I have no explanation at this point why it is faster then smartLog :) )
   */

  def testAndPrintResults(loggerName:String , logIt:Int => Unit) = {
    val startTimeScala = currentTimeMillis
    testRange foreach{
      i => logIt(i)
    }
    val endTimeScala = currentTimeMillis
    println(loggerName+ " logger took:" +(endTimeScala - startTimeScala) + "millis")
  }
}
