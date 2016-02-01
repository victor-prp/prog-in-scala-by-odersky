package samples
import org.victor.patternmatching._
/**
 * @author victorp
 */
object IntIntMapSample extends  App{
  /**
   * This example shows scala cannot identify the actual type at runtime
   * Since iy uses type erasure and this info is not available at runtime
   */
  val intIntMap = Map(1 -> 1)
  println(s"is intIntMap defined as Map[Int,Int]: ${isIntIntMap(intIntMap)}")

  val strStrMap = Map("str" -> "str")
  println(s"is strStrMap defined as Map[Int,Int]: ${isIntIntMap(strStrMap)}")



}
