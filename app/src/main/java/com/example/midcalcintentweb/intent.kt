package com.example.midcalcintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class intent : AppCompatActivity() {
    lateinit var Buttonsms:Button
    lateinit var Buttoncall:Button
    lateinit var Buttondail:Button
    lateinit var Buttonshare:Button
    lateinit var Buttoncamera:Button
    lateinit var Buttonmpesa:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        Buttonsms=findViewById(R.id.btn_sms)
        Buttoncall=findViewById(R.id.btn_call)
        Buttondail=findViewById(R.id.btn_dail)
        Buttonshare=findViewById(R.id.btn_share)
        Buttoncamera=findViewById(R.id.btn_camera)
        Buttonmpesa=findViewById(R.id.btn_mpesa)

        Buttonsms.setOnClickListener {
            val intent= Intent(this,intent::class.java)
            startActivity(intent)
        }
        Buttoncall.setOnClickListener {
            val intent=Intent(this,intent::class.java)
            startActivity(intent)
        }
        Buttondail.setOnClickListener {
            val intent=Intent(this,intent::class.java)
            startActivity(intent)
        }

        Buttonshare.setOnClickListener {
            val intent=Intent(this,intent::class.java)
            startActivity(intent)
        }
        Buttoncamera.setOnClickListener {
            val intent=Intent(this,intent::class.java)
            startActivity(intent)
        }
        Buttonmpesa.setOnClickListener {
            val intent=Intent(this,intent::class.java)
            startActivity(intent)
        }
        }
    }
