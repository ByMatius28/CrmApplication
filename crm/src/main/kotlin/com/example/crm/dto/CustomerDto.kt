package com.example.crm.dto


import jakarta.validation.constraints.NotBlank

class CustomerDto {

    @NotBlank(message = "Full name is required")
    var fullName: String? = null

    @NotBlank(message = "Email is required")
    var email: String? = null
}
