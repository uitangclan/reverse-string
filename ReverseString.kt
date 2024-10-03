fun main() {
    var s = charArrayOf('h','e','l','l','o')
    reverseString(s)
}

fun reverseString(s: CharArray) {
    helper(s, 0, s.size - 1)
}

tailrec fun helper(arr:CharArray, left:Int, right:Int) {
    if (right <= left) return
    arr[left] = arr[right].also {arr[right] = arr[left]}
    helper(arr, left + 1, right - 1)
}