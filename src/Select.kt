object Select {
    fun sort(arr: Array<Int>): Array<Int> {
        for (i in 0 until arr.size - 1) {
            var min = i
            for (j in i until arr.size) {
                if (arr[min] > arr[j]) {
                    min = j
                }
            }
            if (i != min) {
                arr[i] = arr[i] + arr[min]
                arr[min] = arr[i] - arr[min]
                arr[i] = arr[i] - arr[min]
            }
        }
        return arr
    }
}