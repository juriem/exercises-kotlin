package hello.components

fun main(args: Array<String>) {
    val reader = TerminalInputReader()
    val greetingHandler = TerminalGreetingHandler()

    val app = SayHelloApp(
        reader,
        greetingHandler
    )
    app.start()
}
