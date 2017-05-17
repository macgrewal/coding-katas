package marsRover
import scala.math

case class Position(xPos: Int, yPos: Int)

class Planet(minPos: Position, maxPos: Position){
  def calculateSize(): Int = (scala.math.abs(minPos.xPos) + scala.math.abs(maxPos.xPos)) * (scala.math.abs(minPos.yPos) + scala.math.abs(maxPos.yPos))
}

class Rover(position: Position = Position(0,0), direction: Char = 'N', instructions: List[Char] = List.empty[Char]) {
  def getPosition(): Position = position
  def getDirection(): Char = direction
  def sendInstructions(instructions: List[Char], rover: Rover): Rover = {
    var CurrentPosition = rover.getPosition()
    var CurrentDirection = rover.getDirection()
    for (i <- instructions.indices) {
      instructions(i) match {
        case 'N' => CurrentDirection = 'N'
        case 'E' => CurrentDirection = 'E'
        case 'S' => CurrentDirection = 'S'
        case 'W' => CurrentDirection = 'W'
        case 'M' => {
          CurrentDirection match{
            case 'N' => CurrentPosition = Position(CurrentPosition.xPos, CurrentPosition.yPos + 1)
            case 'S' => CurrentPosition = Position(CurrentPosition.xPos, CurrentPosition.yPos - 1)
            case 'W' => CurrentPosition = Position(CurrentPosition.xPos - 1, CurrentPosition.yPos)
            case 'E' => CurrentPosition = Position(CurrentPosition.xPos + 1 , CurrentPosition.yPos)
          }
        }
      }
    }
  new Rover(CurrentPosition, CurrentDirection)
  }
}
