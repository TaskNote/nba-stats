package org.nbastats.scraper

import org.junit.Test
import org.nbastats.BaseSpec
import org.nbastats.model.{CareerSummary, GameStat}

class ScraperSpec extends BaseSpec {


  /** Checks that we can scrape tim duncans career summary. */
  @Test
  def duncan(): Unit = {
    val timmy: CareerSummary = Scraper.scrapeCareerSummary("https://www.basketball-reference.com/players/d/duncati01.html")

    timmy.name should be ("Tim Duncan")
    timmy.games should be (1392)
    timmy.pointsPerGame should be (19.0)
    timmy.reboundsPerGame should be (10.8)
    timmy.assistsPerGame should be (3.0)
  }

  @Test
  def jrue(): Unit = {
    val jrue: GameStat = Scraper.scrapeGameStat("https://www.basketball-reference.com/players/h/holidjr01/gamelog/2010", 1)




  }
}
