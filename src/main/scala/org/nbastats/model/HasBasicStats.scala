package org.nbastats.model

import java.sql.Time

trait HasBasicStats {

  val game: Int
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
  val timePlayed: Time
  val plusMinus: Int

}

