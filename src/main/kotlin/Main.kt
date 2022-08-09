fun main() {

    var dragon: Dragon = Dragon("Paul", 250.0, 50.0)
    var held: Warrior = Warrior("Uwe", 100.0, 30.0)
    var healer: Healer = Healer("Jürgen", 100.0, 10.0)
    var magician: Magician = Magician("William", 100.0, 25.0)
    var bag: Bag = Bag()
    var counter: Int = 0
    var curseCounter = 0
    var removeEnemies = mutableListOf<Enemies>()
    var removeHeroes = mutableListOf<Heroes>()


    var heroesList: MutableList<Heroes> = mutableListOf(held, healer, magician)
    var enemyList: MutableList<Enemies> = mutableListOf(dragon)

    var actionHero = """ 
                         Aktion für den Helden ${held.getName()} auswählen 
                         1: Gegner Angreifen    2: Angriff Blockieren
                         3: Heiltrank Benutzen  4: Gruppenschaden 
                     """.trimIndent()

    var actionHealer = """ 
                         Aktion für den Heiler ${healer.getName()} auswählen 
                         1: Gruppe heilen     2: Schutzzauber anwenden
                         3: Vitamin Benutzen  4: Verbündeten Heilen
                     """.trimIndent()

    var actionMagician = """ 
                         Aktion für den Magier ${magician.getName()} auswählen 
                         1: Angreifen           2: Abwehren
                         3: Heiltrank Benutzen  4: Gruppe Angreifen
                     """.trimIndent()


    //TODO block funktion einfügen

    println("Spiel Startet")
    while (dragon.getHp() > 0 && held.getHp() > 0 ) {
        println("Round $counter")

        if(held.getHp()>=0){
        println(actionHero)
        var heroInput = readln()
        when (heroInput) {
            "1" -> held.attack(enemyList.random())
            "2" -> held.block()
            "3" -> held.useBag(bag.useHealdrink(heroesList))
            "4" -> held.groupAttack(enemyList)
            }
        }

        if(healer.getHp()>= 0){
        println(actionHealer)
        var healerInput = readln()
        when(healerInput){
            "1" -> healer.healGroup(heroesList)
            "2" -> healer.attack(enemyList.random())
            "3" -> healer.useBag(bag.useVitamins(heroesList))
            "4" -> healer.heal(held)
            }
        }

        if(magician.getHp()>=0){
        println(actionMagician)
        var magicianInput = readln()
        when(magicianInput){
            "1" -> magician.attack(enemyList.random())
            "2" -> magician.useBag(heroesList)
            "3" -> magician.useBag(bag.useVitamins(heroesList))
            "4" -> magician.groupAttack(enemyList)
            }
        }

        for(i in heroesList.indices){
            if(heroesList[i].getCursed() && curseCounter != 2 && heroesList[i].getHp()>=0){
                heroesList[i].setHp(heroesList[i].getHp()-10)
                println("${heroesList[i].getName()} erleidet 10 dmg wegen des Fluchs")
                curseCounter++
            }else{
                heroesList[i].setCursed(false)
            }
        }

        for(i in heroesList.indices){
            if(heroesList[i].getHp()<= 0){
                removeHeroes.add(heroesList[i])
                println("${heroesList[i].getName()} ist gestorben")
            }
        }

        heroesList.removeAll(removeHeroes)


        enemyList = dragon.createEnemy(enemyList)
        var functionList = listOf(enemyList.random().attack(heroesList.random()), enemyList.random().attackGroup(heroesList), enemyList.random().curseEnemy(heroesList.random()))
        functionList.random()

        for(i in enemyList.indices){
            if(enemyList[i].getHp()<= 0){
                removeEnemies.add(enemyList[i])
                println("${enemyList[i].getName()} ist gestorben")
            }
        }
        enemyList.removeAll(removeEnemies)
        counter++
    }

    if(heroesList[0].getHp()<= 0 || heroesList[1].getHp() <= 0 || heroesList[2].getHp() <= 0){
        println("Die Gegner gewinnen den Kampf!")
    }else if(enemyList[0].getHp() <= 0 || enemyList[1].getHp()<=0){
        println("Der Helden  gewinnen den Kampf!")
    }
}