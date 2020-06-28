package com.twoshot22.kotlin_study

// JAVA의 Static
class Book private constructor(val id : Int, val name : String){
    companion object BookFactory : IdProvider{
        val myBook = "new book"

        fun create() = Book(0, myBook)

        override fun getId(): Int {
            return 444
        }
    }
}

interface IdProvider{
    fun getId() : Int
}

fun main(){
    val book = Book.create()
    // val book = Book.companion.create()
    val bookId = Book.BookFactory.getId()

    println("${book.id} ${book.name}")
}