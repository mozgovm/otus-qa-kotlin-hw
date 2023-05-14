import kotlin.reflect.full.createInstance
import kotlin.reflect.full.functions

class TestRunnerImpl : TestRunner {
    override fun <T : Any> runTest(steps: T, test: () -> Unit) {
        val clazz = steps::class.java.kotlin
        val instance = clazz.createInstance()
        val setUpMethods = clazz.functions.filter { it.name.contains("before") }
        val tearDownMethods = clazz.functions.filter { it.name.contains("after") }
        setUpMethods.forEach {
            println("Starting execution of method ${it.name}")
            it.call(instance)
            println("Ended execution of method ${it.name}")
        }
        test()
        tearDownMethods.forEach {
            println("Starting execution of method ${it.name}")
            it.call(instance)
            println("Ended execution of method ${it.name}")
        }
    }
}