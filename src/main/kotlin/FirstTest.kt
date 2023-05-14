class FirstTest {
    fun beforeAll() {
        println("Before All")
    }

    fun beforeEach() {
        println("Before each test")
    }

    fun afterEach() {
        println("After each test")
    }

    fun afterAll() {
        println("After All")
    }
}