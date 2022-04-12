
fun main(args: Array<String>) {
    var titular = "Sidney"
    val numeroConta = 1234
    var saldo = -50.0
    println("Bem vindo ao bytebank!")
    println("Olá $titular sua conta é: $numeroConta")
    println("Saldo da conta: $saldo")
    if (saldo > 0.0) {
        println("Sua conta é positiva!")
    } else if(saldo == 0.0) {
        println("Sua conta é neutra.")
    } else {
        println("Sua conta é negativa.")
    }

}


