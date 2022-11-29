fun main() {
    fun part1(input: List<String>): Int{
        var valid = 0
        for (word in input) {
            val words = word.split(" ")
            if (words.size == words.toSet().size )
                valid += 1

        }
        return valid
    }


    fun part2(input: List<String>): Int {
        return input
            .map { it.split(" ") }
            .count { it.size == it.toSet().size }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 1)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
