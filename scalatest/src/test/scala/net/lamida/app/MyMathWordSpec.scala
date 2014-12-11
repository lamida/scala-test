package net.lamida.app

import org.scalatest.WordSpec

class MyMathWordSpec extends WordSpec {

  "an addition" when {
    "add 1 to 19" should {
      "return 20" in {
        assert(MyMath.add(1,19) == 20)
      }
    }
  }
}

