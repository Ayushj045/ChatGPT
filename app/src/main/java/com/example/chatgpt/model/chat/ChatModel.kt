package com.example.chatgpt.model.chat

data class ChatModel(
    val choices: List<Choice>,
    val created: Int,
    val id: String,
    val model: String,
    val `object`: String,
    val usage: Usage
)