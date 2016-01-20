package samples

import org.victor.functions.CarrySum.plus


object CarrySumSample extends App{
  def plus10 = plus(10)_

  val plus_10_20 = plus10(20)
  println(plus_10_20)
  println(plus_10_20(0) )

  println( plus(10)(20)(0))
}
