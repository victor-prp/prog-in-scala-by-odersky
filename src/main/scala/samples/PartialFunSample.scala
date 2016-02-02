package samples
import org.victor.patternmathing.partialfunctions._
/**
 * @author victorp
 */
object PartialFunSample extends App{

  swallow{
    //this call will extract the value 1
    println(s"extractVal(Option(1)): ${extractVal(Option(1))}")
  }
  
  swallow{
    //this call will throw an Exception since 'extractVal' is undefined for empty
    println(s"extractVal(Option.empty): ${extractVal(Option.empty)}")
  }


  swallow{
    //this call will throw an Exception since 'extractVal' is undefined for empty
    def invokeIfDefined(opt:Option[Int]) = {
      if (extractValPartially.isDefinedAt(opt)){
        extractValPartially(opt)
      }else{
        throw new RuntimeException(s"Custom exception: extractValPartially is undefined for value: $opt")
      }
    }

    //here we show the ability to take control over function calls of the function was defined as PartialFunction
    println(s"invokeIfDefined(Option.empty): ${invokeIfDefined(Option.empty)}")
  }

  swallow{
    val extractWithDefault100 = extractValWithDefault(100)
    //this call will throw an Exception since 'extractVal' is undefined for empty
    println(s"extractWithDefault100(Option.empty): ${extractWithDefault100(Option.empty)}")
  }

  def swallow(fun: => Unit ): Unit ={
    try{
      fun //invokes the fun
    }catch {
      case e: Throwable => println(e)
    }
  }

}
