package org.victor

/**
 * @author victorp
 */
package object patternmatching {

  /**
   * It looks like it tests whether the map is defined as Int -> Int
   * But scala cant do such check since no type info is available at runtime
   */
  def isIntIntMap(x: Any) = x match {
    case m: Map[Int, Int] => true
    case _ => false
  }
}
