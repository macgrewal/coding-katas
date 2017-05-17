package marsRover

import base.UnitSpec
import com.sun.xml.internal.ws.dump.LoggingDumpTube.Position
import org.scalatest.{WordSpec, Matchers}

class MarsRoverTests extends WordSpec with Matchers {
  "Planet" can {
    "Define it's size" in {
      val mars = new Planet(Position(-10,-10),Position(10,10))
      mars.calculateSize() should be (400)
    }
  }


    "Rover" can {
      "Land on planet" in {
        var roverOne = new Rover()
        roverOne.getPosition() should be (Position(0,0))
        roverOne.getDirection() should be ('N')
      }
    }
      "Turn on planet" in {
        var roverOne = new Rover()
        roverOne.getDirection should be ('N')
        roverOne = roverOne.sendInstructions(List('E'), roverOne)
        roverOne.getDirection should be ('E')
      }

      "Move on planet" in {
        var roverOne = new Rover()
        roverOne.getPosition() should be (Position(0,0))
        roverOne = roverOne.sendInstructions(List('M'), roverOne)
        roverOne.getPosition() should be (Position(0,1))
      }

      "Perfom Complex Movements" in {
        var roverOne = new Rover()
        roverOne.getPosition() should be (Position(0,0))
        roverOne.getDirection should be ('N')
        roverOne = roverOne.sendInstructions(List('M','M','M','M','M','E','M','M','M','M','M'), roverOne)
        roverOne.getPosition() should be (Position(5,5))
        roverOne.getDirection should be ('E')
      }
}
