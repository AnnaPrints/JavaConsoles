import java.lang.StringBuilder

fun main() {
    println("Hi!")
    println("\u001B[6n")

    val sb = StringBuilder()
    while (true) {
        val byte = System.`in`.read()
        if (byte == 'R'.code) break
        sb.append(byte.toChar())
    }
    println("Cursor position: $sb")
}