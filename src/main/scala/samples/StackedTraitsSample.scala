package samples

import org.victor.queue._

/**
 * Created with IntelliJ IDEA.
 * User: Victor
 * Date: 26/08/12
 * Time: 00:38
 * To change this template use File | Settings | File Templates.
 */
object StackedTraitsSample extends App{

  val queue = new ArrayBasedIntQueue
  queue.put(1)
  queue.put(2)
  println(queue)

  val queue0 = new ArrayBasedIntQueue with Printable
  queue0.put(1)
  queue0.put(2)
  println(queue0)


  val queue1 = new ArrayBasedIntQueue with Doubling with Printable
  queue1.put(1)
  queue1.put(2)
  println(queue1)


  val queue2 = new ArrayBasedIntQueue with Doubling with Printable with Incrementing
  queue2.put(1)
  queue2.put(2)
  println(queue2)

  val queue3 = new ArrayBasedIntQueue with  Incrementing with Printable with  Doubling
  queue3.put(1)
  queue3.put(2)
  println(queue3)

}
