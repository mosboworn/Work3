package com.example.assignment51

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text:TextView=findViewById(R.id.text001)
        var add:Button=findViewById(R.id.button)
        var minus:Button=findViewById(R.id.button2)
        var reset:Button=findViewById(R.id.button3)
     add.setOnClickListener() {
         var text1 = text.text.toString().toInt()
         if (text1 in 0..8) {
             text1 = text1 + 1
             text.setText(text1.toString())
         } else {
             var toast=Toast.makeText(applicationContext, "ถึงค่าสุงสุดแล้ว", Toast.LENGTH_LONG)
                 toast.show()
         }
     }
         minus.setOnClickListener() {
             var text2 = text.text.toString().toInt()
             if (text2 in 1..9) {
                 text2 = text2-1
                 text.setText(text2.toString())
             }else if (text2==0) {
                 var toast=Toast.makeText(applicationContext, "ไม่สามารถลดได้แล้ว", Toast.LENGTH_LONG)
                 toast.show()
             }
     }
        reset.setOnClickListener(){
            var text3 = text.text.toString().toInt()
            text3 = 0
            text.setText(text3.toString())
        }
    }
}