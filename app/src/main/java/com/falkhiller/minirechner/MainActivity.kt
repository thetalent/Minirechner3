package com.falkhiller.minirechner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    fun clicked(v: View){
        var but = v as Button
        var zahl = but.text.toString().toInt()
        var sum = summe.text.toString().toInt()
        sum += zahl
        summe.setText(sum.toString())

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
