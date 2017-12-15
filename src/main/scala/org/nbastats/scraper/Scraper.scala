package org.nbastats.scraper

import java.sql.Date

import org.jsoup.Jsoup
import org.jsoup.nodes.{Document, Element}
import org.jsoup.select.Elements
import org.nbastats.model.{CareerSummary, GameStat, Player}
import org.pmw.tinylog.Logger

import scala.collection.JavaConverters._

object Scraper {


  /**
    * Scrapes a [[CareerSummary]] from the given url.
    *
    * @param url url to scrape
    * @return a [[CareerSummary]]
    */
  def scrapeCareerSummary(url: String): CareerSummary = {
    val doc: Document = Jsoup.connect(url).get()


    val name: String = doc.select("#meta > div:nth-child(2) > h1").text

    val careerSummary: Elements = doc.select("#info > div.stats_pullout")

    val countingStats: Seq[Element] = careerSummary.select("> div.p1").select(" > div").asScala.toSeq

    val games: Int = countingStats.head.select("> p").asScala.toList(1).text().toInt
    val ppg: Double = countingStats(1).select("> p").asScala.toList(1).text().toDouble
    val rpg: Double = countingStats(2).select("> p").asScala.toList(1).text().toDouble
    val apg: Double = countingStats(3).select("> p").asScala.toList(1).text().toDouble

    CareerSummary(name, games, ppg, rpg, apg)
  }

  /**
    * Scrapes a [[GameStat]] from the given URL.
    * @param url url to scrape
    * @param seasonGame the season game for that given URL, e.g. value 2 will
    *                   return the second game in the URL.
    * @return GameStat
    */
  def scrapeGameStat(url: String, seasonGame: Int): GameStat = {

    val gameString: String = '.' + seasonGame.toString

    val doc: Document = Jsoup.connect(url).get()

    val name: String = doc.select("#meta > div:nth-child(2) > p:nth-child(3) > strong > strong").text

    //  construct a selector string to get the seasonGame stats
    val rowSelector: String = "pgl_basic" + gameString

    // create the doc element to use in order to derive individual game stats from
    val gameStatRow: Element = doc.getElementById(rowSelector)
    // create a sequence of elements for that given game row.
    val countingStats: Seq[Element] = gameStatRow.select("> td").asScala.toSeq

    // scrape the stats
    val datePlayed: String = countingStats(1).select("> a").asScala.head.text

    val forTeam: String = countingStats(3).select("> a").asScala.head.text





    throw new RuntimeException




  }


}
// #info > div.stats_pullout > div.p3 > div:nth-child(1) > p:nth-child(3)