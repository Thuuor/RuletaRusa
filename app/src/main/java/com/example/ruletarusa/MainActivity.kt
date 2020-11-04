package com.example.ruletarusa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uno = findViewById(R.id.button) as Button
        val dos = findViewById(R.id.button2) as Button
        val tres = findViewById(R.id.button3) as Button
        val cuatro = findViewById(R.id.button4) as Button
        val cinco = findViewById(R.id.button5) as Button
        val seis = findViewById(R.id.button6) as Button

        val bang = findViewById(R.id.textView) as TextView
        val color = findViewById(R.id.colorlayout) as FrameLayout

        val reload = findViewById(R.id.button7) as Button

        var list = ArrayList<Button>()
        list.add(uno)
        list.add(dos)
        list.add(tres)
        list.add(cuatro)
        list.add(cinco)
        list.add(seis)

        var numRand : Int = random()

        uno.setOnClickListener {
            uno.isEnabled = false
            comprobar(numRand,color,bang,1,list)
        }

        dos.setOnClickListener {
            dos.isEnabled = false
            comprobar(numRand,color,bang,2,list)
        }

        tres.setOnClickListener {
            tres.isEnabled = false
            comprobar(numRand,color,bang,3,list)
        }

        cuatro.setOnClickListener {
            cuatro.isEnabled = false
            comprobar(numRand,color,bang,4,list)
        }

        cinco.setOnClickListener {
            cinco.isEnabled = false
            comprobar(numRand,color,bang,5,list)
        }

        seis.setOnClickListener {
            seis.isEnabled = false
            comprobar(numRand,color,bang,6,list)
        }

        reload.setOnClickListener {
            numRand = random()
            for (i in 0 until list.size){
                list.get(i).isEnabled = true
            }
            color.setBackgroundResource(R.color.colorPrimary)
            bang.setText("")
        }

    }

    fun random(): Int{
        var rand = ((Math.random() * 6)+1).toInt()
        return rand
    }

    fun comprobar(numRand: Int,f: FrameLayout,text: TextView,num: Int,list: ArrayList<Button>){
        if(numRand == num){
            f.setBackgroundResource(R.color.colorAccent)
            text.setText("¡Bang!")
            for (i in 0 until list.size){
                list.get(i).isEnabled = false
            }
        }
    }
}