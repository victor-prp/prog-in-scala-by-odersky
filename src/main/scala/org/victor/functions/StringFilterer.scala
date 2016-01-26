package org.victor.functions



class StringFilterer(val target: List[String]){
  def filter(matcher: String => Boolean ) = StringFilterer.filter(matcher,target)

}


object StringFilterer {
  def apply(target: List[String]) = new StringFilterer(target)


  private def filter( matcher: String => Boolean ,target: List[String] ) =
    for (str <- target
         if matcher(str))
    yield str



}
