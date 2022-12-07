package com.example.unittesting

import java.lang.IllegalArgumentException

class PassWordValidation {

    fun validPassword(input:String)=when{
        input.isBlank()->{
            "PassWord is Blank"
        }
        input.length<6->{
         "Length of the Password should be greater than 6"
        }
        input.length>15->{
            "Length of the Password should be Less than 15"
        }
        else->{
            "Valid Input"
        }
    }

    fun reverseInputString(input:String?): String {
        if(input==null){
            throw  IllegalArgumentException("Input String is Required")
        }
        return StringBuilder(input).reverse().toString()
    }


}