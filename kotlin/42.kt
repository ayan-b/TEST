fun main(args: Array<String>) {
    var number = 0

    while (number != 42)
    {
        println("Enter number to test: ")
        number = readLine()!!.toInt()
    }
}