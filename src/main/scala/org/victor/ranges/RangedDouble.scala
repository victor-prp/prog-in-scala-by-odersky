package org.victor.ranges

/**
 * @author victorp
 */
final class RangedDouble(val self: Double){
  def to (end:Double) = RealRange(self,end)
}


object ImplicitConverter{
  implicit def doubleWrapper(x: Double):RangedDouble  = new RangedDouble(x)
}

