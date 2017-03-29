package sets

import scala.collection.mutable.ArrayBuffer

/**
  * Created by rob on 29/03/17.
  */
object FamilySorting {
  //Imperative form of code just for an example of how functional code can be much more readable
  def javaGetMales(people: Seq[Person]): Seq[Person] = {
    //Creating an empty "ArrayList" kind of structure
    val males = new ArrayBuffer[Person]()

    //For each Person in people
    //If the person is male
    //Add it to the males list
    for(person:Person <- people){
      if (person.isMale) {
        males += person
      }
    }

    //Don't need the return keyword in Scala, the last element in a block is returned
    males
  }

  //Method that takes a list of people and returns those whose isMale value is true
  def getMales(people: Seq[Person]): Seq[Person] = people filter (_.isMale)

  //Method that takes a list of people and returns those whose age value is over 18
  def getAdults(people: Seq[Person]): Seq[Person] = people filter (_.age >= 18)

  //Method that first gets all male people, then all of those whose age value is over 18
  def getAdultMales(people: Seq[Person]): Seq[Person] = {
    val males = getMales(people)
    getAdults(males)
  }

  //Functional style definition that takes a person and returns the result of its isMale value
  val isMale: Person => Boolean = _.isMale

  //Functional style definition that takes a list
  // of people and returns those who pass the isMale function
  val getMalesF: Seq[Person] => Seq[Person] = _ filter isMale

  //Functional style definition that takes a person and returns whether
  // that person's age value is over or equal to 18
  val isAdult: Person => Boolean = _.age >= 18

  //Functional style definition that takes a list of people and returns those
  // who pass the isAdult function
  val getAdultsF: Seq[Person] => Seq[Person] = _ filter isAdult

  //Function that passes a list first through the getMalesF function, and then the getAdultsF function
  //Note - This will run through the list twice (although the second list will be smaller)
  val getAdultMalesF: Seq[Person] => Seq[Person] = getMalesF andThen getAdultsF

  //Function that combines the two boolean checks of people into a single function
  val isAdultMale: Person => Boolean = person => isAdult(person) && isMale(person)

  //Function that passes each person though the isAdultMale function
  //Note - this will only do one pass through
  val getAdultMalesF2: Seq[Person] => Seq[Person] = _ filter isAdultMale
}
