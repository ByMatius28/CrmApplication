package com.example.crm.repository

import com.example.crm.entity.Activity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ActivityRepository : JpaRepository<Activity, Long> {
    fun findAllByLeadId(leadId: Long): List<Activity> // Busca actividades por ID de Lead
}
