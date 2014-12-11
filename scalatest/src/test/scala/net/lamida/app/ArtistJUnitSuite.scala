package net.lamida.app

import org.scalatest.junit.JUnitSuite
import org.junit.{Test, Before}
import org.junit.Assert._

class ArtistJUnitSuite extends JUnitSuite {
  var artist:Artist = _

  @Before
  def startUp() {
    artist = new Artist("Kenny", "Rogers")
  }

  @Test
  def addOneAlbumAndGetCopy() {
    val copyArtist = artist.addAlbum(new Album("Love will turn you around", 1982, artist))
    assertEquals(copyArtist.albums.size, 1)
  }
}

