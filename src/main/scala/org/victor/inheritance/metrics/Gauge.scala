package org.victor.inheritance.metrics

import scala.compat.Platform._

import java.util.concurrent.atomic.AtomicLong

/**
 * @author victorp
 */
protected class Gauge(creationTimestampMillis:Long) extends Metric(creationTimestampMillis){

  /**
   * Here we override function 'Metric::lastUpdate' with val 'lastUpdate'
   * which is transparent to the user
   */
  var lastUpdate: Long = creationTimestampMillis

  val value:AtomicLong = new AtomicLong(0)

  def update(newValue:Long):Unit = {
    value.set(newValue)
    lastUpdate = currentTime
  }

  override def toString = s"${value.get()}"


}

protected object Gauge {
  def apply() = new Gauge(currentTime)
  def apply(creationTimestampMillis:Long) = new Gauge(creationTimestampMillis)
}


