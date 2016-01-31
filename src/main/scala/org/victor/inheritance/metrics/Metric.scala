package org.victor.inheritance.metrics

/**
 * @author victorp
 */
abstract class Metric(final val creationTimestampMillis: Long) {
  def lastUpdate: Long
}
