package org.nbastats.model

case class Player(name: String, bio: Bio, careerSummary: CareerSummary,
                  season: Seq[Season] = Seq.empty)
