package com.example.crm.service

import com.example.crm.entity.ActivityLeadView
import com.example.crm.repository.ActivityViewRepository
import org.springframework.stereotype.Service

@Service
class ActivityViewService(
    val activityViewRepository: ActivityViewRepository
) {
    fun getAllActivityLeadViews(): List<ActivityLeadView>  {
        return activityViewRepository.findAll()
    }
}

