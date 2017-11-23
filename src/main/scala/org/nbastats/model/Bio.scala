package org.nbastats.model

case class Bio(name: String, age: Age, positions: Seq[String], experience: Int)

case class Age(years: Int, days: Int, experience: Int)
