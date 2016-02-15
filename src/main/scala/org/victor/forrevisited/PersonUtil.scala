package org.victor.forrevisited

/**
 * @author victorp
 */
object PersonUtil {

  /**
   * This version uses collections API
   */
  def findMotherSonPairsV1(persons:List[Person]):List[(String,String)] = {
    persons
      .filter(!_.isMale)
      .flatMap(momChildPairs)
  }

  /**
   * Here we added a small optimization since we use withFilter which avoids intermediate data struct
   */
  def findMotherSonPairsV2(persons:List[Person]):List[(String,String)] = {
    persons
      .withFilter(!_.isMale)
      .flatMap(momChildPairs)
  }


  /**
   * Here we use 'for' with 'yield'. The compiler translates it to 'findMotherSonPairsV2'
   */
  def findMotherSonPairsV3(persons:List[Person]):List[(String,String)] = {
    for {
      person <- persons
      if !person.isMale
      child <- person.children
    }yield (person.name,child.name)
  }

  def momChildPairs(person:Person):Iterable[(String,String)] = {
    person.children
    .map(c => (person.name,c.name))
  }

}
