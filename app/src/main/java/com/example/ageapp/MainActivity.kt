package com.example.ageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buFindmyage.setOnClickListener {
            val yearOfBirth:Int = txtYearofbirth.text.toString().toInt()
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            val myAge = currentYear - yearOfBirth
            tvShowAge.text = Editable.Factory.getInstance().newEditable(myAge.toString())
        }

    }
}
