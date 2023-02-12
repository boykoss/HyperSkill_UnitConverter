package converter

fun main() {

    println("Enter a number and a measure of length:")
    val list = readln().split(" ")
    var num = list[0].toFloat()
    var measure = list[1].lowercase()

    val meters = mutableListOf("m", "meter", "meters")
    val kilometers = mutableListOf("km", "kilometer", "kilometers")
    val centimeters = mutableListOf("cm", "centimeter", "centimeters")
    val millimeters = mutableListOf("mm", "millimeter", "millimeters")
    val miles = mutableListOf("mi", "mile", "miles")
    val yards = mutableListOf("yd", "yard", "yards")
    val feet = mutableListOf("ft", "foot", "feet")
    val inches = mutableListOf("in", "inch", "inches")

    val metricList = mutableListOf(meters, kilometers, centimeters, millimeters, miles, yards, feet, inches)
    fun calculate(num: Float, measure: String) {
        var result = 0.0
        var a = ""
        var b = ""

        when (measure) {
            in meters -> result = num * 1.0
            in kilometers -> result = num * 1000.0
            in centimeters -> result = num * 0.01
            in millimeters -> result = num * 0.001
            in miles -> result = num * 1609.35
            in yards -> result = num * 0.9144
            in feet -> result = num * 0.3048
            in inches -> result = num * 0.0254
        }

        if (measure in meters) {
            if (num.toInt() == 1) {
                a = meters[1]
            } else {
                a = meters[2]
            }

        }
        if (measure in kilometers) {
            if (num.toInt() == 1) {
                a = kilometers[1]
            } else {
                a = kilometers[2]
            }
        }
        if (measure in centimeters) {
            if (num.toInt() == 1) {
                a = centimeters[1]
            } else {
                a = centimeters[2]
            }
        }
        if (measure in millimeters) {
            if (num.toInt() == 1) {
                a = millimeters[1]
            } else {
                a = millimeters[2]
            }
        }
        if (measure in miles) {
            if (num.toInt() == 1) {
                a = miles[1]
            } else {
                a = miles[2]
            }
        }
        if (measure in yards) {
            if (num.toInt() == 1) {
                a = yards[1]
            } else {
                a = yards[2]
            }
        }
        if (measure in feet) {
            if (num.toInt() == 1) {
                a = feet[1]
            } else {
                a = feet[2]
            }
        }
        if (measure in inches) {
            if (num.toInt() == 1) {
                a = inches[1]
            } else {
                a = inches[2]
            }
        }


        if (result.toInt() == 1) {
            b = "meter"
        } else {
            b = "meters"
        }
        println("$num $a is $result $b")

    }



        if (measure !in metricList.joinToString()) {
            println("Wrong input. Unknown unit $measure")
        } else {
            calculate(num, measure)
        }
    }


