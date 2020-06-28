package com.twoshot22.kotlin_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                TODO("Not yet implemented")
            }
        })

        // 1. Kotlin Interface가 아닌 Java Interface여야 함
        // 2. Interface는 하나의 메소드만 가져야 함

        button.setOnClickListener {

        }
    }
}