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

        //faktoryel hesaplama while döngüsü ile

        val sonuc =odev.faktoryelW(5)
        println("faktoryel while ile sonuc : $sonuc")

        //faktoryel hesaplama for döngüsü ile

        val sonuc1=odev.faktoryelF(7)
        println("faktoryel for ile sonuc :$sonuc1")


        //Girilen kelime içindeki 'e' harfinin sayısını buluyoruz
        odev.eSayisi("kelimeler içindeki e'lerin adediBoot")



    }






}