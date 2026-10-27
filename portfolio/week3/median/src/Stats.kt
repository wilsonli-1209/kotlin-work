fun median(numbers: List<Float>): Float {
    require(numbers.isNotEmpty()) {
        "Cannot calculate median of an empty list"
    }

    val sorted = numbers.sorted()
    val middle = sorted.size / 2

    return if (sorted.size % 2 == 0) {
        (sorted[middle - 1] + sorted[middle]) / 2f
    } else {
        sorted[middle]
    }
}