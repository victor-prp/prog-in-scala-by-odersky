package samples

import java.lang.System._

import com.typesafe.scalalogging.Logger
import org.slf4j.LoggerFactory
import org.victor.log.{StupidLog, SmartLog, LogLevel}

/**
 * @author victorp
 */
object LogSample extends App{

  /**
   * Lets show both logs (smart and stupid work)
   */
  val smartInfoLog = SmartLog(LogLevel.INFO)
  smartInfoLog.info("this is smart log that prints info message")


  val stupidInfoLog = StupidLog(LogLevel.INFO)
  smartInfoLog.info("this is stupid log that prints info message")


  /**
   * Lets demonstrate both will not print a message if not required
   */

  val smartErrorLog = SmartLog(LogLevel.ERROR)

  //since the log is in error level the next invocation will not print it
  //additionally it will not even construct the log string since it uses 'by-name' parameter
  smartErrorLog.info("a"+"b"+"c"+"d")



  val stupidErrorLog = StupidLog(LogLevel.ERROR)

  //since the log is in error level the next invocation will not print it
  //since this log is not so smart the log message will be constructed and unnecessary calculations will be done
  stupidErrorLog.info("a"+"b"+"c"+"d")


  val scalaDefaultLog = Logger(LoggerFactory.getLogger("error-log"))


  /**
   * Lets check performance
   */
  val testRange =  0 to 10000000

  testAndPrintResults("smart",i => smartErrorLog.info("line"+i+";"+i+1+";"+i+2))

  testAndPrintResults("stupid",i => stupidErrorLog.info("line"+i+";"+i+1+";"+i+2))

  testAndPrintResults("scala",i => scalaDefaultLog.trace("line"+i+";"+i+1+";"+i+2))


  def testAndPrintResults(loggerName:String , logIt:Int => Unit) = {
    val startTimeScala = currentTimeMillis
    testRange foreach{
      i => logIt(i)
    }
    val endTimeScala = currentTimeMillis
    println(loggerName+ " logger took:" +(endTimeScala - startTimeScala) + "millis")
  }
}
