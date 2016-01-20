package org.victor.companion.condition.impl

import org.victor.companion.condition.Condition
import collection.immutable.Range

/**
 * Created with IntelliJ IDEA.
 * User: Victor
 * Date: 24/11/12
 * Time: 15:14
 * To change this template use File | Settings | File Templates.
 */
class GeoCondition(param: Int) extends Condition(param){

}

object GeoCondition{
  def evaluate(geo: GeoCondition) = {
    geo.getParams() == 2
  }
}
