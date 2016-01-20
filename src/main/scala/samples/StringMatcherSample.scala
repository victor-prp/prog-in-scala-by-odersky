package samples

import org.victor.functions.StringMatcher


object StringMatcherSample extends App{
  val abcList = "abc" :: "ab" :: "abcd" :: "abcdefgd" :: Nil

  var result = StringMatcher.strEnding("abc",abcList)
  println("str ends with 'abc' result: "+result)

  result = StringMatcher.strStartMiddleEnd("ab","bc","d",abcList)
  println("str ends/middle/ends with 'ab/bc/d' result: "+result)
}