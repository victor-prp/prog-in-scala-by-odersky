package samples

import java.io.File


object ListFiles extends App{
  val filesHere = (new File(".")).listFiles
  for (file <- filesHere)
    println(file)
}
