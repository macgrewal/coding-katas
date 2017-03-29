package sets

import base.UnitSpec

class FamiliesSpec extends UnitSpec {

  object TestData {
    val smiths = Seq(
      Dad("Will Smith", 35),
      Mum("Jada Pinkett", 42),
      Son("Jayden Smith", 12),
      Daughter("Willow Smith", 11)
    )

    val jacksons = Seq(
      Dad("Jo Jackson", 89),
      Mum("Katherine Jackson", 87),
      Daughter("Rebbie Jackson", 66),
      Son("Jackie Jackson", 65),
      Son("Tito Jackson", 63),
      Son("Jermaine Jackson", 64),
      Daughter("LaToya Jackson", 62),
      Son("Marlon Jackson", 62),
      Son("Michael Jackson", 50),
      Son("Randy Jackson", 58),
      Daughter("Janet Jackson", 50)
    )

    val bullocks = Seq(
      Dad("Sandra Bullock", 52),
      Son("Louis Bullock", 5)
    )

    val families = Seq(smiths, jacksons, bullocks)
  }

  "getMales" should {
    "return only males" in {
      FamilySorting.getMales(TestData.smiths) shouldBe Seq(Dad("Will Smith", 35), Son("Jayden Smith", 12))
    }
  }

  "getAdults" should {
    "return people 18 or older" in {
      FamilySorting.getAdults(TestData.smiths) shouldBe Seq(Dad("Will Smith", 35), Mum("Jada Pinkett", 42))
    }
  }

  "getAdultMales" should {
    "return males aged 18 or over" in {
      FamilySorting.getAdultMalesF(TestData.smiths) shouldBe Seq(Dad("Will Smith", 35))
    }
  }


}
