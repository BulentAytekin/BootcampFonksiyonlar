package com.example.bootcamptfonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val odev=FonksiyonOdevleri()

        //kilometreyi mil'e dönüştürüyoruz
       val mil= odev.kmToMil(520)
        println("Km to Mil :$mil")


        //dikdörtgen alanı hesaplama

        odev.dikdortgenAlani(5,9)


    }
}