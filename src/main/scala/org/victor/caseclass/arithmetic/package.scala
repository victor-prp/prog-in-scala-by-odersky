package org.victor.caseclass

/**
 * @author victorp
 */
package object arithmetic {

  def simplifyTop(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) => e // Double negation
    case BinOp("+", e, Number(0)) => e // Adding zero
    case BinOp("*", e, Number(1)) => e // Multiplying by one
    case _ => expr
  }


  def simplifyAll(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) => simplifyAll(e) // is its own inverse
    case BinOp("+", e, Number(0)) => simplifyAll(e) // ‘0’ is a neutral element for ‘+’
    case BinOp("*", e, Number(1)) => simplifyAll(e) // ‘1’ is a neutral element for ‘*’
    case UnOp(op, e) => UnOp(op, simplifyAll(e))
    case BinOp(op, l, r) => BinOp(op, simplifyAll(l), simplifyAll(r))
    case _ => expr
  }

}
