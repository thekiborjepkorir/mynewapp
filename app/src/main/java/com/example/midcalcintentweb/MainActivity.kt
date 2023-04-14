package com.example.midcalcintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var ButtonCalc:Button
    lateinit var Buttonintent:Button
    lateinit var ButtonWeb:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonCalc=findViewById(R.id.Btn_cal)
        Buttonintent=findViewById(R.id.Btn_int)
        ButtonWeb=findViewById(R.id.Btn_web)

        ButtonCalc.setOnClickListener {
            val intent=Intent(this,calculator::class.java)
            startActivity(intent)
        }
        Buttonintent.setOnClickListener {
            val intent=Intent(this,intent::class .java)
            startActivity(intent)
        }
        ButtonWeb.setOnClickListener {
            val intent=Intent(this,web::class.java)
            startActivity(intent)
        }


    }
}