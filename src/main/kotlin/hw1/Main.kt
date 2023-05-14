package hw1

fun main() {
    println("========First Student================")
    // без DSL
    TestRunnerImpl().runTest(FirstTest()) {
        println("FirstTest func execution")
    }

    // самыQ простой DSL:
    println("========First DSL================")
    testRunnerImpl {
        runTest(FirstTest()) { println("§ invoke test FirstTest() RUNNING") }
    }
    println("========SecondTest DSL================")
    testRunnerImpl {
        runTest(SecondTest()) { println("§ invoke test SecondTest() RUNNING") }
    }
    println("========Empty DSL================")
    testRunnerImpl {
        runTest(EmptyTest()) { println("§ invoke test EmptyTest() RUNNING") }
    }
}