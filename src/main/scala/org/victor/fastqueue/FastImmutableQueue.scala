package org.victor.fastqueue

/**
 * @author victorp
 */
class FastImmutableQueue[T] private(
                private val leading: List[T],
                private val trailing: List[T]
                ) extends Queue[T] with PrintableQueue[T] {
  
  private def mirror = {
    if (leading.isEmpty)
      new FastImmutableQueue(trailing.reverse, Nil)
    else
      this
  }
  
  def head() = {
    mirror.leading.head
  }
  
  def tail() = {
    val q = mirror
    new FastImmutableQueue(q.leading.tail, q.trailing)
  }
  
  def enqueue(x: T) = {
    new FastImmutableQueue(leading, x :: trailing)
  }

  /**
   * @return current queue size
   */
  override def count: Int = {
    leading.length + trailing.length
  }
}

object FastImmutableQueue{
  def apply[T]() = {
    new FastImmutableQueue[T](List(),List())
  }

}