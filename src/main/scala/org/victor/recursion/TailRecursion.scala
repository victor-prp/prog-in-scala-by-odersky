package org.victor.recursion

import scala.annotation.tailrec
import scala.math._
/**
 * @author victorp
 */
class TailRecursion(value:Double = random,
                    accuracy:Double = 0.00001 //the accuracy defines how close must
                                              //the approximation be to the given value
                     ) {
  require(value > 0, "'value' must be in range (0,1)")
  require(value < 1, "'value' must be in range (0,1)")
  require(accuracy > 0, "'accuracy' must be in range (0,1)")
  require(accuracy < 1, "'accuracy' must be in range (0,1)")

  def isGoodEnough(guess: Double): Boolean = abs(value - guess) < accuracy

  @tailrec
  final //in case it is not finale nor private it cannot be marked treated as tailrec
  def approximate(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else approximate(improve(guess))


  def improve(guess: Double): Double = random

  def approximateLoop(initialGuess: Double): Double = {
    var guess = initialGuess
    while (!isGoodEnough(guess))
      guess = improve(guess)
    guess
  }

}

object TailRecursion{
  def apply() = new TailRecursion()
}
