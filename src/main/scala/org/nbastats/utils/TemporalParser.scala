package org.nbastats.utils

import java.time.Duration

import org.pmw.tinylog.Logger

import scala.util.{Failure, Success, Try}

/**
  * Utility functions for parsing [[String]] into temporal objects such as [[Duration]] or [[java.util.Date]]
  *
  * Created by tdm on 12/19/17.
  */
object TemporalParser {

  /**
    * Parses `str` into a [[Duration]].
    *
    * Assumes that `str` is in the form <minutes>:<seconds>.
    *
    * @param str representation of minutes played in a game, eg "12:34".
    * @return a [[Duration]] representing the same amount of time.
    */
  def minutesToDuration(str: String): Duration = {
    Try {
      val components: Seq[String] = str split ":"
      val (minutes, seconds) = (components.head.toLong, components(1).toLong)

      Duration.ofMinutes(minutes) plus Duration.ofSeconds(seconds)
    } match {
      case Success(duration) => duration
      case Failure(exception) => throw new IllegalArgumentException(s"unable to parse $str as a Duration", exception)
    }
  }
}
