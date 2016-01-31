package org.victor.traits

import com.google.gson.{JsonObject, JsonElement, GsonBuilder, Gson}
import play.api.libs.json.Json


/**
 * @author victorp
 */
class Customer (val name:String, val age:Int){

  val gson:Gson = new Gson()

  def toJson:String = {
    val jsonObject = new JsonObject
    jsonObject.addProperty("name",name)
    jsonObject.addProperty("age",age)
    gson.toJson(jsonObject)
  }

}
