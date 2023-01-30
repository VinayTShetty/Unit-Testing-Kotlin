package com.example.unittesting

import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculatorTest {

    @Mock
    lateinit var ops: Operations
    lateinit var calc: Calculator

    @Before
    fun setUp() {
        calc = Calculator(ops)
    }

    @After
    fun tearDown() {
    }

    @Test
    fun addTwoNumbers() {
        val aa = 11
        val ba = 21
        calc.addTwoNumbers(aa, ba)
        verify(ops).add(aa, ba)
    }

    @Test
    fun subtractTwoNumbers() {
        val ac = 11
        val bc = 21
        calc.subtractTwoNumbers(ac, bc)
        verify(ops).subtract(ac, bc)
    }

    @Test
    fun multiplyTwoNumbers() {
        val av = 11
        val bv = 21
        calc.multiplyTwoNumbers(av, bv)
        verify(ops).multiply(av, bv)
    }

    @Test
    fun divideTwoNumbers() {
        val ap = 11
        val bp = 21
        calc.divideTwoNumbers(ap, bp)
        verify(ops).divide(ap, bp)
    }
}