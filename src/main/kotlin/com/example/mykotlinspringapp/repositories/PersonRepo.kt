package com.example.mykotlinspringapp.repositories

import com.example.mykotlinspringapp.entities.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface PersonRepo : JpaRepository<Person, Long> {

    @Query("SELECT p FROM Person p WHERE p.age > :age")
    fun getPersonsByAgeGreaterThan(@Param("age") age : Int) : List<Person>
}