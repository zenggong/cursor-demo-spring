package com.example.kotlindemo.service

import com.example.kotlindemo.model.Message
import org.springframework.stereotype.Service

@Service
class MessageService {
    private val messages = mutableListOf<Message>()
    
    init {
        // 添加一些测试数据
        messages.add(Message(1, "Hello, Kotlin!"))
        messages.add(Message(2, "Welcome to Spring Boot!"))
    }
    
    fun getAllMessages(): List<Message> = messages.toList()
    
    fun getMessageById(id: Long): Message = messages.find { it.id == id }
        ?: throw NoSuchElementException("Message not found with id: $id")
    
    fun createMessage(content: String): Message {
        val newId = (messages.maxOfOrNull { it.id } ?: 0) + 1
        val message = Message(newId, content)
        messages.add(message)
        return message
    }
} 