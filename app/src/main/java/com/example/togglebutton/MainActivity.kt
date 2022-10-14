package com.example.togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    lateinit var img : ImageView
    lateinit var togglebutton : ToggleButton
    lateinit var text : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img = findViewById(R.id.img)
        togglebutton = findViewById(R.id.togglebutton)
        text = findViewById(R.id.text)
        togglebutton.isChecked = true

        togglebutton.setOnCheckedChangeListener{
            buttonView, isChecked ->
            if (isChecked){
                img.visibility = View.VISIBLE
                text.setText("L'image est visible")


            }
            else {
                img.visibility = View.INVISIBLE
            }
        }


    }
}