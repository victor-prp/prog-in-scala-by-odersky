package samples


object ExistsInListSample extends App{
  def containsOdd(nums: List[Int]) = nums.exists(_ % 2 == 1)

  val numListWithOdd = 1 :: 2:: 22 :: 43:: Nil

  println(containsOdd(numListWithOdd))

  val numListWithoutOdd = 2:: 22 :: Nil

  println(containsOdd(numListWithoutOdd))


}
