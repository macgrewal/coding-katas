package imperative2Func

import scala.io.StdIn

object Runner {
  def main (args: Array[String]) : Unit = {
    Imperative.run
    //Functional.run
  }
}

object Imperative {
  def run(): Unit = {
    var on = true
    var balance = 1000
    var text = ""

    while (on) {
      text = StdIn.readLine()
      if (text == "withdraw") {
        println("Withdrawing £100")
        balance -= 100
        println("Balance is now £" + balance)
      }
      else if (text == "deposit") {
        println("Depositing £100")
        balance += 100
        println("Balance is now £" + balance)
      }
      else if (text == "quit") on = false
    }
  }
}

object Functional {
  def run(): Unit = ???
}