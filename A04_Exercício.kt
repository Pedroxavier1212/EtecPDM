fun main() {
    // B:
    var nome: String = "Pedro Xavier"

    // C:
    var text: String? = null

    // D:
    val numeroValor: Byte = 40

    // E:
    val pibBr: Long = 10_900_000_000_000_000L

    // F:
    val habitantesBrasil: Int = 212_600_000

    // G:
    val pibCapita = pibBr / habitantesBrasil
    println("PIB per capita: R$$pibCapita")
}
