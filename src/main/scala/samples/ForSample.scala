package samples


object ForSample  extends App{
  val names = List("Vic","Moran","Barak","Vasia")

  val vNames =
    for {
      name <- names
      if name startsWith ("V")
    }yield name

  println(vNames)
}