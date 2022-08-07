import kotlin.random.Random

fun main() {

    var dragon: Dragon = Dragon("Paul", 1000.0, 50.0)
    var held: Warrior = Warrior("Günther", 100.0, 30.0)
    var healer: Healer = Healer("Jürgen", 100.0, 10.0)
    var magician: Magician = Magician("William", 100.0, 25.0)

    var heroesList: MutableList<Heroes> = mutableListOf(held, healer, magician)
    var enemyList: MutableList<Enemies> = mutableListOf(dragon)


    println("Spiel Startet")
    while (dragon.getHp() > 0 && heroesList[0].getHp() > 0 ) {

        var aktionHeld = """ 
                         Aktion für den Helden auswählen 
                         1: Gegner Angreifen  2: Angriff Blockieren
                         3: Tasche Benutzen   4: Verstecken
                     """.trimIndent()
        println(aktionHeld)
        var a = readln()
        when (a) {
            "1" -> held.attack(dragon)
            "2" -> held.block()
        }
    }
}


