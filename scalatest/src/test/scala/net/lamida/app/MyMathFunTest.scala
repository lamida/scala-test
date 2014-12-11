package net.lamida.app
import org.scalatest.FunSuite

class SetSuite extends FunSuite {
  test("2 + 2 should be 4") {
    assert(MyMath.add(2,2) == 4)
  }
  test("11111 + 2 should be 4") {
    assert(MyMath.add(11111,2) == 11113)
  }
}
