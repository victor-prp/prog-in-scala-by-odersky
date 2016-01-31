package samples

import org.victor.inheritance.metrics.{Counter, Metrics}
import scala.compat.Platform._


/**
 * @author victorp
 */
object MetricsSample extends App{

  val myGauge  = Metrics.gauge("g1")
  myGauge.update(25)

  //will not compile since all creation methods are protected
  //val myGauge1  = new Gauge(currentTime)
  //val myGauge2  = Gauge

  val myCounter = Metrics.counter("c1")
  myCounter.inc()
  myCounter.inc()

  //the following compiles since all creation methods are public
  val myCounter1 = new Counter(currentTime)
  val myCounter2 = Counter

  println(s"all counters created via Metrics: ${Metrics.counters}")
  println(s"all gauges created via Metrics: ${Metrics.gauges}")

  //Will throw exception since g1 was already defined as a gauge
  try {
    val g1Counter: Counter = Metrics.counter("g1")
    println(s"Unexpected behavior, g1 is not a counter : $g1Counter")
  }catch {
     case re: RuntimeException => println(s"Exception is thrown as expected: ${re.getMessage}")
  }



}
