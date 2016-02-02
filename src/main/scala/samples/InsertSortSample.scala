package samples
import org.victor.lists.patternmatching.InsertSort._

/**
 * @author victorp
 */
object InsertSortSample extends App{

  val numbers = List(44,2,1,-8,99)

  println(s"sorted using pattern matching ${isort(numbers)}")

}
