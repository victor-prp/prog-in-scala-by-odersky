package org.victor.bool.expression
import org.victor.bool.expression.BoolExp._

/**
 * Created with IntelliJ IDEA.
 * User: Victor
 * Date: 24/11/12
 * Time: 18:09
 * To change this template use File | Settings | File Templates.
 */
abstract class BoolExp {

}


object BoolExp {
  case class Condition(params: Any) extends BoolExp
  case class And(left: BoolExp, right: BoolExp) extends BoolExp
  case class Or(left: BoolExp, right: BoolExp) extends BoolExp
  case class Not(exp: BoolExp) extends BoolExp

  def printExp(boolExp: BoolExp):Unit = {
    boolExp match {
      case And(e1,e2) => print(" ("); printExp(e1); print(" && ");  printExp(e2); print(") ");
      case Or(e1,e2) => print(" ("); printExp(e1); print(" || ");  printExp(e2); print(") ");
      case Not(e) => print(" ("); print("!");  print(e); print(") ");
      case e => print(e)
    }

  }
  def simplifyTop(boolExp: BoolExp): BoolExp = {
    boolExp match {
      case Condition(_) => boolExp
      case And(e1, Not(e2))  => False
    }
  }
}

object True extends BoolExp
object False extends BoolExp

class Equals(param1:Any, param2: Any) extends Condition(param1) {
  override def toString = {
    param1 + " == " +  param2
  }
}

object Equals{
  def apply(param1:Any, param2: Any) = {
    new Equals(param1,param2)
  }
}




