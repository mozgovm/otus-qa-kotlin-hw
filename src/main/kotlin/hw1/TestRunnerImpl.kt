package hw1

import kotlin.reflect.full.functions

class TestRunnerImpl : TestRunner {
    override fun <T : Any> runTest(steps: T, test: () -> Unit) {
        //val clazz1 = steps::class.declaredMemberFunctions  // короче и сразу коллекция функций.filter {....
        val clazz = steps::class.java.kotlin
        // val instance = clazz.createInstance()  // излишне
        // можно не задействовать переменную, если использовать только один раз, Котлин дает такую возможность
        // val setUpMethods =
        clazz.functions.filter { it.name.contains("before") }.forEach {
            println("Starting execution of method ${it.name}")
            it.call(steps)    //it.call(instance)
            println("Ended execution of method ${it.name}")
        }
        test()
        // можно не задействовать переменную, если использовать только один раз
        //val tearDownMethods =
        clazz.functions.filter { it.name.contains("after") }.forEach {
            println("Starting execution of method ${it.name}")
            it.call(steps)  // it.call(instance)
            println("Ended execution of method ${it.name}")
        }
    }
}