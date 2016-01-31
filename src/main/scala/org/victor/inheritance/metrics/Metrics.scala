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
    result match {
      case counter: Counter =>
        counter
      case _ => throw new RuntimeException(s" ${name} is not a Counter");
    }
  }

  def gauge(name: String): Gauge = {
    registry.putIfAbsent(name, Gauge())
    val result = registry.get(name).get
    result match {
      case gauge: Gauge =>
        gauge
      case _ => throw new RuntimeException(s" ${name} is not a Gauge");
    }
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
    metric.asInstanceOf[Counter]
  }

  def toGauge(metric:Metric ):Gauge = {
    metric.asInstanceOf[Gauge]
  }

  def gauge: ((String, Metric)) => Boolean = {
    (keyVal) => {
      keyVal._2.isInstanceOf[Gauge]
    }
  }
}


