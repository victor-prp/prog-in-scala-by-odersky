package samples

import java.lang.System.currentTimeMillis

import org.victor.recursion.TailRecursion
import scala.math._

/**
 * @author victorp
 */
object TailRecursionSample extends App{

  val someVal = TailRecursion()

  val iterationsCount = 1 to 10000


  //recursion
  val startTimeR = currentTimeMillis()
  iterationsCount.foreach(_ => someVal.approximate(random))
  val endTimeR = currentTimeMillis()

  println("recursion took: "+ (endTimeR - startTimeR) + " millis")


  //recursion
  val startTimeL = currentTimeMillis()
  iterationsCount.foreach(_ => someVal.approximateLoop(random))
  val endTimeL = currentTimeMillis()

  println("loop took: "+ (endTimeL - startTimeL) + " millis")
}
