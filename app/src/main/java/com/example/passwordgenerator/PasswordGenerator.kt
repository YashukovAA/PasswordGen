package com.example.passwordgenerator

class PasswordGenerator {

    private val characters = "a - z"

    fun generatePassword(length: Int): String {

        val sb = StringBuilder(length)

        for (x in 0 until length) {
            val random = (characters.indices).random()
            sb.append(characters[random])
        }
       return sb.toString()
    }

}

