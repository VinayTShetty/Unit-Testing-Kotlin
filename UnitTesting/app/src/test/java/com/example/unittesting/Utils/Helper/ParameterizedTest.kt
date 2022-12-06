package com.example.unittesting.Utils.Helper

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizedTest(val inputData: String, val expectedResult: Boolean) {

    @Test
    fun testParameterized() {
        var utilsFunctions: UtilsFunctions = UtilsFunctions();
        var result = utilsFunctions.isPalinDrome(inputData)
        Assert.assertEquals(expectedResult,result)
    }

    companion object{
        @JvmStatic
        @Parameterized.Parameters
        fun data():List<Array<Any>>{
            return listOf(
                arrayOf("Hello",false),
                arrayOf("Level",true),
                arrayOf("a",true),
                arrayOf("Vinay",false),
                arrayOf("SOS",true),
            )
        }
    }
}

/**
 *   @Parameterized.Parameters
 *   To inform Junit that this is a Parameterized Value.Pass the value one after the other
 *
 *   @JVM Static
 *   As Juit is a java Framework to get the acess from Java we are using that annotation.
 *
 *   @RunWith(value = Parameterized::class)
 *   To inform JUnit that this is a Parameterized Unit Test class.
 *   Run with parametrized values only.
 */

