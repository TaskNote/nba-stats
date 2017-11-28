package org.nbastats.model

import org.junit.Test
import org.nbastats.BaseSpec

class PlayerSpec extends BaseSpec {


  @Test
  def player(): Unit = {
    val kawhi: Player = Player("kawhi leonard", null, null, Seq(Season(2017, Seq.empty,
      null)))
    kawhi.season should not be empty
  }

}
