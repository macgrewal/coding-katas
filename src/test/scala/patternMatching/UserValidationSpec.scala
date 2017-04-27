package patternMatching

import models.UserModel
import utils.Constants._
import base.UnitSpec

/**
  * Created by jason on 27/04/17.
  */
class UserValidationSpec extends UnitSpec {

  "BasicPatternMatching" should {
    "return welcome message for the user Jason" in {

      UserValidation.validateUser(UserModel(JASON, JASON_AGE)) shouldBe "Hi Jason!"

    }

    "return Hi for the user Tom" in {

      UserValidation.validateUser(UserModel(TOM, TOM_AGE)) shouldBe "Hi Tom!"

    }
    "return error message for not registered user" in {

      UserValidation.validateUser(UserModel(AMY)) shouldBe "Amy is not registered."

    }
    "return error message for registered user" in {

      UserValidation.validateUser(UserModel()) shouldBe "Jessica is not registered."

    }
  }

}
