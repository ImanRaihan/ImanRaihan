package com.imanraihan.playground10

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.core.content.ContextCompat
import com.imanraihan.playground10.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var uiJankenpon : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    uiJankenpon = ActivityMainBinding.inflate(layoutInflater)
    setContentView(uiJankenpon.root)

    uiJankenpon.btnBatuPlayer.setOnClickListener {
        uiJankenpon.player1.setText("Batu")
        game(player = "Batu", computer = "Batu")
        muteBotton()
    }
    uiJankenpon.btnGuntingPlayer.setOnClickListener {
        uiJankenpon.player1.setText("Gunting")
        game(player = "Gunting", computer = "Gunting")
        muteBotton()
    }
    uiJankenpon.btnKertasPlayer.setOnClickListener {
        uiJankenpon.player1.setText("Kertas")
        game(player = "Kertas", computer = "Kertas")
        muteBotton()
    }
    uiJankenpon.btnReset.setOnClickListener {
        resetGame()
    }

}

private fun game(player: String, computer: String): String {
    return if (player == computer) {
        "DRAW !!"
    } else if (player == "Batu" && computer == "Kertas") {
        "Computer Win !"
    } else if (player == "Kertas" && computer == "Gunting") {
        "Computer Win !"
    } else if (player == "Gunting" && computer == "Batu") {
        "Computer Win !"
    } else if (player == "Batu" && computer == "Kertas") {
        "Player 1 Win !!!"
    } else if (player == "Gunting" && computer == "Kertas") {
        "Player 1 Win !!!"
    } else if (player == "Kertas" && computer == "Batu") {
        "Player 1 Win !!!"
    } else "ERROR 404 :("

    var hasil = game(player, bot().toString())

    Log.d("debuggingJanKenPon!!!", "Input Player 1: " + player)
    Log.d("debuggingJanKenPon!!!", "Input Computer: " + computer)
    Log.d("debuggingJanKenPon!!!", "Hasil Akhir: " + hasil)

    return hasil

    uiJankenpon.tandaPermainan.setText(hasil)
}

private fun bot() {
    val pilihan: String = listOf<String>("Batu", "Gunting", "Kertas").random()
    val computer: String = pilihan

    uiJankenpon.com.setText(computer)

}

private fun resetGame() {
    uiJankenpon.btnReset.setOnClickListener {
        uiJankenpon.tandaPermainan.setText("VS")
    }
    unmuteBotton()

}

private fun muteBotton() {
    uiJankenpon.btnGuntingPlayer.isEnabled = false
    uiJankenpon.btnBatuPlayer.isEnabled = false
    uiJankenpon.btnKertasPlayer.isEnabled = false
}

private fun unmuteBotton() {
    uiJankenpon.btnGuntingPlayer.isEnabled = true
    uiJankenpon.btnBatuPlayer.isEnabled = true
    uiJankenpon.btnKertasPlayer.isEnabled = true
}}
