package com.example.sayacuygulamasi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sp = getSharedPreferences("GirisSayaci", Context.MODE_PRIVATE)
        //read first then increment the counter & show the last result on the UI

        val editor = sp.edit()
        //editor can save :)

        var sayac = sp.getInt("sayac", 0)//oku
        editor.putInt("sayac", ++sayac) //kaydet
        editor.commit()//otherwise it doesn't save

        textViewSayac.text = "Açılış Sayısı : $sayac"
    }
}