package org.victor.queue




abstract class IntQueue {
  def get(): Int
  def put(x: Int)
  def foreach(f: Int => Unit)
}