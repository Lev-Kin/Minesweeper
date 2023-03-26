fun main() {
    val n = readLine()!!.toInt()
    var larg = 0
    var small = 0
    var perfect = 0
    repeat(n) {
        val x = readLine()!!.toInt()
        if (x == 0) perfect++
        else if (x == 1) larg++
        else if (x == -1) small++
    }
    print("$perfect $larg $small")
}