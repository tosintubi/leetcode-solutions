class LargestPositiveInteger {

    val maximumLargestNumber: (IntArray) -> Int = {
        it.run {
            filter { n ->
                contains(-n)
            }.max() ?: (-1)
        }
    }
}