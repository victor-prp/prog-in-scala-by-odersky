package samples

import org.victor.classandobject.ChecksumAccumulator

/**
 * Created by victor on 04/01/16.
 */
object ChecksumAccumulatorSample extends App{

  println (ChecksumAccumulator.calculate("abc"))
  println (ChecksumAccumulator.calculate("abc"))
  println (ChecksumAccumulator.calculate("def"))

}
