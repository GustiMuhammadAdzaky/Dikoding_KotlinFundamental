//Characters direpresentasikan menggunakan tipe Char. Untuk mendefinisikan sebuah variabel dengan tipe data Char kita bisa
//menggunakan tanda kutip tunggal (' ') seperti berikut:
//
//val character = 'A'
//Tipe data Char hanya dapat kita gunakan untuk menyimpan karakter tunggal. Sebaliknya jika kita memasukkan lebih dari 1 (satu)
//karakter, akan terjadi eror:
//
//val character: Char = 'ABC' // Incorrect character literal
//Yang menarik, kita bisa melakukan operasi increment (++) dan decrement (--) pada sebuah variabel dengan tipe data Char
//seperti berikut:
fun main() {
    var vocal = 'A'

    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
}