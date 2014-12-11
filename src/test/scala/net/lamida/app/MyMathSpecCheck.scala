package net.lamida.app

import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

object MathScpecification extends Properties("String") {
  property("add") = forAll { (a:Int, b:Int) =>
    MyMath.add(a,b) == a + b
  }

  property("startsWith") = forAll { (a:String, b: String) =>
    (a+b).startsWith(a)
  }

}


