package com.example.springdockerapp.controller

import com.example.springdockerapp.domain.Person
import com.example.springdockerapp.repository.PersonRepository
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/persons")
class PersonController(val personRepository: PersonRepository) {

    @GetMapping
    fun findAll(): List<Person> = personRepository.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int) =
        personRepository.findById(id).orElseThrow { RuntimeException("Not found person") }

    @PostMapping
    fun create(@RequestBody person: Person) = personRepository.save(person)

    @PutMapping
    fun update(@RequestBody person: Person) = personRepository.save(person)

    @DeleteMapping
    fun deleteById(@PathVariable id: Int) = personRepository.findById(id).ifPresent(personRepository::delete)

}