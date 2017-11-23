package org.nbastats.model

case class CareerSummary(name: String,
                         games: Int,
                         pointsPerGame: Double,
                         reboundsPerGame: Double,
                         assistsPerGame: Double) extends HasBasicAvgStats {

}
