package com.example.crm.dto

import java.time.LocalDateTime

data class ActivityDto (
    val id: Long,
    val description: String,
    val timestamp: LocalDateTime,
    val leadId: Long

    )