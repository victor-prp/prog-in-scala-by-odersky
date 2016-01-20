package samples

import org.victor.ofer.bollean.logic._

/**
 * Created with IntelliJ IDEA.
 * User: Victor
 * Date: 25/11/12
 * Time: 21:34
 * To change this template use File | Settings | File Templates.
 */
object OferClauseSample  extends App{
  case class Geo(country:String,city:String)



  class User(age:Int, name:String) {
    def theAge() = { this.age }
    def theName() = { this.name }

  }

  object User{
    def apply(age:Int, name:String) = new User(age,name)
  }

  val user = User(17,"Sergo")

  val  c :Clause[User] = Not(Or(Atom(_.theAge() == "Ofer"),Atom(_.theAge > 18)))

  println(c.apply(user))

}



