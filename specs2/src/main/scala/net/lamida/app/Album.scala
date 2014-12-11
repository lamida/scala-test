package net.lamida.app

import java.util.List
import java.util.ArrayList

class Album(val title: String, val year: Int, val artis: Artist) {
  var tracks: List[Track] = new ArrayList[Track]
}
