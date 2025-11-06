package pets

class Bear(name: String) : Pet(name = name, speed = 50, maxHealth = 550) {
    val strength: Int = 0

    override fun makeSound() {
        println("$name рычит")
    }

    override fun describe() {
        println("У $name силушка богатырская - $strength")
    }
}