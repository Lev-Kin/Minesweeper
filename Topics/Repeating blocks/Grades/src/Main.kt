fun main() {
    val n = readln().toInt()

    val list: ArrayList<Int> = arrayListOf()
    repeat(n) {
        list.add(readln().toInt())
    }

    val a: (Int) -> Boolean = { it == 5 }
    val b: (Int) -> Boolean = { it == 4 }
    val c: (Int) -> Boolean = { it == 3 }
    val d: (Int) -> Boolean = { it == 2 }

    println("${list.count(d)} ${list.count(c)} ${list.count(b)} ${list.count(a)}")

}