package org.nbastats.model

import org.junit.Test
import org.nbastats.BaseSpec

class PlayerSpec extends BaseSpec {


  @Test
  def player(): Unit = {
    val kawhi: Player = Player("kawhi leonard", Seq(Stat("PPG", 28.5)))
    kawhi.stats should not be empty
  }

}
