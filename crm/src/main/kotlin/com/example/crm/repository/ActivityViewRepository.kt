package com.example.crm.repository

import com.example.crm.entity.ActivityLeadView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ActivityViewRepository: JpaRepository< ActivityLeadView, Long>
