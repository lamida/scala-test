package net.lamida.app

class Artist(val firstName: String, val lastName: String) {
  var albums:List[Album] = List()

  def addAlbum(alb: Album) = {
    albums = albums :+ alb
    this
  }
}

