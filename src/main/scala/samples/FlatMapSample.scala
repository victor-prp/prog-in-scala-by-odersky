package samples

//import scala.Option.option2Iterable

/**
 * @author victorp
 */
object FlatMapSample extends App{


  /**
   * Here we show that Option is implicitly converted to List and thus its result can be used by flatMap
   */
  val oprStrList:List[Option[String]] = List(Option("A"),Option("b"),Option.empty)
  println(oprStrList.map(toLowerCase))
  println(oprStrList.flatMap(toLowerCase))

  def toLowerCase(str:Option[String]):Option[String] = { str match {
    case Some(s) => Option(s.toLowerCase)
    case _ => None
    }
  }


  println(oprStrList.flatMap(toLower))

  def toLower(str:Option[String]):Option[String] = {
    str.flatMap( s => Some(s.toLowerCase))
  }


  val strList:List[String] = List("0","25","abs","-1","")
  println(strList.map(extractNumber))//by using map we have to define mapping for each string
  println(strList.flatMap(extractOptNumber)) //by using flatMap we can easily filter non interesting values


  def extractNumber(str:String):Int = {
    extractOptNumber(str) match {
      case Some(num) => num
      case _ => 0
    }
  }

  def extractOptNumber(str:String):Option[Int] = {
    try {
      Some(str.toInt)
    }catch {
      case e: Throwable => None
    }
  }


  /**
   * Here we use map and flatMap provided by the Option itself
   */
  println(intToStr(Some(2)))
  println(intToStr(Some(-10)))
  println(intToStr(None))

  //map will enforce mapping for Some value
  def intToStr(optInt:Option[Int]) = {
    optInt.map(r => s"Number: ${r.toString}")
  }


  println(positiveIntToStr(Some(2)))
  println(positiveIntToStr(Some(-10)))
  println(positiveIntToStr(None))


  //flatMap will enforce mapping for Some value but also allows filtering by returning None!!!!
  def positiveIntToStr(optInt:Option[Int]) = {
    optInt.flatMap(number => {
      if (number>0) {
        Some(s"Number: ${number.toString}")
      }else{
        None
      }
    })
  }


  /**
   * Here we show how Option can be combined within the 'for' comprehension
   * listAllEmails takes Iterable can be Option or any other Iterable (as List)
   */

  class User(val id:Int, val email:Option[String] = None)

  val user1:Option[User] = Some(new User(1))
  val user2:Option[User] = Some(new User(2,Some("user2@email.com")))
  val user3:Option[User] = Some(new User(2,Some("user3@email.com")))
  val user4:Option[User] = None



  println(listAllEmails(user1))
  println(listAllEmails(user2))

  val allUsers:List[User] = List(user1,user2,user3,user4).flatMap(opt => opt)
  println(listAllEmails(allUsers))

  def listAllEmails(users:Iterable[User]) = {
    for {
      user <- users
      email <- user.email
    }yield email
  }


}
