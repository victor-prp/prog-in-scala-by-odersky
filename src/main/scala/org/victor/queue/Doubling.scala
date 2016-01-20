package org.victor.queue

/**
 * Created with IntelliJ IDEA.
 * User: Victor
 * Date: 26/08/12
 * Time: 00:32
 * To change this template use File | Settings | File Templates.
 */
trait Doubling extends IntQueue{
  abstract override def put(x: Int) { super.put(x*2) }
}
