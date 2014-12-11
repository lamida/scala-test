package net.lamida.app

import org.specs2.mutable._
import org.joda.time.Period

class JukeboxUnitSpec extends Specification {
  "A Jukebox" should {
    """have a play method that returns a copy of the jukebox that selects
    the first song on the first album as the current track""" in {
      val groupTherapy = new Album("Group Therapy", 2011,
        Some(List(
          new Track("Filmic", "3:48"),
          new Track("ALchemy", "5:17"),
          new Track("Sun &amp; Moon", "5:25"),
          new Track("You Got to Go", "5:34"))), new Band("Above and Beyond"))
      val jukebox = new JukeBox(Some(List(groupTherapy)))
      val jukeboxNext = jukebox.play
      jukeboxNext.currentTrack.get.name must be_=("Filmic")
      jukeboxNext.currentTrack.get.period must be_=(new Period(0, 3, 49, 0))
    }
  }
}

