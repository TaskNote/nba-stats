package org.nbastats.model

case class Bio(name: String, age: Age, positions: Seq[Position], shoots: Shoots, experience: Int)

case class Age(years: Int, days: Int, experience: Int)

sealed trait Position
case object PointGuard extends Position
case object ShootingGuard extends Position
case object SmallForward extends Position
case object PowerForward extends Position
case object Center extends Position

sealed trait Shoots
case object Right extends Shoots
case object Left extends Shoots