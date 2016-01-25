package samples

import org.victor.ranges._
import org.victor.ranges.ImplicitConverter._

/**
 * @author victorp
 */
object RangeSample extends App{

  //standard range example
  val start:Int = 0
  val end:Int = 10
  //when start to is invoked start becomes RichInt
  val theRange = start to end

  println("starts from:"+theRange.start)
  println("ends at from:"+theRange.end)


  println(theRange)
  println(start.getClass)

  val realRange = RealRange(0.1,4.5)
  println("Explicit Doubled Range")
  realRange.foreach(value=>print(value + "; "))

  println
  println("Implicit Doubled Range")
  (0.2 to 8.1).foreach(value=>print(value + "; "))


  println
  println("Implicit Doubled Range with custom step of 0.1")
  (0.2 to 4.1) step_by 0.1 foreach(value=>print(value + "; "))
}
