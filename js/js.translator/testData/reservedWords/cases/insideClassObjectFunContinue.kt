package foo

// NOTE THIS FILE IS AUTO-GENERATED by the generateTestDataForReservedWords.kt. DO NOT EDIT!

class TestClass {
    companion object {
        fun `continue`() { `continue`() }

        fun test() {
            testNotRenamed("continue", { `continue`() })
        }
    }
}

fun box(): String {
    TestClass.test()

    return "OK"
}