import kotlin.random.Random

fun makeDecision(): String = when (Random.nextInt(from = 1, until = 4)) {
    1 -> "Rock"
    2 -> "Paper"
    else -> "Scissors"
}
