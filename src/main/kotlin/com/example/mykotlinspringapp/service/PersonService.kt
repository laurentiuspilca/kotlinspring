package com.example.mykotlinspringapp.service

import com.example.mykotlinspringapp.entities.Person
import com.example.mykotlinspringapp.repositories.PersonRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PersonService (
        @Autowired private val personRepo : PersonRepo
) {

    fun addPerson(person : Person)  {
        personRepo.save(person)
    }

    fun getAllPersons() : List<Person> {
        return personRepo.findAll()
    }
}