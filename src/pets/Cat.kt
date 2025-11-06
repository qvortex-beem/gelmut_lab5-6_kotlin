package pets

class Cat(name: String) : Pet(name = name, speed = 80, maxHealth = 150) {
    val stealthLevel: Int = 0

    override fun makeSound() {
        println("$name мяукает")
    }

    override fun describe() {
        println("Наш $name очень скрытный ($stealthLevel скрытность!) и тихий!")
    }
}