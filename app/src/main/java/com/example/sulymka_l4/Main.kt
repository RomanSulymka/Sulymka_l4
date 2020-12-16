package com.example.sulymka_l4

fun getMe(): Person {
    val me: Person = Person("Roma", 20)
    me.father = Person("Orest", 52)
    me.mother = Person("Maryna", 45)
    me.list = arrayOf(Person("Olga", 16))

    me.mother?.let { it.father = Person("Vasyl", 79) }
    me.mother?.let { it.mother = Person("Maria", 72) }

    me.father?.let { it.father = Person("Myron", 72) }
    me.father?.let { it.mother = Person("Nadia", 68) }
    return me
}

fun main() {
val family : Person = getMe()
    family.relativesOf(family)
    println("My family: ${family.relatives.joinToString(postfix = ".")}\n total:  ${family.count} people")
}