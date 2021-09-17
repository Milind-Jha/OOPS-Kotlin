fun main(){
    val word = readLine()?:""
    val reverse = reverseWord(word)
    println(reverse)
}

fun reverseWord(word: String): String {
    if (word.length==1){
        return word
    }
    val reverse=reverseWord(word.substring(1))
    return reverse + word[0]
}
