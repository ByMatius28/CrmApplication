package com.example.crm.mapper
import com.example.crm.dto.LeadDto
import com.example.crm.entity.Lead


object LeadMapper {
    fun Lead.toDTO(): LeadDto= LeadDto(
        id = this.id,
        name = this.name,
        email = this.email,
        status = this.status
    )

    fun LeadDto.toEntity(): Lead = Lead(
        name = this.name,
        email = this.email,
        status = this.status
    )

}