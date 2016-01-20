package samples

import org.victor.math.Rational

/**
 * Created with IntelliJ IDEA.
 * User: Victor
 * Date: 25/08/12
 * Time: 17:01
 * To change this template use File | Settings | File Templates.
 */
object OrderedRationalSample extends App{
  println(new Rational(10,5) >= new Rational(10,6))
  println(new Rational(10,5) > new Rational(10,2))
  println(new Rational(10,5) < new Rational(11,6))


}
