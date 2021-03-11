package com.capps.kotlinpractica

import android.app.Activity
import android.util.Log
import android.widget.Toast


abstract class Person(name: String, age: Int)

// varios constructores classs

class Developer2 : Person {
    constructor(name: String) : super(name, 20)
    constructor(age: Int) : super("john", age)
}


class Developer(name: String): Person(name,26)

fun add(x: Int , y: Int) : Int {
    return x + y
}

fun add2(x: Int , y: Int) = x + y

fun showToast(contex: Activity, text: String){
    Toast.makeText(contex, text, Toast.LENGTH_SHORT).show()
}

fun test() {
   // val p = Person("Juan",25)
    val d = Developer("Tom")
}

// ----- Properties ------------ = setter and getter de java
// field solo aplica dentro de los getter and setter de las properties

abstract class PersonPro(val name:String, val age: Int){
}

//--------interfaces-------------

interface Logger {
    //get truco para poder modificar en el string en una intrfaz

    val tag: String
         get() = javaClass.simpleName

    fun  logD(message: String) {
         Log.d(tag, message)
    }

    fun  logE(message: String) {
        Log.e(tag, message)
    }




}



