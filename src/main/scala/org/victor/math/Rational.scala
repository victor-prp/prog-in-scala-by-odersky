package org.victor.math


class Rational(n: Int, d: Int) extends Ordered[Rational]{
  require(d != 0)
  private val g = gcd(n.abs, d.abs)

  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def compare(that: Rational) = (this.numer * that.denom) - (that.numer * this.denom)

  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)


  def + (that: Int): Rational =
    this + new Rational(that)


  def * (that: Int): Rational =
    this * new Rational(that)

  override def toString = numer +"/"+ denom

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)


}

object convert{
  implicit def intToRational(x: Int) = new Rational(x)
}


