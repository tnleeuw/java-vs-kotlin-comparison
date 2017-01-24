package org.tnl.demo.kt

/**
 * Created by tim on 23-12-16.
 */

fun printPersonAddresss(person: Person?) {
    println("Name: ${person?.fullName ?: "Unknown"}")
    println("Street: ${person?.address?.street ?: "Not specified"}")
    println("City: ${person?.address?.city ?: "Not specified"}")

    //person?.firstName.length
    person?.firstName.orEmpty().length
    person?.firstName.orEmpty()
}
