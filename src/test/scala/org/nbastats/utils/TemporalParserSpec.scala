package org.nbastats.utils

import java.time.Duration

import org.junit.Test
import org.nbastats.BaseSpec

/**
  *
  * Created by tdm on 12/19/17.
  */
class TemporalParserSpec extends BaseSpec {

  /** Checks that we can correctly parse a string representation of minutes played. */
  @Test
  def parseMinutesPlayed(): Unit = {
    val expected: Duration = Duration.ofMinutes(12) plus Duration.ofSeconds(34)
    TemporalParser.minutesToDuration("12:34") should be (expected)


    val thrown: RuntimeException = intercept[IllegalArgumentException] {
      TemporalParser.minutesToDuration("abcef")
    }

    thrown.getMessage should startWith ("unable to parse")
  }
}
