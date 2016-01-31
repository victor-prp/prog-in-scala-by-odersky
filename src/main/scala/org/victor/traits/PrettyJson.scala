package org.victor.traits

import play.api.libs.json.Json

/**
 * This trait shows how to define rich interface using trait
 * 'toPrettyJson:String' method enriches any class that has implemented 'toJson:String'
 *
 * @author victorp
 */
trait PrettyJson {

  /**
   * By defining abstract 'toJson:String' method here we actually define that trait to be used only with classes
   * which define and implemenet 'toJson:String' method
   */
  def toJson:String


  /**
   * toPrettyJson uses 'toJson:String' in order to enrich it with additional method: 'toPrettyJson'
   */
  def toPrettyJson:String = {
    val theJson = Json.parse(toJson)
    Json.prettyPrint(theJson) 
  }

}
