// Decraracao de variaveis e constantes.

fun main(args: Array<String>) {
 
    //Ao utilizar var, é criado uma variável mutável
    var usuario = "Paulo"
    usuario = "Maria"
    
    // Ao utilizar val, é criada uma constante 
    val pi = 3.14
    
    var salario = 1000
    var bonus = 300
    
    var total = salario + bonus
    
    println( "O salário do funcionário(a) $usuario é $total " )
    
}