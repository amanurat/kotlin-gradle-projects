package griffio.fizzbuzzes.functional.maybe

fun main(args: Array<String>) {

    val j100 = Maybe.Just(100)
    val (actual) = j100

    println(j100)
    println(actual)

}

sealed class Maybe<out T> {
    object None : Maybe<Nothing>()
    class Just<T>(val t: T) : Maybe<T>() {
        operator fun component1(): T {
            return t
        }
    }
}

