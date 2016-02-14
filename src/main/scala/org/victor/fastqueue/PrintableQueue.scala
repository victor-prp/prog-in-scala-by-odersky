package org.victor.fastqueue

/**
 * @author victorp
 */
trait PrintableQueue[T] extends Queue[T]{

  override def toString = {
    var toPrint = List[T]()
    var that:Queue[T] = this
    while(that.count > 0){
      toPrint = that.head::toPrint
      that = that.tail()
    }
    s"PrintableQueue($toPrint)"
  }
}
