package org.victor.ofer.bollean.logic

/**
 * Created with IntelliJ IDEA.
 * User: Victor
 * Date: 25/11/12
 * Time: 21:29
 * To change this template use File | Settings | File Templates.
 */

sealed trait Clause[U] {

  def apply(user:U):Boolean = this match {
    case Atom(p) => p(user)
    case And(a,b) => a(user) && b(user)
    case Or(a,b) => a(user) || b(user)
    case Not(a) => !a(user)
  }

  class Ops[U](lhs:Clause[U]) {

    def &&(rhs:Clause[U]) = And(lhs,rhs)
    def ||(rhs:Clause[U]) = Or(lhs,rhs)
    def unary_!() = Not(lhs)

  }

  implicit def mkOps[U](c:Clause[U]) =  new Ops(c)

}


case class And[U](c1:Clause[U],c2:Clause[U]) extends Clause[U]

case class Or[U](c1:Clause[U],cs:Clause[U]) extends Clause[U]

case class Not[U](c:Clause[U]) extends Clause[U]

case class Atom[U](p:U => Boolean) extends Clause[U]
