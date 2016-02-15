package samples


object ForSample extends App {
    val names = List("Vic","Moran","Barak","Vasia")

    val vNames =
      for {
        name <- names
        if name startsWith ("V")
      }yield name

    println(vNames)


  val pairs1 =
    for {
      x <- List(1, 2)
      y <- List("one", "two", "three")
    } yield (x, y)

  println(pairs1)

  val pairs2 =
    List(1, 2).flatMap(x => for {
      y <- List("one", "two", "three")
    } yield (x, y)
    )

  println(pairs2)

  val pairs3 =
    List(1, 2).flatMap(
      x => List("one", "two", "three")
        .map(y => (x, y))
    )

  println(pairs3)

}