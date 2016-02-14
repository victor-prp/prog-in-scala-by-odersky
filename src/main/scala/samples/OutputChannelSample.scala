package samples

import org.victor.contravarience._
/**
 * @author victorp
 */
object OutputChannelSample extends App{

  class Base{  }
  class Derived(val v:Int) extends Base{}



  var ch1 = new InMemoryOutputChannel[Base]()
  var ch2 = new InMemoryOutputChannel[Derived]()

  ch2 = ch1

  ch1.write(new Base)
  ch2.write(new Derived(1))


  //Does not compile - InMemoryOutputChannel is not covariant but contravariant to the type parameter
  //ch1 = ch2
}
