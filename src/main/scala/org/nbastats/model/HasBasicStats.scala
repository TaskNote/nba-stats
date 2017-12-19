package org.nbastats.model

import java.time.Duration

/** Represents a total number of basketball stats for a given number of games.
  *
  * Param: games represents the number of games the set of stats are for.
  * All other vals represent the respective basketball statistic it is named
  * after and is an aggregation.
  *
  * [[HasBasicAvgStats]] extends this trait.
  *
  */
trait HasBasicStats {

  val games: Int
  val fga: Int
  val fgm: Int
  val threesA: Int
  val threesM: Int
  val fta: Int
  val ftm: Int
  val points: Int
  val rebounds: Int
  val assists: Int
  val blocks: Int
  val steals: Int
  val turnovers: Int
  val timePlayed: Duration
  val plusMinus: Int
}

