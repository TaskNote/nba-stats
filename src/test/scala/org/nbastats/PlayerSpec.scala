package org.nbastats

import org.junit.Test
import org.nbastats.model.{Player, Season}

class PlayerSpec extends BaseSpec {


  @Test
  def player(): Unit = {
    val kawhi: Player = Player("kawhi leonard", Seq(Season(2017, Seq.empty,
      null)))
    kawhi.season should not be empty
  }

}
