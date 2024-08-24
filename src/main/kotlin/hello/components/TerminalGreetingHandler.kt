package hello.components

class TerminalGreetingHandler: GreetingHandler {
    override fun greet(name: String) {
        println("Hello $name! Nice to meet you!")
    }
}