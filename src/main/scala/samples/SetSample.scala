package samples

import scala.collection.mutable.Set


object SetSample extends App{
  var movieSet = Set("Hitch", "Poltergeist")
  movieSet += "Shrek"
  println(movieSet)
}
