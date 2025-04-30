package com.example.kotlindemo.model

data class Message(
    val id: Long,
    val content: String,
    val timestamp: Long = System.currentTimeMillis()
) 