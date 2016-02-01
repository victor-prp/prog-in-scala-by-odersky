package org.victor.inheritance.metrics


import scala.collection.concurrent.Map
import scala.compat.Platform._
import org.victor.inheritance.metrics.Counter.apply
/**
 * @author victorp
 */
object Metrics {

  val registry: Map[String, Metric] = new scala.collection.concurrent.TrieMap[String, Metric]


  def counter(name: String): Counter = {
    registry.putIfAbsent(name, Counter())
    val result = registry.get(name).get
    toCounter(result)
  }

  def gauge(name: String): Gauge = {
    registry.putIfAbsent(name, Gauge())
    val result = registry.get(name).get
    toGauge(result)
  }

  def counters: collection.Map[String, Counter] =
    registry
    .filter(counter)
    .mapValues(toCounter)

  def gauges: collection.Map[String, Gauge] =
    registry
      .filter(gauge)
      .mapValues(toGauge)


  def counter: ((String, Metric)) => Boolean = {
    (keyVal) => {
      keyVal._2.isInstanceOf[Counter]
    }
  }
  
  def toCounter(metric:Metric ):Counter = {
    metric match {
      case counter: Counter =>
        counter
      case _ => throw new RuntimeException(s" ${metric} is not a Counter");
    }
  }

  def toGauge(metric:Metric ):Gauge = {
    metric match {
      case counter: Gauge =>
        counter
      case _ => throw new RuntimeException(s" ${metric} is not a Gauge");
    }
  }

  def gauge: ((String, Metric)) => Boolean = {
    (keyVal) => {
      keyVal._2.isInstanceOf[Gauge]
    }
  }
}


