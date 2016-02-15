package samples

import org.victor.forrevisited.Person
import org.victor.forrevisited.PersonUtil._

/**
 * @author victorp
 */
object PersonUtilSample extends App{

  val moshe = Person("Moshe",true)
  val slava = Person("Slava",true)
  val elena = Person("Elena",false,moshe,slava)

  val persons = List(moshe,slava,elena)


  println(persons)

  println(findMotherSonPairsV1(persons))
  println(findMotherSonPairsV2(persons))
  println(findMotherSonPairsV3(persons))




}
