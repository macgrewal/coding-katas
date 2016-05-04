package imperative2Func

import scala.io.StdIn._

object Runner {
  def main (args: Array[String]) : Unit = {
    //Imperative.run
    Functional.run
  }
}

object Imperative {
  def run(): Unit = {
    var on = true
    var balance = 1000
    var text = ""

    while (on) {
      text = readLine()
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
  def run(): Unit = loop(1000)

  def loop(balance: Int): Unit = {
    println("Your balance is £" + balance)

    readLine match {
      case "deposit" => {
        println("depositing £100")
        loop(balance + 100)
      }
      case "withdraw" => {
        println("withdrawing £100")
        loop(balance - 100)
      }
      case "quit" => ()
      case _ => loop(balance)
    }
  }
}