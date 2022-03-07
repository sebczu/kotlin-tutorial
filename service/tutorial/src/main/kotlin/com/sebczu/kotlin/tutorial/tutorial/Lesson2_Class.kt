package com.sebczu.kotlin.tutorial.tutorial

fun main(args: Array<String>) {
    var person = Person("name", "email")

    println("name ${person.name} email ${person.email}")
    person.name = "new"
    println("name ${person.name} email ${person.email}")
//    not allowed, val - const
//    obj.email = "new"

    var person2 = Person2("name")
    println("name ${person2.name}")

}

class Person(var name: String, val email: String)

class Person2(val name: String) {

    constructor(name: String, email: String) : this(name) {
        println("second constructor")
    }

}
