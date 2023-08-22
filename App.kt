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

package com.dicoding.exam.latihan1

/**
 *  TODO 1
 *  Sesuaikan fungsi di bawah ini dengan kode untuk mengecek apakah parameter number
 *  merupakan angka genap
 */

//No 1 - Bagian 1
fun isEvenNumber(number: Int) = number % 2 == 0 // Tugas pertama, kita mau cek apakah suatu angka itu genap atau tidak. Jadi, misalnya, kalau bisa dibagi dua, itu artinya angka genap.

/**
 *  TODO 2
 *  Sesuaikan fungsi di bawah ini dengan kode untuk mengecek apakah parameter number
 *  lebih dari 5
 */

//No 2 - Bagian 1
fun moreThanFive(number: Int) = number > 5 // Tugas kedua, kita mau lihat apakah suatu angka itu lebih dari lima atau nggak. Nah, kalau lebih dari lima, kita bisa bilang angkanya gede ya.



/**
 *  TODO 3
 *  Sesuaikan fungsi di bawah ini agar dapat menghasilkan nilai akhir dengan
 *  rumus:
 *
 *      param * ( param + 10 )
 */
//No 3 - Bagian 1
// Kita mau hitung nilai hasil dari sesuatu berdasarkan rumus ini:
// "angka tersebut dikali dengan angka itu sendiri ditambah sepuluh"

fun result(number: Int) = number * (number + 10)

fun main() {
    // Nah, sekarang kita mau main-main dengan angka.
    // Kita bikin daftar angka dari satu sampai seratus, seru kan?

    val listNumber = 1.rangeTo(100)

    // Oke, sekarang kita mau lihat-lihat satu-satu deh.

    for (number in listNumber) {
        // Pertama-tama, cek dahulu, apakah angkanya itu genap?
        // Kalau iya, lewati saja, tidak perlu dihitung.

        if (isEvenNumber(number)) continue

        // Sekarang, kita mau cek, apakah angkanya lebih dari lima?
        // Kalau iya, berarti kita udah cukup, keluar aja dari main loop.

        if (moreThanFive(number)) break

        // Nah, kalau kedua tugas di atas nggak terpenuhi, artinya kita punya angka yang menarik.
        // Kita hitung nilai hasilnya berdasarkan rumus kita tadi, trus kita kasih tau hasilnya.

        val result = result(number)
        println("Hasil hitung dari angka di range ini adalah $result")
    }
}
