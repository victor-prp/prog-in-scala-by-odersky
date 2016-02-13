package samples

import org.victor.caseclass.arithmetic.{Expr, Var, Number}

/**
 * @author victorp
 */
object CovariantListSample extends App{

  val numbers:List[Number] = List(Number(1), Number(2))
  val vars:List[Var] = List(Var("N"), Var("M"))


  //Here we see how easily number and vars can be concatenated and assigned to more general list
  //As opposite to Java where Collections are NOT covariant
  val expressions:List[Expr] = numbers:::vars


  println(expressions)

  //This code works since List() is List[Nothing]
  //Nothing extends every
  val xs: List[String] = List()
}
