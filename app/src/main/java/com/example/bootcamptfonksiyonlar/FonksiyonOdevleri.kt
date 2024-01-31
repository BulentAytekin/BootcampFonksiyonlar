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


    //Parametre olarak girilen sayının faktoryel değerini hesaplayıp geri döndüren metot
    //while döngüsü ile;

    fun faktoryelW(sayi:Int):Long{

        var sayac=sayi
        var sonuc :Long =1

        while (sayac >= 1){

            sonuc*=sayac
            sayac--

        }
        return sonuc
    }

    //Parametre olarak girilen sayının faktoryel değerini hesaplayıp geri döndüren metot
    //for döngüsü ile;
    fun faktoryelF(sayi:Int):Long{

        var sonuc :Long=1
        for (i in 1..sayi){

            sonuc*=i
        }
        return sonuc
    }







}