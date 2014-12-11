package net.lamida.app

import org.scalatest.FunSpec

class MyMathSetSpec extends FunSpec {
  describe("an addition") {
    describe("when add 1 to 7") {
      it("should return 8") {
        assert(MyMath.add(1,7) == 8)
      }
    }
    describe("when add 10 to 7") {
      it("should return 8") {
        assert(MyMath.add(10,7) == 17)
      }
    }
  }
}

