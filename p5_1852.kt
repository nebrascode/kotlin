import java.util.Scanner
fun main(){
    val input = Scanner(System.`in`)
    println("Masukkan Jumlah Gaji Pokok Pegawai")
    var gaji_pokok = input.nextDouble()
    var tunjangan : Double
    var gajian : Double

    fun tunjangan_anak() : Double {
        var anak = gaji_pokok*0.5
        return anak
    }
    fun total_gaji(a: Double, b: Double): Double{
        return a+b
    }

    tunjangan = tunjangan_anak()
    gajian = total_gaji(gaji_pokok, tunjangan)
    println("Gaji Pokok = $gaji_pokok")
    println("Tunjangan Anak : $tunjangan")
    println("Total Gaji : Rp.$gajian")

    fun final_gaji(): Double{
        var akhir_gaji: Double
        if (gajian >= 2000000) {
            akhir_gaji = gajian * 0.10
        }

        else if (gajian <= 1000000 && gajian < 2000000){
            akhir_gaji = gajian*0.5
        }

        else {
            akhir_gaji = gajian
        }
        return akhir_gaji
    }
    println(final_gaji())
}