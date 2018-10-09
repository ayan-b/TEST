object Forty2 {
    
    def main(args: Array[String]): Unit = {
        while (true) {
            var x = StdIn.readInt()
            println(x)
            if (x == 42) return
        }
    }
}