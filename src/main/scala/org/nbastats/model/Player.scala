package org.nbastats.model

case class Stat(name: String, value: Double)
case class Player(name: String, stats: Seq[Stat] = Seq.empty)
