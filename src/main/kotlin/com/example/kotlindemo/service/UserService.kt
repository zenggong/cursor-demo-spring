package com.example.kotlindemo.service

import com.example.kotlindemo.model.User
import com.example.kotlindemo.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    
    fun getAllUsers(): List<User> = userRepository.findAll()
    
    fun getUserById(id: Long): User = userRepository.findById(id)
        .orElseThrow { NoSuchElementException("User not found with id: $id") }
    
    fun createUser(user: User): User = userRepository.save(user)
    
    fun updateUser(id: Long, user: User): User {
        if (!userRepository.existsById(id)) {
            throw NoSuchElementException("User not found with id: $id")
        }
        return userRepository.save(user.copy(id = id))
    }
    
    fun deleteUser(id: Long) {
        if (!userRepository.existsById(id)) {
            throw NoSuchElementException("User not found with id: $id")
        }
        userRepository.deleteById(id)
    }
} 