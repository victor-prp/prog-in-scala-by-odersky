package org.victor.functions

/**
 * @author victorp
 */
object FunWithDefaults {

  def aggregate(a:Int=0,b:Int=0,c:Int=0) ={
    a + b + c
  }

  def aggr(a:Int=0)(b:Int=0)(c:Int=0) ={
    a + b + c
  }
}
