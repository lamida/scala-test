package net.lamida.app

import org.scalatest.FlatSpec

class SetSpec extends FlatSpec {
  "1 plus 1" should "total 2" in {
    assert(MyMath.add(1,1) == 2)
  }
}

