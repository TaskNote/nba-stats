package org.nbastats.model

import java.sql.{Date, Time}

case class GameStat(name: String, datePlayed: Date, forTeam: String, againstTeam: String,
               points: Int, rebounds: Int, assists: Int, blocks: Int, steals: Int,
               timePlayed: Time)

