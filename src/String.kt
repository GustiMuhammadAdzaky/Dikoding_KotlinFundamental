fun main() {

    println("-----------------Indexing String & For String------------------")

    val text = "kotlin"
    val firstChar = text[0]
    println("$text $firstChar")

    val text1  = "Kotlin"
    for (char in text1){
        println("$char ")
    }

    println("-----------------Escaped String-----------------")
    //\t: menambah tab ke dalam teks.
    //
    //\n: membuat baris baru di dalam teks.
    //
    //\’: menambah karakter single quote kedalam teks.
    //
    //\”: menambah karakter double quote kedalam teks.
    //
    //\\: menambah karakter backslash kedalam teks.

    val statement = "Kotlin is \"Awesome!\""
    println(statement)

//    Unicode
    val name = "Unicode test: \u00A9"
    println(name)

    println("-------------Raw String-------------")

        val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

        println(line)


}