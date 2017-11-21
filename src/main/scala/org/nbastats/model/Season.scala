package org.nbastats.model

case class Season(name: String, gameStats: Seq[GameStat] = Seq.empty,
                  seasonStat: SeasonStat)

case class SeasonStat(ppg: Double, rpg: Double, apg: Double, spg: Double,
                      bpg: Double, mpg: Double, gamesPlayed: Int)
