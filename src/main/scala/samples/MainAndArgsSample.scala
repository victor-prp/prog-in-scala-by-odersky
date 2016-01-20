package samples

object MainAndArgsSample {
  def main(args: Array[String]) {
    for (arg <- args)
      println(arg)
  }
}