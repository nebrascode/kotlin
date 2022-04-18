import java.util.Scanner;
fun main (args:Array<String>) {
   var input=Scanner(System.`in`)
   var sisi: Int
   var hasilkb: Int
   var panjang: Int
   var lebar: Int
   var hasilpp : Int

   println(" ---Menghitung Volume Kubus--- ")
    println()
    print("Masukkan Panjang Sisi Kubus = ")
    sisi=input.nextInt()
    hasilkb=sisi*sisi*sisi
    println("Jadi, hasil volume kubus adalah = $hasilkb")
    println()
    println("======================================")

    println("---Menghitung Luas Persegi Panjang---")
    print("Masukkan panjang = ")
    panjang=input.nextInt()
    print("Masukkan lebar = ")
    lebar=input.nextInt()
    hasilpp=panjang*lebar
    println("Jadi, hasil Luas Persegi Panjang adalah = $hasilpp ")







}