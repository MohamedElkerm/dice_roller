package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val diceImage: ImageView = findViewById(R.id.imageView)
        val rollButton: Button = findViewById(R.id.buttonRoll)
        rollButton.setOnClickListener{
            val dice = Dice(diceImage)
            dice.rollImage()

        }
    }
}

class Dice(val  diceImage:ImageView){
    fun roll():Int{
        return  (1..6).random()
    }
    fun rollImage(){
        when (roll()) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }
}