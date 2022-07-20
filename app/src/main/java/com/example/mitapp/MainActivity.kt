package com.example.mitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var Buttoncalc: Button?=null
    var ButtonIntenet: Button?=null
    var ButtonWeb: Button?=null
    var ButtonInterface: Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttoncalc=findViewById(R.id.btn_calc)
        ButtonIntenet=findViewById(R.id.btn_intenet)
        ButtonWeb=findViewById(R.id.btn_web)
        ButtonInterface=findViewById(R.id.btn_interface)

        Buttoncalc!!.setOnClickListener {
            val intenet=Intent(this,calculatorActivity::class.java)
            startActivity(intenet)
        }
        ButtonIntenet!!.setOnClickListener {
            val intenet=Intent(this,IntenetActivity::class.java)
            startActivity(intenet)
        }
        ButtonWeb!!.setOnClickListener {
            val intenet=Intent(this,webActivity::class.java)
            startActivity(intenet)
        }

        ButtonInterface!!.setOnClickListener {
            val intenet=Intent(this,interfaceActivity::class.java)
            startActivity(intenet)
        }

    }
}