package com.example.springdockerapp

import com.example.springdockerapp.domain.Person
import com.example.springdockerapp.repository.PersonRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDockerAppApplication(val personRepository: PersonRepository) : CommandLineRunner {
    override fun run(vararg args: String?) {

    }

}

fun main(args: Array<String>) {
    runApplication<SpringDockerAppApplication>(*args)
}
