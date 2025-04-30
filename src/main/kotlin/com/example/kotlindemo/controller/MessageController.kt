package com.example.kotlindemo.controller

import com.example.kotlindemo.model.Message
import com.example.kotlindemo.service.MessageService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/messages")
class MessageController(private val messageService: MessageService) {

    @GetMapping
    fun getAllMessages(): ResponseEntity<List<Message>> =
        ResponseEntity.ok(messageService.getAllMessages())

    @GetMapping("/{id}")
    fun getMessageById(@PathVariable id: Long): ResponseEntity<Message> =
        ResponseEntity.ok(messageService.getMessageById(id))

    @PostMapping
    fun createMessage(@RequestBody request: CreateMessageRequest): ResponseEntity<Message> =
        ResponseEntity.ok(messageService.createMessage(request.content))
}

data class CreateMessageRequest(
    val content: String
) 