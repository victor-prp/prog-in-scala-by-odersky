package samples

import scala.collection.mutable.Map

object MapSample extends App{
  val treasureMap = Map[Int, String]()
  treasureMap += (1 -> "Go to island.")
  treasureMap += (2 -> "Find big X on ground.")
  treasureMap += (3 -> "Dig.")


  def printKey(kayVal : (Int , String)){ println(kayVal._1)}
  def printVal(kayVal : (Int , String)){ println(kayVal._2)}
  def printKeyVal(kayVal : (Int , String)){ println(kayVal._1 + " --> "+kayVal._2)}

  treasureMap.foreach(printKeyVal)

  println(countWords("key, nothing, value, optional, key, scala, map, set key"))

  def countWords(text: String) = {
    val counts = Map.empty[String, Int]
    for (rawWord <- text.split("[ ,!.]+")) {
      val word = rawWord.toLowerCase
      val oldCount =
        if (counts.contains(word)) counts(word)
        else 0
      counts(word) = oldCount+1
    }
    counts
  }



}
