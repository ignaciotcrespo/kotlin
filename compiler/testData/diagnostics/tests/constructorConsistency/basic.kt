class My {
    val x: Int

    constructor() {
        val y = bar(<!DEBUG_INFO_LEAKING_THIS!>this<!>)
        val z = <!DEBUG_INFO_LEAKING_THIS!>foo()<!>
        x = y + z
    }

    fun foo() = x
}

fun bar(arg: My): Int = arg.x
