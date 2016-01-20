package org.victor.companion.condition

/**
 * Created with IntelliJ IDEA.
 * User: Victor
 * Date: 24/11/12
 * Time: 15:08
 * To change this template use File | Settings | File Templates.
 */
class Condition(parameters: Any) {
  def  getParams()  = { this.parameters }
}

object Condition{
  def evaluate(params: Any){false}
}


