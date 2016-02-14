package samples

import org.victor.fastqueue.{Queue, FastImmutableQueue}

/**
 * @author victorp
 */
object FastImmutableQueueSample extends App{



  //Does not compile - private constructor
  //val q1 = new FastImmutableQueue()


  val q = FastImmutableQueue[Int]()

  println(q)
  val q2 =  q.enqueue(3).enqueue(5).enqueue(6)
  println(q2)

  val q3 = q2.tail().tail()
  println(q3)


  //Does not compile - the type is not specified
 //val noTypeQueue:Queue =  FastImmutableQueue()

  //Compiles since the type is String
  val stringTypeQueue:Queue[String] = FastImmutableQueue()
  var genericQ:Queue[AnyRef] = FastImmutableQueue()

  genericQ = stringTypeQueue

  println(s" covariant queue: ${stringTypeQueue.enqueue(3).enqueue("abc")}")
}
