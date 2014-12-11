package net.lamida.app

import org.scalatest.FunSpec
import org.scalatest.matchers.ShouldMatchers


class AlbumTest extends FunSpec with ShouldMatchers {
  describe("An album") {
    it("cn dd an artist object to the album") {
      val album = new Album("Thriller", 1981, new Artist("Michael", "Jackson"))
    }
  }
}

