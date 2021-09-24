package com.example.bb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button:Button=findViewById(R.id.nextBut)
        button.setOnClickListener { hello() }
    }
    private fun hello() {
        val name = enterName.editableText.toString()
        val intent = Intent(this,MainActivity2::class.java)
        intent.putExtra("name",name)
        startActivity(intent)
    }
}