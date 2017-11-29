package org.nbastats.model

import java.sql.Date

import scala.concurrent.duration.Duration

case class GameStat(name: String,
                    datePlayed: Date,
                    forTeam: String,
                    againstTeam: String,
                    seasonGame: Int,
                    fga: Int,
                    fgm: Int,
                    threesA: Int,
                    threesM: Int,
                    fta: Int,
                    ftm: Int,
                    points: Int,
                    rebounds: Int,
                    assists: Int,
                    blocks: Int,
                    steals: Int,
                    turnovers: Int,
                    timePlayed: Duration,
                    plusMinus: Int ) extends HasBasicStats {

  val games: Int = 1
}

