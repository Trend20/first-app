fun main(args: Array<String>) {
    println("Hello World!")

//    DATA-TYPES
    val name: String = "Dave"
    val isComing: Boolean = true
    println(isComing)
    println(name)

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")
}