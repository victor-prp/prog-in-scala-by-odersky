package org.victor.caseclass.arithmetic

/**
 * @author victorp
 */
abstract class Expr
abstract class NoOp extends Expr
abstract class Op extends Expr
case class Var(name: String) extends NoOp
case class Number(num: Double) extends NoOp
case class UnOp(operator: String, arg: Expr) extends Op
case class BinOp(operator: String, left: Expr, right: Expr) extends Op
