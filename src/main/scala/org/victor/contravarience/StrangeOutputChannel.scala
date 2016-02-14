package org.victor.contravarience

/**
 * @author victorp
 */
class StrangeOutputChannel extends InMemoryOutputChannel[Int]{
  override def write(x: Int): Unit = {
    println(x*x)
    super.write(x)
  }
}
