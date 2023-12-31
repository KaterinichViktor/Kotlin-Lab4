package com.example.lab4.models.utils

abstract class ValidatableLambda<T>(
    val validateFunc: (value: T) -> Unit
): Validatable<T> {
    override fun validate(value: T) {
        validateFunc(value)
    }
}