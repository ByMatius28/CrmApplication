package com.example.crm.Controller

import com.example.crm.dto.ActivityDto
import com.example.crm.service.ActivityService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/leads/{leadId}/activities")
class ActivityController(
    private val activityService: ActivityService
) {
    @GetMapping
    fun getActivitiesForLead(@PathVariable leadId: Long): List<ActivityDto> =
        activityService.getActivitiesForLead(leadId)

    @PostMapping
    fun createActivityForLead(@PathVariable leadId: Long, @RequestBody activityDTO: ActivityDto): ActivityDto =
        activityService.createActivityForLead(leadId, activityDTO)
}