package com.example.crm.Controller

import com.example.crm.dto.LeadDto
import com.example.crm.service.LeadService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/leads")
class LeadController(
    private val leadService: LeadService
) {
    @GetMapping
    fun getAllLeads(): List<LeadDto> = leadService.getAllLeads()

    @GetMapping("/{id}")
    fun getLeadById(@PathVariable id: Long): LeadDto = leadService.getLeadById(id)

    @PostMapping
    fun createLead(@RequestBody leadDTO: LeadDto): LeadDto = leadService.createLead(leadDTO)


    @PostMapping("/{id}/set-status")
    fun updateLeadStatus(@PathVariable id: Long, @RequestBody status: String): LeadDto=
        leadService.updateLeadStatus(id, status)

    @GetMapping("/{id}/status")
    fun getLeadStatus(@PathVariable id: Long): String = leadService.getLeadStatus(id)
}

