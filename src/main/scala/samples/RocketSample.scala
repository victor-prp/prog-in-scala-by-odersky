package samples

import org.victor.companion.Rocket

/**
 * Created with IntelliJ IDEA.
 * User: Victor
 * Date: 24/11/12
 * Time: 14:58
 * To change this template use File | Settings | File Templates.
 */
object RocketSample extends App{

  val rocket = Rocket()
  Rocket.chooseStrategy(rocket)

  Rocket.fuel = 25
  Rocket.chooseStrategy(rocket)



}
