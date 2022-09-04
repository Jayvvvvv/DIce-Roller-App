package com.example.diceroller

fun main()
{
    val myFirstDice = Dice(6)
    println("Your ${myFirstDice.numSides} sided Dice Rolled ${myFirstDice.roll()}!")

    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.numSides} sided Dice Rolled ${mySecondDice.roll()}!")
}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}

