package org.nbastats.model

case class Player(name: String, seasonStats: Seq[Season] = Seq.empty)
