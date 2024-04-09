package com.example.chatgpt.model

data class MessageModel(
    var isUser : Boolean,
    var isImage : Boolean,
    var message : String
)
