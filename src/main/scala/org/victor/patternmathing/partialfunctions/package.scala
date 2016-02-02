package org.victor.patternmathing

/**
 * @author victorp
 */
package object partialfunctions {

  /**
   * This is partial function which is undefined for Option that has no real value
   */
  val extractVal: Option[Int] => Int = {
    case Some(value) => value
  }


  /**
   * This is partial function which is undefined for Option that has no real value
   * since 'PartialFunction' is used 'isDefinedAt' is added and can be used in order
   * to test if the function is defined for specific value
   */
  val extractValPartially: PartialFunction[Option[Int],Int] = {
    case Some(value) => value
  }

  /**
   * This function is NOT partial all cases are exhausted
   */
  def extractValWithDefault(default:Int): Option[Int] => Int = {
    case Some(value) => value
    case None => default
  }
}
