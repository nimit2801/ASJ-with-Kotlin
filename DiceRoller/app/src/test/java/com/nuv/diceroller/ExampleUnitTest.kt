package com.nuv.diceroller

import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun generate_number() {
        val dice = Dice(6)
        val rollResults = dice.roll()
        assertTrue("The value of the result is between 1 and 6", rollResults in 1..6)
    }
}