object Insert {
    fun sort(arr: Array<Int>): Array<Int> {
        var key: Int
        var j: Int
        for (i in 1 until arr.size) {
            key = arr[i]
            // Kotlin 에서는 3 가지 구성 형식을 가진 for 문을 지원하지 않는다.
            j = i - 1
            while (j >= 0) {
                if (arr[j] > key) {
                    arr[j + 1] = arr[j]
                } else {
                    break
                }
                j--
            }
            arr[j + 1] = key
        }
        return arr
    }
}