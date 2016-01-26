package samples

import org.victor.functions.StringFilterer


object StringFiltererSample extends App{

  val filterer = StringFilterer(    "simple lambda is cool"
                                ::  "short lambda is better"
                                ::  "partial application is wonderful"
                                ::  "currying is very impressive"
                                ::  "closure is useful only when it is closed"
                                ::  "calling a simple function is boring"
                                ::  Nil)

  println("simple lambda: "+filterer.filter {
    str => str.contains("simple lambda")
  })

  println("short lambda: "+filterer.filter{
    _.contains("short lambda")
  })

  println("partial application: "+filterer.filter( contains("partial application",_)))

  println("currying:"+filterer.filter( curryingContains("currying")))

  println("closure:"+filterer.filter( closureContains("closure")))

  println("boring:"+filterer.filter( containsBoring ))





  def contains(query:String, target:String) = target.contains(query)

  def curryingContains(query:String)( target:String) = target.contains(query)

  def closureContains(query:String) = (target:String) => target.contains(query)


  def containsBoring(target:String) = target.contains("boring")


}