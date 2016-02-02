package org.victor.lists

import com.sun.javafx.collections.transformation.SortedList

/**
 * @author victorp
 */
package object patternmatching {

  def isort(list : List[Int]):List[Int] = list match {
    case List() => List.empty
    case first::tail => insert(first,sorted(tail))
  }


  private def insert(element: Int, sortedList: List[Int]): List[Int] = sortedList match {
    case List() => List(element)
    case first::tail if element < first => element::sortedList
    case first::tail  => first::insert(element,tail)
  }

  //alias for isort
  private val sorted:List[Int]=>List[Int] = isort


}
