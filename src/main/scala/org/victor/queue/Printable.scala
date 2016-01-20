package org.victor.queue

/**
 * Created with IntelliJ IDEA.
 * User: Victor
 * Date: 26/08/12
 * Time: 00:47
 * To change this template use File | Settings | File Templates.
 */
trait Printable extends IntQueue{
  override def  toString():String = {
     val result = new StringBuilder("IntQueue[ ")

    def resultBuilder (f: Int) = {result.append(f+" , ")}
    foreach(resultBuilder)
    result.append("END ]")
    return result.toString()
  }
}
