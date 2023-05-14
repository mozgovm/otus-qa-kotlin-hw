package hw1

import kotlin.reflect.full.functions

class TestRunnerImpl : TestRunner {
    override fun <T : Any> runTest(steps: T, test: () -> Unit) {
        //val clazz1 = steps::class.declaredMemberFunctions  // короче и сразу коллекция функций.filter {....
        val clazz = steps::class.java.kotlin
        // val instance = clazz.createInstance()  // излишне
        // а зачем задействовать переменную, если использовать только один раз. Для того и котлин:
        //val setUpMethods =
        clazz.functions.filter { it.name.contains("before") }.forEach {
            println("Starting execution of method ${it.name}")
            it.call(steps)    //it.call(instance)
            println("Ended execution of method ${it.name}")
        }
        test()
        // а зачем задействовать переменную, если использовать только один раз. Для того и котлин:
        //val tearDownMethods =
        clazz.functions.filter { it.name.contains("after") }.forEach {
            println("Starting execution of method ${it.name}")
            it.call(steps)  // it.call(instance)
            println("Ended execution of method ${it.name}")
        }
    }
}