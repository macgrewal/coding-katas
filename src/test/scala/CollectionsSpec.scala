package collections

import org.scalatest.FlatSpec

class CollectionsSpec extends FlatSpec {
  "Calling map on a list" should "perform the function on every element of the list," +
    "creating a new list from the return types" in {
    assertResult(Seq(2, 4, 6)) {
      Seq(1, 2, 3).map(_ * 2)
    }
  }

  it should "change ints to strings" in {
    assertResult(Seq("1", "2", "3")) {
      Seq(1, 2, 3).map(_.toString)
    }
  }

  "Calling foreach on a list" should "println for each element, but not pass the return type forward" in {
    Seq(1, 2, 3).foreach(println)
  }

  "Calling reduce on a list" should "combine each of the elements according to the passed in function" in {
    assertResult(6) {
      Seq(1, 2, 3).reduce(_ + _)
    }
  }

  "Calling foldLeft on a list" should "combine the elements of the list with an initial value, according to the function passed in" in {
    assertResult("1234") {
      Seq(1, 2, 3, 4).foldLeft("")((a, b) => a + b)
    }
  }

  "Calling filter and map on a list" should "first filter out the even numbers, and then double them" in {
    assertResult(Seq(4, 8)) {
      Seq(1, 2, 3, 4).filter(_ % 2 == 0).map(_ * 2)
    }
  }

  "Calling collect on a list" should "first filter out the even numbers, and then double them" in {
    assertResult(Seq(4, 8)) {
      Seq(1, 2, 3, 4).collect { case even if even % 2 == 0 => even * 2 }
    }
  }
}