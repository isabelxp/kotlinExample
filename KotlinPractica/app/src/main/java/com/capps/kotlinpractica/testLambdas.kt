package com.capps.kotlinpractica

fun testLambdas() {

    TODO("( con \"_\" si no se usara la variable es decir =  val res = doOp(_, _, sum) )")

    val sum: (Int, Int) -> Int = { x, y -> x + y}

    val mul ={x: Int, y: Int -> x * y }

    val res = doOp(2, 3, sum) // 6

    val rest2 = doOp(2, 3, mul) // 6


    TODO("Otra manera")

    val rest3 = doOp(2, 3, { x, y -> x - y}) // -1

    val rest4 = doOp(2, 3, ::sum2) // 6
}

fun sum2(x:Int, y:Int) : Int = x + y

fun doOp(x: Int, y: Int, op: (Int, Int) -> Int) = op(x, y)