package com.demo.tictactoe.model

import org.junit.Assert
import org.junit.Test

class PlayerTest {
    private val playerName = "Tejash"
    private val playerValue = "Ajay"
    private val player1 = Player(playerName, playerValue)

    @Test
    fun `Given function should return expected result, when player names are equal`(){

        val actualResult = player1.name

        Assert.assertEquals(playerName, actualResult)
    }

    @Test
    fun `Given function should return expected result, when player values are equal`(){

        val actualResult = player1.value

        Assert.assertEquals(playerValue, actualResult)
    }
}