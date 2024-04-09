package com.example.chatgpt.model.request

data class ImageGenrateRequest(
    val n: Int,
    val prompt: String,
    val size: String
)