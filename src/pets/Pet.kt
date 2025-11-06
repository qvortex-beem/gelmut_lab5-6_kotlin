package pets

open class Pet(
    val speed: Int,
    val name: String,
    val maxHealth: Int
) {
    open fun describe() {
        println("Питомец: $name, Здоровье: $maxHealth, Скорость: $speed")
    }

    open fun makeSound() {
        println("$name подает голос.")
    }
}