package com.example.buttonapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.graphics.green
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
    lateinit var addButton: Button
    lateinit var subButton: Button
    lateinit var myCounter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myCounter = findViewById(R.id.textView)
        addButton = findViewById(R.id.Add)
        subButton = findViewById(R.id.Subtraction)

        addButton.setOnClickListener(View.OnClickListener {
            Add()
        })

        subButton.setOnClickListener((View.OnClickListener {
            Subtraction()
        }))
    }

    fun Add() {
        myCounter.text = (myCounter.text.toString().toInt() + 1).toString()
       when{
           myCounter.text.toString().toInt()==0 ->  myCounter.setTextColor(Color.parseColor( "#B388D8"))
           myCounter.text.toString().toInt()>0 ->  myCounter.setTextColor(Color.parseColor( "#FF3700B3"))
           myCounter.text.toString().toInt()<0 ->  myCounter.setTextColor(Color.parseColor( "#FF3700B3"))

       }
    }

    fun Subtraction() {
        myCounter.text = (myCounter.text.toString().toInt() - 1).toString()
        when{
            myCounter.text.toString().toInt()==0 ->  myCounter.setTextColor(Color.parseColor( "#B388D8"))
            myCounter.text.toString().toInt()>0 ->  myCounter.setTextColor(Color.parseColor( "#FF3700B3"))
            myCounter.text.toString().toInt()<0 ->  myCounter.setTextColor(Color.parseColor( "#FF018786"))

        }
    }
}