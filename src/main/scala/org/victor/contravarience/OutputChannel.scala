package org.victor.contravarience

/**
 * @author victorp
 */
trait OutputChannel[-T] {
  def write(x: T)
}
