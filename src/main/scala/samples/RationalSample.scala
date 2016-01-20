package samples

import org.victor.math.Rational
import org.victor.math.convert.intToRational



object RationalSample extends App{

  val r_2_del_1 = new Rational(10,5)
  println(r_2_del_1)
  val r_11_del_4  = r_2_del_1 + new Rational(3,4)
  println(r_11_del_4)

  println(r_2_del_1+2)

  println(2+r_2_del_1)

}