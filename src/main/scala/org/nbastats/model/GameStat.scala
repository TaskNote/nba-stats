package org.nbastats.model

import java.sql.{Date, Time}

case class GameStat(name: String, datePlayed: Date, forTeam: String, againstTeam: String,
                    fga: Int, fgm: Int, threesA: Int, threesM: Int, fta: Int, ftm: Int,
                    points: Int, rebounds: Int, assists: Int, blocks: Int, steals: Int,
                    turnovers: Int, timePlayed: Time, plusMinus: Int, game: Int) extends HasBasicStats

