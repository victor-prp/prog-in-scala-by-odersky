package org.victor.companion

/**
 * Created with IntelliJ IDEA.
 * User: Victor
 * Date: 24/11/12
 * Time: 14:56
 * To change this template use File | Settings | File Templates.
 */
class Rocket {
  import Rocket.fuel
  private def canGoHomeAgain = fuel > 20
}

object Rocket {
  var fuel = 10
  def apply() = new Rocket()

  def chooseStrategy(rocket: Rocket) {
    if (rocket.canGoHomeAgain)
      goHome()
    else
      pickAStar()
  }
  def goHome() {println("go home")}
  def pickAStar() {println("pick a star")}
}