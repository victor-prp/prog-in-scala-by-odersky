package samples

/**
 * @author victorp
 */
object ForPatternSample extends App{
  val results = List(Option("apple"), Option.empty, Option("orange"))

  //Here we see that scala discards values that does not match the pattern
  println("Real results by for loop with pattern matching")
  for (Some(realResult) <- results){
    println(realResult)
  }

  println("====================================")



  println("Real results by explicit filtering ")
  //the following code equivalent to the above 'for' loop
  results
    .filter(isReal)
    .foreach(real => println(real.get))


  def isReal( opt:Option[Any]) =  opt match {
    case Some(_) => true
    case _ => false
  }
}
