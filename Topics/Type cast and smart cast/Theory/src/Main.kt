// You can experiment here, it won’t be checked

fun main() {
    val list1 = listOf("apple", "banana", "orange")
    val list2 = listOf("banana", "orange", "grapefruit", "apple")

    val allElementsInList = allElementsInList(list1, list2)
    println(allElementsInList)
}

fun <T> allElementsInList(list1: List<T>, list2: List<T>): Boolean {
    for (element in list1) {
        if (!list2.contains(element as? T)) {
            return false
        }
    }
    return true
}
