import kotlin.random.Random

fun main() {

    var dragon: Dragon = Dragon("Paul", 100.0, 100.0)
    var held: Warrior = Warrior("Günther", 100.0, 10.0)
    var healer: Healer = Healer("Paul", 100.0, 10.0)
    var magician: Magician = Magician("William", 100.0, 30.0)

    var heroesList: MutableList<Heroes> = mutableListOf(held, healer, magician)
    var enemyList: MutableList<Enemies> = mutableListOf(dragon)


    println("Spiel Startet")
    while (dragon.getHp() > 0 && held.getHp() > 0 ) {

        var aktion = """ 
                         Aktion für den Helden ausführen 
                         angreifen ja/nein
                     """.trimIndent()
        println(aktion)


        var a = readln()
        when (a) {
            "ja" -> held.attack(dragon)
            "nein" -> held.block()
        }

        println("der held ${held.getName()} haut den Drachen mit ${dragon.getHp()}")
        println("der Drache ${dragon.getName()} haut den Held mit ${held.getHp()}")

    }
}


