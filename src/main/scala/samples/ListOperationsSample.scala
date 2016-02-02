package samples

/**
 * @author victorp
 */
object ListOperationsSample extends App{

  println(s"List(1,2,3) :: List(4,5) ${List(1,2,3)::List(4,5)}")
  println(s"List(1,2,3) ::: List(4,5) ${List(1,2,3):::List(4,5)}")

  println(s"""List(1,2,3) zip List("a","b","c") ${List(1,2,3) zip List("a","b","c")}""")

  val pairsList = List( List(1,"2"), List(3,"4"))
  println(s"""List( (1,2), (3,4)).flatten) ${pairsList.flatten}""")

  //Does not compile
  //val flattenedList:List[String] = pairsList.flatten

  val flattenedList:List[Any] = pairsList.flatten

}
