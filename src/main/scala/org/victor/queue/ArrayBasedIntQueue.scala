package org.victor.queue

import collection.mutable.ArrayBuffer

/**
 * Created with IntelliJ IDEA.
 * User: Victor
 * Date: 26/08/12
 * Time: 00:36
 * To change this template use File | Settings | File Templates.
 */
class ArrayBasedIntQueue extends IntQueue{
  private val buf = new ArrayBuffer[Int]

  def get() = buf.remove(0)

  def put(x: Int) { buf += x }

  def foreach(f: (Int) => Unit) {
    buf.foreach(f)
  }
}
