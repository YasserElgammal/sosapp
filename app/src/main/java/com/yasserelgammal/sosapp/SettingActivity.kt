package com.yasserelgammal.sosapp

import android.content.Context
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_setting.*

class SettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        val myPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val sosNum =  myPref.getString("sosNumber","")
        editTextSos.hint = sosNum.toString()

        saveSettings.setOnClickListener {
        saveSet()
        }


    }

    private fun saveSet() {
    if (editTextSos.text.isEmpty()){
        editTextSos.error = "Please enter a name"
        return
    }
    val myPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = myPref.edit()
        editor.putString("sosNumber",editTextSos.text.toString())
        editor.apply()
        Toast.makeText(this,"Data Saved",Toast.LENGTH_SHORT).show()
    }

}