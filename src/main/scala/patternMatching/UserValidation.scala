package patternMatching

import models.UserModel
import utils.Constants._

/**
  * Created by jason on 27/04/17.
  */
object UserValidation {

  def validateUser(user: UserModel): Any = {
    user match {
      case UserModel(JASON, JASON_AGE) => successResponse(user)
      case UserModel(TOM, TOM_AGE) => successResponse(user)
      case _ => errorMessage(user)
    }
  }

  private def successResponse(user: UserModel): String = s"Hi ${user.userName}!"

  private def errorMessage(user: UserModel): String = s"${user.userName} is not registered."

}
