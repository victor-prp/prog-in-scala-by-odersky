package org.victor.functions



object CarrySum {

  def plus(x : Int = 0)(y: Int = 0)(z: Int = 0) = x + y + z
  def plus2(x : Int, y: Int) = plus(x)(y)(0)

}
