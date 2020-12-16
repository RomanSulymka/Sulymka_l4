package com.example.sulymka_l4

class Person(var name: String, var age: Int,
             var father: Person? = null,
             var mother: Person? = null, var list: Array<Person>? = null
) {
    var relatives: MutableList<Person> = mutableListOf<Person>()
    var count = 0

    fun relativesOf(person: Person) {
        this.father?.let {
            person.relatives.add(it)
            person.count++
            it.relativesOf(person)
        }
        this.mother?.let {
            person.relatives.add(it)
            person.count++
            it.relativesOf(person)
        }
        this.list?.let {
            it.forEach {
                person.relatives.add(it)
                person.count++
                it.relativesOf(person)
            }
        }
    }

    override fun toString(): String {
        return this.name
    }
}
