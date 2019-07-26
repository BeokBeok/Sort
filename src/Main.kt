fun main() {
    print("버블 정렬 : ")
    val bubble = Bubble.sort(arrayOf(2, 4, 6, 8, 10, 9, 7, 5, 3, 1))
        .joinToString()
    val bubbleIterator = bubble.iterator()
    while (bubbleIterator.hasNext()) {
        print(bubbleIterator.next())
    }
    println()

    print("선택 정렬 : ")
    val select = Select.sort(arrayOf(2, 4, 6, 8, 10, 9, 7, 5, 3, 1))
        .joinToString()
    val selectIterator = select.iterator()
    while (selectIterator.hasNext()) {
        print(selectIterator.next())
    }
    println()
}