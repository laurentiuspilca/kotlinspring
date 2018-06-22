package com.example.mykotlinspringapp.entities

import javax.persistence.*

@Entity
data class Person (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)  val id : Long?,
        @Basic(optional = false)  val name : String,
        @Basic(optional = false)  val age : Int
) {

}