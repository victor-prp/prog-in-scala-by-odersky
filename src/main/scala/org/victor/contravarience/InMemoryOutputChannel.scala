package org.victor.contravarience

/**
 * @author victorp
 */
class InMemoryOutputChannel[-T] extends OutputChannel[T]{
  val buffer = List()

  override def write(x: T): Unit = {
    x :: buffer
  }
}
