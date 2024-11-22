package com.example.crm.service

import com.example.crm.dto.ActivityDto
import com.example.crm.mapper.ActivityMapper.toDTO
import com.example.crm.mapper.ActivityMapper.toEntity
import com.example.crm.repository.ActivityRepository
import com.example.crm.repository.LeadRepository
import org.springframework.stereotype.Service


@Service
class ActivityService(
    private val activityRepository: ActivityRepository,
    private val leadRepository: LeadRepository
) {
    fun getActivitiesForLead(leadId: Long): List<ActivityDto> {
        val lead = leadRepository.findById(leadId).orElseThrow { Exception("Lead not found with ID $leadId") }
        return activityRepository.findAllByLeadId(leadId).map { it.toDTO() }
    }

    fun createActivityForLead(leadId: Long, activityDTO: ActivityDto): ActivityDto {
        val lead = leadRepository.findById(leadId).orElseThrow { Exception("Lead not found with ID $leadId") }
        return activityRepository.save(activityDTO.toEntity(lead)).toDTO()
    }
}