package org.nbastats.model

import java.time.Duration

case class GameStat(name: String,

                    datePlayed: String,
                    forTeam: String,
                    againstTeam: String,
                    season: String,
                    seasonGame: Int,
                    fga: Int,
                    fgm: Int,
                    threesA: Int,
                    threesM: Int,
                    fta: Int,
                    ftm: Int,
                    points: Int,
                    rebounds: Int,
                    dRebounds: Int,
                    oRebounds: Int,
                    assists: Int,
                    blocks: Int,
                    steals: Int,
                    turnovers: Int,
                    personalFouls: Int,
                    timePlayed: Duration,
                    plusMinus: Int ) extends HasBasicStats {

  val games: Int = 1
}

