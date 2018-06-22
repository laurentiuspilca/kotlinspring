package com.example.mykotlinspringapp.api

import com.example.mykotlinspringapp.entities.Person
import com.example.mykotlinspringapp.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonApi (
       @Autowired private val personService : PersonService
) {

    @RequestMapping(path = ["/add/person"], method = [RequestMethod.POST])
    fun addPerson(@RequestBody person: Person) {
        personService.addPerson(person)
    }

    @RequestMapping(path = ["/get/persons"], method = [RequestMethod.GET])
    fun getAllPersons() : List<Person> {
        return personService.getAllPersons()
    }
}