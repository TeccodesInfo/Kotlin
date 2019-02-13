fun exibirMensagem( nome: String, idade: Int ){
    //Bloco de códigos
    println("Nome: $nome Idade: $idade ")
}
fun somar(numero1: Int, numero2: Int) : Int {
    
    var total = numero1 + numero2
    return total
    //println( total )
    
}

fun main(args: Array<String>) {
    
    exibirMensagem("Jose", 28)
    var resultado = somar(10,5)
    println( resultado )
    
}