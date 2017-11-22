package org.nbastats.scraper

import org.jsoup.Jsoup
import org.jsoup.nodes.{Document, Element}
import org.jsoup.select.Elements
import org.nbastats.model.{CareerSummary, Player}
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

}
