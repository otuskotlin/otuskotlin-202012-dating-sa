package ru.otus.otuskotlin.datingsa.backend.common.models

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable

class UserModelTest {

    @Test
    fun `just simple test`() {
        val testUserModel = UserModel()

        val name = "John"
        val lastName = "Doe"

        testUserModel.fname = name
        testUserModel.lname = lastName

        Assertions.assertAll(
            Executable { Assertions.assertEquals(name, testUserModel.fname) },
            Executable { Assertions.assertEquals(lastName, testUserModel.lname) },
        )
    }
}
