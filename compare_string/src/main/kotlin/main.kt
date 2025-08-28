fun main() {
    //println("hello world")
    strStr("abcsadbutsad", "sad")

}

fun strStr(haystack: String, needle: String): Int {

    if (needle.length > haystack.length || !haystack.contains(needle)) {
        return -1
    }

    val lastIndex = haystack.length - needle.length

    for (i in 0..lastIndex ) {
        val subString = haystack.substring(i, needle.length + i)
        println("i: $i - " + subString)
        if (subString == needle) {
            return i
        }
    }

    return -1
}
