fun main() {
 removeVowel("I am a mountain of fire member")
}

fun removeVowel(words:String){
    for (char in words){
        if (char =='a'
            || char == 'A'
            || char == 'e'
            || char == 'E'
            || char == 'i'
            || char == 'I'
            || char == 'o'
            || char == 'O'
            || char == 'u'
            || char == 'U'
        ){
            continue
        }
        print (char)
    }
}
