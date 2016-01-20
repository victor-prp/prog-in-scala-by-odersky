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

}
