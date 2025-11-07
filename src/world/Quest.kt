package world

class Quest(
    title: String,
    val duration: Int,
    reward: Int,
    val difficulty: String,
    val questType: QuestType
) : Mission(title, reward) {

    fun printInfo() {
        println("Название квеста: ${this.title} \nТип квеста: ${questType.description} \nВремя выполнения: ${this.duration} \nНаграда: ${this.reward} золотых \nУровень сложности: ${this.difficulty}\n")
    }

    fun isHard() : Boolean {
        return difficulty.lowercase() == "сложный"
    }

    override fun describe() {
        println("Квест '$title' на $duration часов, сложность: $difficulty награда: $reward золотых")
        println("Тип квеста: ${questType.description}")
    }

    fun goldPerHour(): Int {
        require(duration >= 0) {"Длительность не может быть отрицательной!"}
        return if (duration == 0) 0 else reward/duration
    }
}