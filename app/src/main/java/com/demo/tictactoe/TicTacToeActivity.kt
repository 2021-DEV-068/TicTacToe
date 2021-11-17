package com.demo.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.demo.tictactoe.databinding.ActivityMainBinding
import com.demo.tictactoe.viewmodel.GameViewModel

class TicTacToeActivity : AppCompatActivity() {

    private lateinit var activityGameBinding: ActivityMainBinding

    private val gameViewModel: GameViewModel by lazy {
        ViewModelProvider(this).get(GameViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activityGameBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        gameViewModel.init(getString(R.string.player_one), getString(R.string.player_two))
        activityGameBinding.gameViewModel = gameViewModel
        invalidateGameBoard()
    }

    private fun invalidateGameBoard() {
        activityGameBinding.gameViewModel = gameViewModel
        setUpOnGameEndListener()
    }

    private fun setUpOnGameEndListener() {
        gameViewModel.getWinner().observe(this,  { playerName ->
            showGameResult("${getString(R.string.winner_is)} $playerName")
        })
        gameViewModel.getNoWinner().observe(this, { message ->
            showGameResult(message)
        })
    }

    private fun resetGame() {
        Handler(Looper.getMainLooper()).postDelayed({
            gameViewModel.resetGame()
            invalidateGameBoard()
        }, 500)
    }

    private fun showGameResult(message: String){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        resetGame()
    }
}