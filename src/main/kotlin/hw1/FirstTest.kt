package hw1

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

class SecondTest {

    fun beforeStart() {
        println("Before Start")
    }

    fun afterAll() {
        println("After All")
    }

    fun afterEach() {
        println("After each test")
    }

    fun beforeEach() {
        println("Before each test")
    }

    fun beforeAll() {
        println("Before All")
    }

}

class EmptyTest {
}