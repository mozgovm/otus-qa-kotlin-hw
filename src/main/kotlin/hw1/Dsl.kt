package hw1

/**
 * Здесь определяется функция DSL  testAround
 * TestAround и есть основной окружающий класс
 * initializer передаваемая ему функция- в этом примере println("§ invoke ... RUNNING")
 * по правилам DSL она выносится за скобки при вызове в лямбду
 * Затем она используется в Main.kt
 *
 */
fun  testRunnerImpl(initializer: TestRunnerImpl.() -> Unit): TestRunnerImpl = TestRunnerImpl().also{ it.initializer() }
