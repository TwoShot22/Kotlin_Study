package com.twoshot22.kotlin_study

// Singleton Pattern
// 실행이 될 때 클래스 파일을 읽을 때 객체를 한 번 생성하고 다시 생성하지 않음 -> 불필요한 메모리 방지
object CarFactory{ // Instance 1개
    val cars = mutableListOf<Car>()

    fun makeCar(horsePower : Int) : Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower: Int)

fun main(){
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}