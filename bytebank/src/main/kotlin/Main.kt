class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun main() {
val contaSidney = Conta()
    contaSidney.titular = "Sidney"
    contaSidney.numero = 1234
    contaSidney.saldo = 10000.0
    println(contaSidney.titular)
    println(contaSidney.numero)
    println(contaSidney.saldo)
}

