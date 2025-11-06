package pets

class Wolf(name: String) : Pet(name = name, speed = 100, maxHealth = 250) {
    val packSize: Int = 0

    override fun makeSound() {
        println("$name воет")
    }

    override fun describe() {
        println("У $name размер стаи - $packSize")
    }
}