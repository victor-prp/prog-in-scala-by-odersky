package samples

import org.victor.companion.condition.impl.GeoCondition

/**
 * Created with IntelliJ IDEA.
 * User: Victor
 * Date: 24/11/12
 * Time: 15:28
 * To change this template use File | Settings | File Templates.
 */
object ConditionSample extends App{
  val geoCondition = new GeoCondition(2);
  println(GeoCondition.evaluate(geoCondition))
}

