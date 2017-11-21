package org.nbastats

import org.junit.Test

class HelloSpec extends BaseSpec {

  @Test
  def hello(): Unit = {
    1 + 1 should be (2)
  }

}
