package converter

fun main() {

    println("Enter a number and a measure:")
    val list = readln().split(" ")
    var num = list[0].toInt()
    var measure = list[1]

    if (measure.lowercase() != "km" && measure.lowercase() != "kilometers" && measure.lowercase() != "kilometer") {
        println("Wrong input")
    } else {
        reformat(num)
    }
}

fun reformat(km: Int) {
    var result = km * 1000
    if (km == 1) {
        println("$km kilometer is $result meters")
    } else {
        println("$km kilometers is $result meters")
    }
}
