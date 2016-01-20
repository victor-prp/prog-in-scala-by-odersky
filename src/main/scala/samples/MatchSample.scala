package samples

/**
 * Created by victor on 05/01/16.
 */
object MatchSample extends App{

  val ingredients = List("salt","chips","eggs","sugar")


  val friends =
    (for {
      ingredient <- ingredients
    }yield ingredient -> friendOf(ingredient)) toMap

  println("friends  " +friends)

  def friendOf(ingredient:String):String={
      ingredient match {
        case "salt" => "pepper"
        case "chips" => "salsa"
        case "eggs" => "bacon"
        case _ => ":(  "
      }
  }


}
