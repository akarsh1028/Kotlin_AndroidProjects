package com.example.weightcalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var marsweight = 0.38
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            val result = calculateweight(editTextTextPersonName.text.toString().toDouble())
            textView2.text = " Your weight on mars is $result"
        }
    }
    private fun calculateweight (data : Double ) : Double {
        return data * marsweight
    }
}