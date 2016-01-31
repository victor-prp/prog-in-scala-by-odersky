package samples

import org.victor.traits.{PrettyJson, Customer}

/**
 * @author victorp
 */
object PrettyJsonSample extends App{

  /**
   * We create new 'Customer' with 'PrettyJson' trait and thus enrich the original 'Customer' interface
   */
  val customer = new Customer("Funny Customer",99) with PrettyJson

  println(s"toJson: ${customer.toJson}")
  println(s"toPrettyJson: ${customer.toPrettyJson}")


}
