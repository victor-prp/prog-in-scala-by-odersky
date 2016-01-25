package samples

import org.victor.functions.FunWithDefaults._

/**
 * @author victorp
 */
object FunWithDefaultsSample extends App{
  println(aggregate(1))
  println(aggregate(1,2))
  println(aggregate(1,2,3))


  println(aggr(1)()())

}
