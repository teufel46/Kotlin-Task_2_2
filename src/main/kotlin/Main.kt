fun printMessage(likes: Int){
    var endMessage = ""
    if (likes % 10 == 1) endMessage = "человеку"
    else if (likes % 10 == 2 || likes % 10 == 3 || likes % 10 == 4) endMessage = "людям"
    else endMessage = "человекам"
    println("Понравилось $likes $endMessage")
}

fun main(args: Array<String>) {

    val likes = 65;
    printMessage(likes)
}