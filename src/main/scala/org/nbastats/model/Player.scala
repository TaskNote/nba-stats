package org.nbastats.model

case class Player(name: String, season: Seq[Season] = Seq.empty)
