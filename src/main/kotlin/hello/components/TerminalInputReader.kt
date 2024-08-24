package hello.components

class TerminalInputReader : InputReader {
    override fun read(): String {
        print("What is your name? ")
        return readln()
    }
}