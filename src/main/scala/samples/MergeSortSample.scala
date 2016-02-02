package samples

import org.victor.lists.patternmatching.MergeSort._

/**
 * @author victorp
 */
object MergeSortSample extends App{

  val numbers = List(44,2,1,-8,99)

  println(s"sorted using pattern matching ${mergeSort(numbers)}")

}
