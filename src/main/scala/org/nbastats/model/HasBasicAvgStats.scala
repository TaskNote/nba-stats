package org.nbastats.model

trait HasBasicAvgStats {

  val name: String
  val games: Int
  val pointsPerGame: Double
  val reboundsPerGame: Double
  val assistsPerGame: Double

}
