package fundamentos

class Pessoa(val name: String, val age: Byte) {
    override fun toString(): String {
        return "name: ${name}, age: ${age}"
    }
}

/*
*var -> mutável
*val -> constante (deve-se dar preferência )
* pascal_notation
*
* inteiros:
* long = 64 bits
* int = 32 bits
* shot = 16 bits
* byte = 8 bits -> 2^8 = 256
*
* flutuantes:
* Double = 64 bits
* float = 32 bits
*
* não é possivel estender classes no kotlin
 * */
fun main() {
    val eu = Pessoa(name = "Alex", age = 25)
    println(someThing(eu))


}


fun someThing(eu: Pessoa): String {
    if(eu.name == "Alex"){
        return "sem criatividade pra inventar algo"
    }
    else {
        return "it's not Alex"
    }
}