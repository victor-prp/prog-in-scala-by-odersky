package org.victor.closures



object Closures {
  def makeIncreaser(more: Int) = (x: Int) => x + more
}
