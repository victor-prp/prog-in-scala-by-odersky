package samples


import org.victor.caseclass.arithmetic.{Number, BinOp}

/**
 * @author victorp
 */
object MorePatternsSample extends App{
 val exp = new BinOp("*", Number(5), Number(1))

 // the following defines 3 new vals : op, left and right
 val BinOp(op, left, right) = exp


 println(s"op: ${op}, left: ${left}, right: ${right}")


}
