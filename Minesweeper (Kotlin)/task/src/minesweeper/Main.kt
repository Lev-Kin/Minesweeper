package minesweeper

import kotlin.random.Random

fun main() {
    val rand = Random(System.currentTimeMillis())
    val field = StringBuilder(
        """
        .........
        .........
        .........
        .........
        .........
        .........
        .........
        .........
        .........
    """.trimIndent()
    )

    print("How many mines do you want on the field?")
    var mineCount = readln().toInt()

    while (mineCount > 0) {
        val minePosition = rand.nextInt(80)
        if (field[minePosition] == '.') {
            field[minePosition] = 'X'
            mineCount--
        }
    }

    println(field)
}
