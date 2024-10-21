package com.example.myfirstapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var editText:EditText
    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var result:TextView
    private lateinit var numbOfChar:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        editText=findViewById(R.id.editText)
        textView=findViewById(R.id.textView)
        result=findViewById(R.id.result)
        button=findViewById(R.id.button)
        numbOfChar=findViewById(R.id.numbOfChar)
        onButtonClick(button)
    }
    fun onButtonClick(view:View){
        val sendText=editText.text
        result.text="Перевернутый текст: ${sendText.reversed()}"
        numbOfChar.text="Количество символов в тексте: ${sendText.filter { it!=' ' }.length}"
    }
}