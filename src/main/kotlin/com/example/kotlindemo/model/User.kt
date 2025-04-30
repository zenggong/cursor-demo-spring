package com.example.kotlindemo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class User(
    @Id
    @GeneratedValue
    val id: Long = 0,
    val name: String,
    val email: String
) 