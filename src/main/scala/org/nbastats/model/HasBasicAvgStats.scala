package org.nbastats.model

import scala.concurrent.duration.Duration

/** HasBasicAvgStats represents the perGame basketball statistics for a given
  * number of games.
  *
  * The val games, inherited from hasBasicStats represents the number of games
  * the average stats are for.
  * Other vals represent averages
  *
  */
trait HasBasicAvgStats extends HasBasicStats {

  val name: String
  val fgAvgPerGame: Double = this.fga/games
  val fgMadePerGame: Double = this.fgm/games
  val threesAvgPerGame: Double = this.threesA/games
  val threesMadePerGame: Double = this.threesM/games
  val ftAvgPerGame: Double = this.fta/games
  val ftMadePerGame: Double = this.ftm/games
  val pointsPerGame: Double = this.points/games
  val reboundsPerGame: Double = this.rebounds/games
  val assistsPerGame: Double = this.assists/games
  val blocksPerGame: Double = this.blocks/games
  val stealsPerGame: Double = this.steals/games
  val turnoversPerGame: Double = this.turnovers/games
  //val timePlayedPerGame: Duration = this.timePlayed/games

}
