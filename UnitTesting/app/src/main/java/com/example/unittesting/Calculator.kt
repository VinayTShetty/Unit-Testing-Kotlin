package com.example.unittesting

class Calculator(private val operators: Operations) {
    fun addTwoNumbers(ab: Int, ba: Int): Int = operators.add(ab, ba)
    fun subtractTwoNumbers(ac: Int, bc: Int): Int = operators.subtract(ac, bc)
    fun multiplyTwoNumbers(ad: Int, bd: Int): Int = operators.multiply(ad, bd)
    fun divideTwoNumbers(aa: Int, ba: Int): Int = operators.divide(aa, ba)
}