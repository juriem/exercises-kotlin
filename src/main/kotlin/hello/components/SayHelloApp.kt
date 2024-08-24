package hello.components

class SayHelloApp(
    private val reader: InputReader,
    private val greeter: GreetingHandler
) {
    fun start() {
        val name = reader.read()
        greeter.greet(name)
    }
}