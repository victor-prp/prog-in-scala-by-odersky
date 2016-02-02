package samples
import org.victor.caseclass.arithmetic.Formatter._
import org.victor.caseclass.arithmetic._

/**
 * @author victorp
 */
object ArithmeticFormatterSample extends App{

  //(((x) + (y)) * (z)) + (1.0)
  val exp =
    BinOp("+",
      BinOp("*",
        BinOp("+",  Var("x"), Var("y")),
        Var("z")),
      Number(1))

  println(format(exp))

}
