package com.example.midcalcintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class calculator : AppCompatActivity() {
    lateinit var tv_answer: TextView
    lateinit var edt_firstnumber: EditText
    lateinit var edt_secondnumber: EditText
    lateinit var btn_add: Button
    lateinit var btn_subtract: Button
    lateinit var btn_multiply: Button
    lateinit var btn_divide: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        tv_answer = findViewById(R.id.tv_answer)
        edt_firstnumber = findViewById(R.id.edt_firstnumber)
        edt_secondnumber = findViewById(R.id.edt_secondnumber)
        btn_add = findViewById(R.id.btn_add)
        btn_subtract = findViewById(R.id.btn_subtract)
        btn_multiply= findViewById(R.id.btn_multiply)
        btn_divide = findViewById(R.id.btn_divide)

        btn_add.setOnClickListener {
            var myfirstnumber = edt_firstnumber.text.toString()
            var mysecondnumber = edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&& mysecondnumber.isEmpty()){
                tv_answer.text = "Please fill all the inputs"
            } else {
                var answer = myfirstnumber.toDouble() - mysecondnumber.toDouble()
                tv_answer.text = answer.toString()
            }
        }
        btn_subtract.setOnClickListener {
            var myfirstnumber = edt_firstnumber.text.toString()
            var mysecondnumber = edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&& mysecondnumber.isEmpty()){
                tv_answer.text = "Please fill all the inputs"
            } else {
                var answer = myfirstnumber.toDouble() - mysecondnumber.toDouble()
                tv_answer.text = answer.toString()
            }
        }

        btn_multiply.setOnClickListener {
            var myfirstnumber = edt_firstnumber.text.toString()
            var mysecondnumber = edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&& mysecondnumber.isEmpty()){
                tv_answer.text = "Please fill all the inputs"
            } else {
                var answer = myfirstnumber.toDouble() - mysecondnumber.toDouble()
                tv_answer.text = answer.toString()
            }
        }
        btn_divide.setOnClickListener {
            var myfirstnumber = edt_firstnumber.text.toString()
            var mysecondnumber = edt_secondnumber.text.toString()
            if (myfirstnumber.isEmpty()&& mysecondnumber.isEmpty()){
                tv_answer.text = "Please fill all the inputs"
            } else {
                var answer = myfirstnumber.toDouble() - mysecondnumber.toDouble()
                tv_answer.text = answer.toString()
            }
        }


    }
}