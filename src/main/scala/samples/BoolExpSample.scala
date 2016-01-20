package samples

import org.victor.bool.expression.BoolExp._
import org.victor.bool.expression.Equals


/**
 * Created with IntelliJ IDEA.
 * User: Victor
 * Date: 24/11/12
 * Time: 18:13
 * To change this template use File | Settings | File Templates.
 */
object BoolExpSample extends App{

 val exp1 = And(Equals(1,1),Equals(2,1))
 printExp(exp1)

}
