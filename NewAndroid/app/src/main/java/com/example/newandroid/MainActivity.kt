package com.example.newandroid

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tx = file.text
        button2.setOnClickListener{ if(tx.isEmpty()) textView2.text ="Please Enter Name" else textView2.text = "Hello $tx"}

        Toast.makeText(this,"Welcome",Toast.LENGTH_LONG)   // Toast Class Used to massage at starting to particular time
            .show()


    }
}