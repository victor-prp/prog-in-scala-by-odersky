package org.victor.fastqueue

/**
 * @author victorp
 */
trait Queue[+T] {

  /**
   * @return  the first element of the queue
   */
  def head():T

  /**
   * @return a queue without its first element
   */
  def tail():Queue[T]

  /**
   * @return new queue with a given element appended at the end
   */
  def enqueue[E >: T](x: E):Queue[E]


  /**
   * @return current queue size
   */
  def count:Int
}
