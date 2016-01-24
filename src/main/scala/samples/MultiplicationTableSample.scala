package samples

import java.util

/**
 * Created by victor on 05/01/16.
 */
object MultiplicationTableSample extends App {

  val staticTable = List("  1", "  2", "  3", "\n",
    "  2", "  4", "  6", "\n",
    "  3", "  6", "  9", "\n")


  printTable(staticTable)

  printTable(createMultiTableOf(10))

  def prettyStringFrom(num: Int): String = {
    val str = "    " + num
    val toRemove = str.length - 4;
    str.substring(toRemove)
  }


  def createRow(rowNumber: Int, size: Int): List[String] = {
    val row =
      for {
        item <- 1 to size
        result = rowNumber * item
      } yield prettyStringFrom(result)

    val rowAsList = row.toList
    rowAsList ::: List("\n")
  }

  def createMultiTableOf(size: Int): List[String] = {
    val allRows =
      for {
        rowNumber <- 1 to size
      } yield createRow(rowNumber, size)

    allRows.foldLeft(List.empty[String]) {
      (prev, curr) => prev ::: curr
    }
  }


  def printTable(table: List[String]) {
    for {
      item <- table
    } print(item)
  }
}
