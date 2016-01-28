package org.victor.anyvalref

/**
 * By Default ant new class def extends from AnyRef
 * victorp
 */
class ExplicitRef(val value:Int) extends AnyRef{
  def canEqual(other: Any): Boolean = other.isInstanceOf[ExplicitRef]

  override def equals(other: Any): Boolean = other match {
    case that: ExplicitRef =>
      (that canEqual this) &&
        value == that.value
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(value)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
