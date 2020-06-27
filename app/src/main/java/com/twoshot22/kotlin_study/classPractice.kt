package com.twoshot22.kotlin_study

// Constructor (constructor 생략 가능)
open class Human(val name : String = "annoymous") { // (name : String = "Annoymous")와 같이 미리 명시 가능
    constructor(name : String, age : Int) : this(name){
        println("my name is ${name}, ${age} years old")
    }

    // Init이 무조건 가장 먼저 실행 -> Constructor 실행
    init{
        println("New Human has been born!!")
    }

    fun eatingCake(){
        println("This is so YUMMMMY!!")
    }

    open fun singASong(){
        println("lalala")
    }
}

// Extends 는 : 로 작성 (Kotlin의 클래스는 Final 클래스 -> 같은 파일 안에 있어도 서로 볼 수 없어서 open이라고 작성해야 함)
class Korean : Human(){
    // Override
    override fun singASong(){
        super.singASong()
        println("랄랄라")
    }
}

fun main(){
    // Instance 생성 -> new 사용 안함
//    var human = Human("mansoo")
//
//    human.eatingCake()

    val mom = Human("Kuri", 32)

    var korean = Korean()
    korean.singASong()


//    println("Name is ${human.name}")
}