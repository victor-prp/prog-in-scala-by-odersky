package samples

import org.victor.anyvalref.{ImplicitRef, ExplicitRef}

/**
 * @author victorp
 */
object AnyValRefSample extends App{
  /**
   * Lets see how subclass of AnyRef behaves
   */
  val expRef1:ExplicitRef = new ExplicitRef(1)
  val expRef2:ExplicitRef = new ExplicitRef(1)

  println("================ExplicitRef behavior================")
  println(s" expRef1 == expRef2: ${expRef1 == expRef2} ")
  println(s" expRef1 equals expRef2: ${expRef1 equals expRef2} ")
  println(s" expRef1 eq expRef2: ${expRef1 eq expRef2} ")
  println(s" expRef1 ne expRef2: ${expRef1 ne expRef2} ")
  println("====================================================")



  /**
   * Lets show the same behaviour even if a class  was not explicitly defined as AnyRef
   * In fast it still (implicitly) inherits from AnyRef
   */
  val implicitRef1:ImplicitRef = new ImplicitRef(1)
  val implicitRef2:ImplicitRef = new ImplicitRef(1)

  println
  println
  println
  println("================ImplicitRef behavior================")
  println(s" implicitRef1 == implicitRef2: ${implicitRef1 == implicitRef2} ")
  println(s" implicitRef1 equals implicitRef2: ${implicitRef1 equals implicitRef2} ")
  println(s" implicitRef1 eq implicitRef2: ${implicitRef1 eq implicitRef2} ")
  println(s" implicitRef1 ne implicitRef2: ${implicitRef1 ne implicitRef2} ")
  println("====================================================")

}
