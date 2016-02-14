package org.victor.currencies

import org.victor.currencies.Currency._

/**
 * @author victorp
 */
object MoneyConverter {

  private def rate(currency: Currency.Value): Double = {
    currency match {
      case Shekel => 1.0
      case Dollar => 3.75
      case Rubel => 0.2
      case _ => throw new RuntimeException(s"The rate for $currency is not defined ")
    }
  }

  def convert(money: Money, currency: Currency.Value) = {
    val amountInShekel = toShekel(money)
    val amountInCurrency = fromShekel(amountInShekel, currency)
    new Money(amountInCurrency, currency)
  }


  private def toShekel(money: Money): Double = {
    money.amount * rate(money.currency)
  }

  private def fromShekel(amount: Double, currency: Currency.Value): Double = {
    amount / rate(currency)
  }

}
