package com.example.bootcamptfonksiyonlar

class FonksiyonOdevleri {

 //Parametre olarak girilen kilometreyi mil'e dönüştürdükten sonra geri döndüren metot (mil = km*0.621)
    fun kmToMil(km:Int):Double{

        return km*0.621
    }

    //Kenarları parametre olarak girilen ve dikdörtgen alanını hesaplayan metot
    fun dikdortgenAlani(kısaKenar:Int,uzunKenar:Int){

        val alan= kısaKenar*uzunKenar
        println("Dikdörtgenin Alanı : ${kısaKenar*uzunKenar}")
    }






}