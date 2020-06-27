package com.twoshot22.kotlin_study

// Entry Point
fun main(){/*
    helloWorld()
    println(add(4, 3))

    // 3. String Template -> $변수이름 or ${변수이름}
    val name = "Mansoo"
    val lastName = "Kim"
    println("My Name is ${name + lastName}I'm 22")
    println("this is 2\$ma'am")
    */
}

// 1. 함수
// Kotlin은 Return과 상관없이 fun / Return이 없을 때는 : Unit이라고 작성 or 생략
fun helloWorld(){
    println("Hello World!")
}

// 변수 이름 : 변수 타입 / int가 아닌 Int로 작성
fun add(a : Int, b : Int) : Int {
    return a + b
}

// 2. val & var
// val = value (상수, 변하지 않는 값)
// var = variable

fun hi(){
    val a : Int = 10
    var b : Int = 9
    
    // Type 안 써도 무관 / 단, val이나 var은 꼭 작성!
    val c = 100
    var d = 100

    // 바로 값을 할당하지 않는 변수는 꼭 Type 명시 필요
    var e : String
}

// 4. 조건식
fun maxBy(a : Int, b : Int) : Int{
    if(a > b){
        return a
    } else {
        return b
    }
}

// 간단한 조건식 표현문
fun maxBy2(a : Int, b : Int) = if(a > b) a else b

fun checkNum(score : Int){
    // Java : Switch
    when(score){
        0 -> println("This is 0")
        1 -> println("This is 1")
        // 복수 Case 가능
        2,3 -> println("This is 2 or 3")
        else -> println("I don't know")
    } // Statement

    // When은 Return 식으로도 쓰일 수 있음 (단, else 사용 필수)
    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    } // Expression

    println("b : ${b}")

    when(score){
        in 90..100 -> println("You are good")
        in 10..80 -> println("SoSo")
        else -> println("Okay")
    }
}

// Expression (뚝딱뚝딱해서 값을 만들어 냄) vs Statement (명령 지시)
// Kotlin에서 모든 함수는 Expression!! (void도 return Unit 하는 것)
// Kotlin에서는 if문의 조건문을 Statement 뿐만 아니라 Expression도 활용 가능
