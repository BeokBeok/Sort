object Bubble {
    fun sort(arr: Array<Int>): Array<Int> {
        for (i in 1..arr.size) {
            for (j in 0 until arr.size - 1) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1]
                    arr[j + 1] = arr[j] - arr[j + 1]
                    arr[j] = arr[j] - arr[j + 1]
                }
            }
        }
        return arr
    }
}