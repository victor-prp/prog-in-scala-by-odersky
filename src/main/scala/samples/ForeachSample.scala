package samples


object ForeachSample extends App{
  val season = List("fall", "winter", "spring")
  def printSeason(s :Int){ println(season(s))}

  (0 to 2).foreach(printSeason)
}