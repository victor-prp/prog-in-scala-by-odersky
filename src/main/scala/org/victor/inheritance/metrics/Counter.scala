package org.victor.inheritance.metrics

import scala.compat.Platform._
import java.util.concurrent.atomic.AtomicLong

/**
 * @author victorp
 */
class Counter(creationTimestampMillis:Long) extends Metric(creationTimestampMillis){

  /**
   * Here we override function 'Metric::lastUpdate' with variable 'lastUpdate'
   * which is transparent to the user
   */
  var lastUpdate: Long = creationTimestampMillis

  val value:AtomicLong = new AtomicLong(0)

  def inc():Unit = {
    value.incrementAndGet()
    lastUpdate = currentTime
  }

  override def toString = s"${value.get()}"

}

object Counter {
  def apply():Counter = new Counter(currentTime)
  def apply(creationTimestampMillis:Long):Counter = new Counter(creationTimestampMillis)

}



