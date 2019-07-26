fun main() {
    print("버블 정렬 : ")
    val bubble = Bubble.sort(arrayOf(2, 4, 6, 8, 10, 9, 7, 5, 3, 1))
        .joinToString()
    val bubbleIterator = bubble.iterator()
    while (bubbleIterator.hasNext()) {
        print(bubbleIterator.next())
    }
    println()
}