package org.victor.currencies
import  org.victor.currencies.MoneyConverter._

/**
 * @author victorp
 */
class Money(val amount:Double, val currency:Currency.Value) {


  def thisMoney(amount:Double)={
    Money(amount,currency)
  }

  def +(money:Money):Money = {
    thisMoney(amount + convert(money,currency).amount)
  }

  def -(money:Money):Money  = {
    thisMoney(amount - convert(money,currency).amount)
  }

  override def toString = s"$amount $currency"
}

object Money{
  def apply(amount:Double,currency:Currency.Value = Currency.Dollar) = {
    new Money(amount,currency)
  }
}
