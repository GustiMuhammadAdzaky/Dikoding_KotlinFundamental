fun main() {
    val user = setUser("Alfian", 19)
    println(user)

    printUser("Alfian")

    var Cetak = cobaTambah(20,20)
    println(Cetak)
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}

fun cobaTambah(angkapertama: Int, angkakedua: Int): Int {
    var jumlahlah = angkakedua + angkapertama
    return jumlahlah
}