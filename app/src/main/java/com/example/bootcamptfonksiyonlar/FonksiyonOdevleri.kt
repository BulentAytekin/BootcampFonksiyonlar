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


    //Parametre olarak girilen kelimenin içinde kaç adet 'e' harfi olduğunu gösteren metod

    fun eSayisi(kelime:String){
        var sayac=0
        for ( i in kelime){
            if (i== 'e' || i== 'E'){
                sayac++

            }
        }
        println("cümledeki toplam e veya E harfi sayısı : $sayac")
    }


    //Parametre olarak girilen kenar sayısına göre her bir iç açıyı hesaplayıp sonucu geri döndüren metod
    // her bir iç açı hesaplaması =((kenar sayısı-2)* 180)/kenar sayısı

    fun herBirAci(kenarSayisi:Int):Int{

        val herAci=((kenarSayisi - 2)*180)/kenarSayisi
        return herAci
    }

    //Parametre olarak girilen kenar sayısına göre iç açılar toplamını hesaplayıp sonucu geri döndüren metod
    // iç açılar toplamı =(kenar sayısı-2)* 180
    fun icAcilarToplami(kenarSayisi: Int):Int{

        val icAcilarToplami=(kenarSayisi-2)*180
        return icAcilarToplami
    }


    //Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod
    //1.)1 günde 8 saat çalışılabilir
    //2.)çalışma saat ücreti 40 tl
    //3.)Mesai saat ücreti 80 tl
    //4.) 150 saat üzeri mesai sayılır

    fun maasHesapla(gun:Int):Int{

        var mesai=0
        var saat =gun*8

        if (saat>150){
            mesai=saat-150
            var  mesaiUcreti =mesai*80
            var ucret=150*40
            return  mesaiUcreti+ucret
        }

        return saat*40
    }






}