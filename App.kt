/****************************************************************************************************
 *                               Perhatian                                                          *
 *                                                                                                  *
 *          Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:                         *
 *                                                                                                  *
 *          1. Mengubah kode yang berada di dalam fungsi main()                                     *
 *          2. Mengubah atau menghapus kode yang sudah ada secara default                           *
 *          3. Membuat fungsi baru yang bukan merupakan tugas latihan                               *
 *          4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)             *
 *                                                                                                  *
 ***************************************************************************************************/

package com.dicoding.exam.latihan2

/**
 *  TODO 1
 *  Sesuaikan fungsi di bawah ini agar dapat mengembalikkan nilai dengan rumus
 *  perhitungan berikut:
 *
 *      valueA + (valueB - valueC)
 *
 *  Jika valueC bernilai null, silakan tetapkan nilai 50 sebagai nilai default-nya
 */

/**No 1 - Bagian 2
 Menghitung hasil dari ekspresi matematika yang diberikan oleh rumus:
 hasil = valueA + (valueB - (valueC ?: 50))

 @param valueA Nilai pertama yang akan dijumlahkan.
 @param valueB Nilai kedua yang akan dikurangkan dari valueA.
 @param valueC Nilai opsional yang akan digunakan dalam pengurangan (jika ada). Jika null, digunakan nilai default 50.
 @return Hasil dari ekspresi matematika yang dihitung berdasarkan parameter yang diberikan.
 */
fun calculate(valueA: Int, valueB: Int, valueC: Int?): Int {
    return valueA + (valueB - (valueC ?: 50))
}

/**
 *  TODO 2
 *  Sesuaikan fungsi di bawah ini agar dapat mengembalikkan text seperti berikut:
 *
 *      Result is ${result}
 */
/**No 2 - Bagian 2
Fungsi untuk menghitung hasil dari tiga nilai, dimana nilai ketiga dapat menjadi null
Fungsi untuk menghasilkan teks berdasarkan hasil yang diberikan
*/
fun result(result: Int): String {
    return "Result is $result"
}

fun main() {
    // Inisialisasi nilai-nilai yang akan digunakan
    val valueA = 101
    val valueB = 52
    val valueC = 99

    val resultA = calculate(valueA, valueB, valueC)                 // Hitung hasil dengan menggunakan nilai C yang tidak null
    val resultB = calculate(valueA, valueB, null)            // Hitung hasil dengan menggunakan nilai C yang null

    // Cetak hasil menggunakan fungsi result() dan cetak dalam format yang rapi
    println("""
        ${result(resultA)}
        ${result(resultB)}
    """.trimIndent())
}



