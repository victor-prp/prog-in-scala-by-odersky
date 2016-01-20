package samples

import javax.annotation.PostConstruct


@PostConstruct
object TupleSample extends App{
  var bigInt = BigInt(123456789)
  val tuple = (99, "Luftballons",bigInt)
  println(tuple._1)
  println(tuple._2)
  println(tuple._3)
}
