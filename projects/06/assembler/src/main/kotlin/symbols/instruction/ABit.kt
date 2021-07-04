package symbols.instruction

class ABit private constructor() {
    companion object {
        private val INSTANCE = ABit()

        fun lookUp(symbol: String?): String = INSTANCE.lookUp(symbol)
    }

    fun lookUp(symbol: String?): String {
        return when {
            symbol.isNullOrEmpty() -> "0"
            symbol.contains("M") -> "1"
            else -> "0"
        }
    }
}