package hw1

interface TestRunner {
    fun<T : Any> runTest(steps: T, test: () -> Unit)
}