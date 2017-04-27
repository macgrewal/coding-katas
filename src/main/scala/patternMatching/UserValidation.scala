package patternMatching

import models.UserModel
import utils.Constants._

/**
  * Created by jason on 27/04/17.
  */
object UserValidation {

  /**
    * @param user
    * @return String
    *         Solving the problem using IF logic
    *         OK if just one condition is required
    */
  def validateUserIf(user: String): Any = {
    if (user == "Jason") {
      "Hi"
    } else if (user == "Tom") {
      "Hi"
    } else {
      "Not registered."
    }
  }

  /**
    * @param user
    * @return String
    *         Using match case is the recommended way of pattern matching in Scala
    *         Validating the user against the UserModel
    *         If a user is matched, a successResponse is produced
    *         Otherwise an errorResponse is produced
    */
  def validateUser(user: UserModel): String = {
    user match {
      case UserModel(JASON, JASON_ID) => successResponse(user)
      case UserModel(TOM, TOM_ID) => successResponse(user)
      case _ => errorResponse(user)
    }
  }

  /**
    * @param user
    * @return String
    *         Private so to ensure these methods are not executed outside of our UserValidation scope
    */
  private def successResponse(user: UserModel): String = s"Hi ${user.userName}!"

  private def errorResponse(user: UserModel): String = s"${user.userName} is not registered."

}
