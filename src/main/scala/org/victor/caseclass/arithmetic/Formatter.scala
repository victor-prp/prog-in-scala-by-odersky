package org.victor.caseclass.arithmetic

/**
 * @author victorp
 */
object Formatter {

  def formatWeakBiOper(op:String,r: Expr, l: Expr): String = (r,l) match {
    case (r:NoOp,l:Expr) => s"${format(r)} $op ${format(l)}"
    case (r:Expr,l:NoOp) => s"${format(r)} $op ${format(l)}"
  }

  def formatStrongBiOper(op:String,r: Expr, l: Expr): String = (r,l) match {
    case (r:NoOp,l:Op) => s"${format(r)} $op (${format(l)})"
    case (r:Op,l:NoOp) => s"(${format(r)}) $op ${format(l)}"

    case (r:NoOp,l:NoOp) => s"${format(r)} $op ${format(l)}"
    case (r:Op,l:Op) => s"(${format(r)}) $op (${format(l)})"

  }

  def format(expr:Expr):String = expr match {
    case Number(e) => e.toString
    case Var(e) => e
    case UnOp(op,e) => s"$op (${format(e)})"
    case BinOp("+",r,l) => formatWeakBiOper("+",r,l)
    case BinOp("-",r,l) => formatWeakBiOper("-",r,l)
    case BinOp("*",r,l) => formatStrongBiOper("*",r,l)
    case BinOp("/",r,l) => formatStrongBiOper("/",r,l)
    case e => throw new RuntimeException(s"expression $e is not supported by the formatter")
  }

}
