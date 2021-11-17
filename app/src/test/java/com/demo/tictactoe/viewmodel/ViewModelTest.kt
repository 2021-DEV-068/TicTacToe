package com.demo.tictactoe.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.demo.tictactoe.model.Board
import com.demo.tictactoe.model.Cell
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule

class ViewModelTest {

    private val viewModel = GameViewModel()
    private val playerOne = "Tejash"
    private val playerTwo = "Ajay"
    private val playerOneValue = Board.PLAYER_ONE_VALUE
    private val row = 0
    private val column = 0

    @Rule
    @JvmField
    var rule: TestRule = InstantTaskExecutorRule()

    @Test
    fun `Given function should return player one name`(){
        val expectedResult = playerOne

        viewModel.init(playerOne, playerTwo)

        val actualResult = viewModel.board.player1.name

        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `Given function should return expected result`(){

        viewModel.init(playerOne, playerTwo)

        val actualResult = viewModel.cells

        Assert.assertNotNull(actualResult)
    }

    @Test
    fun `Given function should return expected result, when 0,0 column clicked in the game`(){

        viewModel.init(playerOne, playerTwo)
        viewModel.onClickedCellAt(row,column)

        val actualResult =  viewModel.board.cells[row][column].player?.name

        Assert.assertEquals(playerOne, actualResult)
    }

    @Test
    fun `Given function should return String of given numbers`(){

        val actualResult = viewModel.stringFromNumbers(0,1)

        Assert.assertEquals("01", actualResult)
    }

    @Test
    fun `Given function should return player one value, when 0,0 column clicked in the game`(){

        viewModel.init(playerOne, playerTwo)
        viewModel.onClickedCellAt(row,column)

        val actualResult =  viewModel.cells[viewModel.stringFromNumbers(row, column)]

        Assert.assertEquals(playerOneValue, actualResult)
    }

    @Test
    fun `Given function should not return null`(){

        val actualResult =  viewModel.getWinner()

        Assert.assertNotNull(actualResult)
    }

    @Test
    fun `Given function should return winner in Live Data, if game has winner in the board`(){
        val expectedResult = playerOne

        viewModel.init(playerOne, playerTwo)
        val cell = Cell(viewModel.board.player1)
        viewModel.board.cells[0][0] = cell
        viewModel.board.cells[0][1] = cell
        viewModel.board.cells[0][2] = cell
        viewModel.updateGameStatus()

        val actualResult =  viewModel.getWinner().value

        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `Given function should return not null as expected`(){

        val actualResult =  viewModel.getNoWinner()

        Assert.assertNotNull(actualResult)
    }

    @Test
    fun `Given function should return no winner in Live Data, if game has no winner in the board`(){
        val expectedResult = "No winner found!"

        viewModel.init(playerOne, playerTwo)
        val cell1 = Cell(viewModel.board.player1)
        val cell2 = Cell(viewModel.board.player2)

        viewModel.board.cells[0][0] = cell1
        viewModel.board.cells[0][1] = cell1
        viewModel.board.cells[0][2] = cell2

        viewModel.board.cells[1][0] = cell2
        viewModel.board.cells[1][1] = cell2
        viewModel.board.cells[1][2] = cell1

        viewModel.board.cells[2][0] = cell1
        viewModel.board.cells[2][1] = cell1
        viewModel.board.cells[2][2] = cell2
        viewModel.updateGameStatus()
        val actualResult =  viewModel.getNoWinner().value

        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `Given function should switch the player, when game board is not full and no winner found`(){
        val expectedResult = playerTwo

        viewModel.init(playerOne, playerTwo)
        val cell = Cell(viewModel.board.player1)
        viewModel.board.cells[0][0] = cell
        viewModel.updateGameStatus()

        val actualResult = viewModel.board.currentPlayer.name

        Assert.assertEquals(expectedResult, actualResult)
    }


    @Test
    fun `Given function should switch the player after player clicked in board, when game board is not full and no winner found`(){
        val expectedResult = playerTwo

        viewModel.init(playerOne, playerTwo)
        viewModel.onClickedCellAt(row,column)

        val actualResult = viewModel.board.currentPlayer.name

        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `Given function should return expected result, when game is restarted`(){
        val expectedResult = 0

        viewModel.init(playerOne, playerTwo)
        viewModel.onClickedCellAt(row,column)
        viewModel.cells[viewModel.stringFromNumbers(row, column)]

        viewModel.resetGame()

        val actualResult = viewModel.cells.size

        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `Given function should reset winner in Live Data, when game is restarted`(){
        val expectedResult = null

        viewModel.init(playerOne, playerTwo)
        val cell = Cell(viewModel.board.player1)
        viewModel.board.cells[0][0] = cell
        viewModel.board.cells[0][1] = cell
        viewModel.board.cells[0][2] = cell
        viewModel.updateGameStatus()
        viewModel.resetGame()

        val actualResult =  viewModel.getWinner().value

        Assert.assertEquals(expectedResult, actualResult)
    }

    @Test
    fun `Given function should reset the game, when game is restarted`(){
        val expectedResult = null

        viewModel.init(playerOne, playerTwo)
        val cell1 = Cell(viewModel.board.player1)
        val cell2 = Cell(viewModel.board.player2)

        viewModel.board.cells[0][0] = cell1
        viewModel.board.cells[0][1] = cell1
        viewModel.board.cells[0][2] = cell2

        viewModel.board.cells[1][0] = cell2
        viewModel.board.cells[1][1] = cell2
        viewModel.board.cells[1][2] = cell1

        viewModel.board.cells[2][0] = cell1
        viewModel.board.cells[2][1] = cell1
        viewModel.board.cells[2][2] = cell2
        viewModel.updateGameStatus()
        viewModel.resetGame()

        val actualResult =  viewModel.getNoWinner().value

        Assert.assertEquals(expectedResult, actualResult)
    }
}