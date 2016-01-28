package org.victor.anyvalref

/**
 * Created by victor on 28/01/16.
 */
class ImplicitRef(val value:Int){

  def canEqual(other: Any): Boolean = other.isInstanceOf[ImplicitRef]

  override def equals(other: Any): Boolean = other match {
    case that: ImplicitRef =>
      (that canEqual this) &&
        value == that.value
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(value)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
