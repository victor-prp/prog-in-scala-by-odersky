package samples
import org.victor.caseclass.arithmetic._

/**
 * Lets see how case classes work
 * @author victorp
 */
object ArithmeticSample extends App{

  /**
   * Factory methods are defined automatically by compiler
   */
  val v = Var("X")
  val plusOne = BinOp("+", Number(1), v)

  /**
   * Arguments in the param list are all defined as val
    */
  println(s"v.name = ${v.name}")
  println(s"plusOne.left = ${plusOne.left}")


  /**
   * Default impl of 'toString', 'hashCode' and 'equals'
   */
  println(s"plusOne = ${plusOne}")


  /**
   * copy method is added
   */
  val minusOne = plusOne.copy(operator = "-")
  println(s"minusOne = ${minusOne}")


  /**
   * Simple pattern matching
   */
  val onePlusZero = BinOp("+", Number(1), Number(0))
  println(s"onePlusZero: $onePlusZero")

  val onePlusZeroSimplified = simplifyTop(BinOp("+", Number(1), Number(0)))
  println(s"simplified onePlusZero: $onePlusZeroSimplified")


  /**
   * Recursive pattern matching
   */
  val onePlusZeroPlusZero = BinOp("+", BinOp("+", Number(1), Number(0)), Number(0))
  println(s"deeply simplified onePlusZeroPlusZero: ${simplifyDeep(onePlusZeroPlusZero)}")

  //this call will not be simplified since 'simplifyDeep' simplifies zero on the right side only
  val zeroPlusOne = BinOp("+", Number(0), Number(1))
  println(s"deeply simplified zeroPlusOne: ${simplifyDeep(zeroPlusOne)}")


  //this call will simplify it since it does it on all sides
  println(s"totally simplified zeroPlusOne: ${simplifyAll(zeroPlusOne)}")


  val zeroPlusZeroPlusOne = BinOp("+", BinOp("+", Number(0), Number(0)), Number(1))

  println(s"deeply simplified zeroPlusZeroPlusOne: ${simplifyDeep(zeroPlusZeroPlusOne)}")
  println(s"totally simplified zeroPlusZeroPlusOne: ${simplifyAll(zeroPlusZeroPlusOne)}")

  val complicatedExp = BinOp("+", BinOp("+", Number(0), Number(0)),
                                  BinOp("*",Number(1),
                                            UnOp("-",Number(10))))

  println(s"totally simplified complicatedExp: ${simplifyAll(complicatedExp)}")

}
