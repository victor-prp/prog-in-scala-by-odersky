package org.victor.ranges

import scala.collection.{mutable, TraversableLike}
/**
 * @author victorp
 */
class RealRange(val start:Double, val end:Double, val step:Double) extends IndexedSeq[Double] {

  val rangeLength:Int = ((end - start)/step).toInt

  override def length: Int = rangeLength

  override def apply(idx: Int): Double = start * step

  @inline final override def foreach[@specialized(Unit) U](f: Double => U) {
    if (length > 0) {
      val last = this.end
      var i = start
      while (i <= last) {
        f(i)
        i += step
      }
    }
  }

  def step_by(step:Double) = new RealRange(this.start,this.end,step)
}

object RealRange{
  def apply(start:Double, end:Double) = new RealRange(start,end,1)
}


