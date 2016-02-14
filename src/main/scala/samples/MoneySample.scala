package samples

import org.victor.currencies.Currency._
import org.victor.currencies.Money
import org.victor.currencies.MoneyConverter._


/**
 * @author victorp
 */
object MoneySample extends App{

  val tenDollar = Money(10, Dollar)
  println(tenDollar)
  val twentyDollar = Money(20,Dollar)
  val manyShekel = convert(twentyDollar,Shekel)
  println(s"twenty dollar is $manyShekel")

  println(s"$tenDollar + $manyShekel = ${tenDollar + manyShekel}")

}
