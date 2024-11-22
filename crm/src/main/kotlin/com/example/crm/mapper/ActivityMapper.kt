package com.example.crm.mapper

import com.example.crm.dto.ActivityDto
import com.example.crm.entity.Activity
import com.example.crm.entity.Lead

object ActivityMapper {
    fun Activity.toDTO(): ActivityDto = ActivityDto(
        id = this.id,
        description = this.description,
        timestamp = this.timestamp,
        leadId = this.lead.id
    )

    fun ActivityDto.toEntity(lead: Lead): Activity = Activity(
        description = this.description,
        timestamp = this.timestamp,
        lead = lead
    )
}
