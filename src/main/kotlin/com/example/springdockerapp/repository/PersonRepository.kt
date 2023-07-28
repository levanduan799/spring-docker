package com.example.springdockerapp.repository

import com.example.springdockerapp.domain.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository : JpaRepository<Person,Int>