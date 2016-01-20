package samples

import org.victor.closures.Closures

/**
 * Created with IntelliJ IDEA.
 * User: Victor
 * Date: 10/08/12
 * Time: 15:08
 * To change this template use File | Settings | File Templates.
 */

object ClosureSample extends App{
  val plus_ten = Closures.makeIncreaser(10)
  val result = plus_ten(20)
  println(result)
}
