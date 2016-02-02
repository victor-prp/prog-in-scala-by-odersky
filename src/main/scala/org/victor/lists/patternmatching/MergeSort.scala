package org.victor.lists.patternmatching

import scala.collection.generic.SeqFactory
import scala.collection.immutable.::

/**
 * @author victorp
 */
object MergeSort {

  def mergeSort(list:List[Int]) = {
    _mergeSort(list,list.length)
  }

  private def _merge(leftSorted: List[Int], rightSorted: List[Int]): List[Int] = (leftSorted,rightSorted) match {
    case (List(),_) => rightSorted
    case (_,List()) => leftSorted
    case (leftFirst::leftTail,rightFirst::rightTail) if leftFirst < rightFirst => leftFirst::_merge(leftTail,rightSorted)
    case (_,rightFirst::rightTail) =>  rightFirst::_merge(leftSorted,rightTail)
  }

  private def _mergeSort(list:List[Int], length:Int):List[Int] = list match {
    case List() => List.empty
    case first::Nil => list
    case _ =>
      val leftLength:Int = length/2
      val rightLength = length - leftLength
      val (leftList,rightList) = list.splitAt(leftLength)
      _merge(_mergeSort(leftList,leftLength),
             _mergeSort(rightList,rightLength))
  }

}
