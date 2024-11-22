package com.example.crm.service


import com.example.crm.dto.CustomerDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import com.example.crm.repository.CustomerRepository
import com.example.crm.entity.Customer
import com.example.crm.mapper.CustomerMapper


@Service
class CustomerService {

    @Autowired
    lateinit var customerRepository: CustomerRepository

    fun getAllCustomers() : List<Customer>{
        return customerRepository.findAll()
    }

    fun save( customerDto: CustomerDto): Customer {
        val customer = CustomerMapper.toEntity(customerDto)
        return customerRepository.save(customer)
    }
}