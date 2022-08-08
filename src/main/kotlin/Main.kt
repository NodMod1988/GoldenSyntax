import kotlin.random.Random

fun main() {

    var dragon: Dragon = Dragon("Paul", 1000.0, 50.0)
    var held: Warrior = Warrior("Günther", 100.0, 30.0)
    var healer: Healer = Healer("Jürgen", 100.0, 10.0)
    var magician: Magician = Magician("William", 100.0, 25.0)

    var heroesList: MutableList<Heroes> = mutableListOf(held, healer, magician)
    var enemyList: MutableList<Enemies> = mutableListOf(dragon)

    var actionHero = """ 
                         Aktion für den Helden auswählen 
                         1: Gegner Angreifen  2: Angriff Blockieren
                         3: Tasche Benutzen   4: Gruppenschaden 
                     """.trimIndent()

    var actionHealer = """ 
                         Aktion für den Helden auswählen 
                         1: Gruppe heilen     2: Schutzzauber anwenden
                         3: Tasche Benutzen   4: Verbündeten Heilen
                     """.trimIndent()

    var actionMagician = """ 
                         Aktion für den Helden auswählen 
                         1: Feuer Zauber      2: Wasser Zauber
                         3: Tasche Benutzen   4: Verstecken
                     """.trimIndent()


    println("Spiel Startet")
    while (dragon.getHp() > 0 && held.getHp() > 0 || healer.getHp() > 0 || magician.getHp() > 0) {


        println(actionHero)
        var a = readln()
        when (a) {
            "1" -> held.attack(dragon)
            "2" -> held.block()

        }
    }
}