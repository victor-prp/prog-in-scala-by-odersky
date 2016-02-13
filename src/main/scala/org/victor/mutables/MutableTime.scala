package org.victor.mutables

/**
 * @author victorp
 */
class MutableTime(h:Int,s:Int) {
  var hour:Int = h
  var seconds: Int = s


  override def toString = s"MutableTime($hour, $seconds)"
}
