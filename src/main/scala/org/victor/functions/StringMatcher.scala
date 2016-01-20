package org.victor.functions



object StringMatcher {
  private def strMatching( matcher: String => Boolean ,target: List[String] ) =
    for (str <- target;
         if matcher(str))
    yield str

  def strEnding(query: String, target: List[String]) =
    strMatching(_.endsWith(query) ,target)

  private def matchStartMiddleEnd(prefix: String,middle : String, suffix: String) =  (targetStr: String) => {
    targetStr.startsWith(prefix) && targetStr.endsWith(suffix) && targetStr.contains(middle)
  }

  def strStartMiddleEnd(prefix: String,middle : String, suffix: String, target: List[String]) =  {
    strMatching(matchStartMiddleEnd(suffix = suffix,middle = middle, prefix = prefix), target)
  }
}
