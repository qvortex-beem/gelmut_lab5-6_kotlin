package world

import world.Quest

fun main() {
//    val quest = world.Quest()
//    print("Введите название квеста: ")
//    val title = readln()
//    print("Введите время выполнения (в часах): ")
//    val duration = readln().toInt()
//    print("Введите награду (в монетах): ")
//    val reward = readln().toInt()
//    print("Введите уровень сложности: ")
//    val difficulty = readln()
//
//    quest.init(
//        title = title,
//        duration = duration,
//        reward = reward,
//        difficulty = difficulty
//    )
//    quest.printInfo()

//    val quests = mutableListOf<world.Quest>()
//    for (i in 1..3) {
//        println("Добавим квест #$i")
//        val q = world.Quest()
//        print("Название: ")
//        val title = readln()
//        print("Время (ч): ")
//        val duration = readln().toInt()
//        print("Награда: ")
//        val reward = readln().toInt()
//        print("Сложность: ")
//        val difficulty = readln()
//        q.init(title, duration, reward, difficulty)
//        quests.add(q)
//        println()
//    }
//
//    println("Все доступные квесты: ")
//    for (q in quests) {
//        q.printInfo()
//    }

//    val quest = world.Quest("Побег из замка", 5, 700, "сложный")
//    println("Квест сложный? ${quest.isHard()}")

//    val quest1 = Quest("охота", 2, 300, "средний")
//    println(quest1.goldPerHour())

//    val quest = Quest("Поиск артефакта", 3, 800, "средний")
//    val contract = Contract("защита каравана", "гильдия купцов", "охрана груза", 1200)
//    val specialOp = SpecialOperation("операция 'тень'", 2500, 2, true)
//
//    println("Информация о квесте:")
//    println("Название: ${quest.title}, Награда: ${quest.reward}")
//
//    println("\nИнформация о контракте:")
//    println("Название: ${contract.title}, Заказчик: ${contract.clientName}")
//
//    println("\nИнформация о спецоперации:")
//    println("Название: ${specialOp.title}")
//    specialOp.showReward()

//    val missions = listOf<Mission>(
//        Quest("охота на монстров", 3,600, "средний"),
//        SpecialOperation("ночной рейд", 1500, 2, true),
//        Contract("сопровождение каравана", "гильдия торговцев", "доставить груз через лес", 800, true)
//    )
//
//    for (mission in missions) {
//        mission.describe()
//        println("Высокая награда? ${if (mission.isHighReward()) "да" else "нет"}")
//        println()
//    }

    val escortQuest = Quest(
        title = "Сопроподи торговца до деревни",
        duration = 4,
        reward = 120,
        difficulty = "средний",
        questType = QuestType.ESCORT
    )
    escortQuest.printInfo()
}