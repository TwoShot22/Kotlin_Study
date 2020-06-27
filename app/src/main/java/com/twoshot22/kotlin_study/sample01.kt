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


    forAndWhile()
    */

    nullcheck()
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

// 5. Array vs List
// Array는 메모리가 할당 된 상태로 나옴 -> 처음에 크기 지정
// ImmutableList (수정 불가능) vs MutableList (수정 가능)

fun array(){
    // arrayOf -> 배열 초기화
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    // Array는 Mutable
    array[0] = 3

    // List는 읽기 전용 (Immutable) / List는 Interface
    var result = list.get(0)

    // 메모리 주소가 변하지 않기 때문에 val 사용
    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
}

// 6. 반복문

fun forAndWhile(){
    val students = arrayListOf("mansoo", "jisu", "jeonghoon")

    for(name in students){
        println("${name}")
    }
    
    // Dictionary?
    for((index, name) in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    var sum : Int = 0
    // 증감식은 step or downTo
    // 1..100 과 1 until 100 으로 표현 가능 -> But until은 100 미만까지!
    for(i in 1..10 step 2){
        sum += i
    }
    println(sum)

    var index : Int = 0
    while(index <= 10){
        println("Current Index is ${index}")
        index++
    }
}

// 7. Nullable / NonNull

fun nullcheck(){
    // NPE : Null Pointer Exception
    // JAVA에서는 Compile 단계에서 감지가 안 되고 Runtime에서만 감지되기 때문에 실행해봐야 알 수 있었음
    // Kotlin은 ?을 활용해 Compile 단계에서부터 감지

    var name : String = "Mansoo"

    var nullName : String? = null // nullable type

    var nameInUpperCase = name.toUpperCase()

    var nullNameInUpperCase = nullName?.toUpperCase() // ?를 붙이면 null인지 아닌지에 따라 추론하는 것

    // ?. 바로 Null을 반환 / ?: (엘비스 연산자) : Default 값을 주고 싶을 때
    val lastName : String ?= null

    val fullName = name + (lastName?: "NO lastName")
    println(fullName)
}

// !! - Null이 아닌 것을 보증해 주는 것 (정말 확실하지 않은 이상은 사용 X)
fun ignoreNulls(str : String?){
    val mNotNull : String = str!!
    var upper : String = mNotNull.toUpperCase()

    val email : String = "mansoo0621@likelion.org"
    
    // let -> 자신의 Receiver 객체를 Lambda 식 내부로 옮겨서 실행하는 것
    // 이메일을 람다식 내부로 옮겨주는 것
    email?.let{
        println("my email is ${email}")
    }
}