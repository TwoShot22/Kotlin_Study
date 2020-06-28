package com.twoshot22.kotlin_study

// pojo (메소드가 있는 것이 아닌 틀 같은 클래스)
data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)

// toString(), hashCode(), equals(), copy() -> Body 없이 이러한 메소드들이 모두 만들어짐


fun main(){
    val ticketA = Ticket("koreanAir", "mansoo", "2020-02-16", 14)
}