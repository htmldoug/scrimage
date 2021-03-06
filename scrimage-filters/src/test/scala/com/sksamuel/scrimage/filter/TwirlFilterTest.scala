package com.sksamuel.scrimage.filter

import com.sksamuel.scrimage.ImmutableImage
import org.scalatest.{BeforeAndAfter, FunSuite, OneInstancePerTest}

class TwirlFilterTest extends FunSuite with BeforeAndAfter with OneInstancePerTest {

  private val original = ImmutableImage.fromStream(getClass.getResourceAsStream("/bird_small.png"))

  test("twirl filter output matches expected") {
    val expected = getClass.getResourceAsStream("/com/sksamuel/scrimage/filters/bird_small_twirl.png")
    assert(original.filter(new TwirlFilter(150)) === ImmutableImage.fromStream(expected))
  }
}
