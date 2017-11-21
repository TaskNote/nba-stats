package org.nbastats

import org.scalatest.Matchers
import org.scalatest.junit.JUnitSuite

/**
  * All our test classes should mix in this trait.
  */
trait BaseSpec extends JUnitSuite with Matchers
