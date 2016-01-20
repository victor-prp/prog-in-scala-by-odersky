package samples


object ListSample extends App{

  val oneTwoThree = 1 :: 2 :: 3 :: Nil
  println(oneTwoThree.getClass())
  println(oneTwoThree)


  val fourFiveSix = List(4,5,6)
  println(fourFiveSix.getClass())
  println(fourFiveSix)


  val fromOneToSix = oneTwoThree ::: fourFiveSix
  println(fromOneToSix.getClass())
  println(fromOneToSix)
}
