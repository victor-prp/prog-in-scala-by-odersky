package samples
import org.victor.mutables.MutableTime
/**
 * @author victorp
 */
object MutableTimeSample extends App{
   val mutableTime = new MutableTime(10,2)

  println(mutableTime)

  mutableTime.hour = 11

  println(mutableTime)

  mutableTime.hour_= (11)

  println(mutableTime)

}
