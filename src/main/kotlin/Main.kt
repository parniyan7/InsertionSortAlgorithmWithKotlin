


fun main(args: Array<String>) {
    val testArray = mutableListOf(16, 9, 32, 10, 4)
    println(testArray)
    var orderedArray = insertSort(testArray)
    println(orderedArray)
}


fun insertSort(items:MutableList<Int>):List<Int>{
    if (items.isEmpty() || items.size<2){
        return items
    }
    for (counter in 1 until items.count()){
        // println(items)
        val item = items[counter]
        var i = counter
        while (i>0 && item < items[i - 1]){
            items[i] = items[i - 1]
            i -= 1
        }
        items[i] = item
    }
    return items
}
