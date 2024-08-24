package hello

import hello.components.SayHelloApp
import hello.components.TerminalGreetingHandler
import hello.components.TerminalInputReader

fun main(args: Array<String>) {
    val reader = TerminalInputReader()
    val greetingHandler = TerminalGreetingHandler()

    val app = SayHelloApp(
        reader,
        greetingHandler
    )
    app.start()
}
