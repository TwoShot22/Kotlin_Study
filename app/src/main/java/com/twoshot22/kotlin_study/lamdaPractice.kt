package com.twoshot22.kotlin_study

// 1. Lamda
// 람다식은 우리가 value처럼 다룰 수 있는 익명함수
// 1) 메소드의 파라미터로 넘겨줄 수 있음. fun maxBy(a : Int) 에서 파라미터에 함수를 넣을 수 있는 것
// 2) Return 값으로 함수 넘겨줄 수 있음

// Lamda의 기본 정의
// val lamdaName : Type = {argumentList -> codeBody}

val square = {number : Int -> number * number} // Type 추론이 가능한 것

val nameAge = {name : String, age : Int ->
    "My Name is ${name} I'm ${age}"
} // 람다는 항상 마지막에 있는 코드가 Return 값

fun main(){
    println(square(12))
    println(nameAge("Mansoo", 22))

    val a = "mansoo said"
    val b = "jisu said"

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana", 27))

    println(calculateGrade(98))

    val lamda = {number : Double ->
        number == 4.3212
    }

    println(invokeLamda(lamda))
    println(invokeLamda ({it > 3.22}))
    println(invokeLamda { it > 3.22 })
}

// 확장 함수
// Class를 확장 -> 있는 클래스에 조금 더 무언가를 추가하고 싶을 때 활용
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name : String, age : Int) : String {
    // this는 extendString을 부르는 오브젝트를 가리키는 것
    // it은 하나 들어가는 파라미터일 경우, it으로 생략 가능한 것
    val introduceMySelf : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMySelf(age)
}

// 람다의 Return
// Input Parameter는 언제나 소괄호를 써 줘야 함
val calculateGrade : (Int) -> String = {
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 람다를 표현하는 방법
fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}