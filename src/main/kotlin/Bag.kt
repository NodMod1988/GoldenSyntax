class Bag(var healdrinks: Int = 3,var vitamins: Int = 1) {

    fun useHealdrink(heroesList: MutableList<Heroes>): MutableList<Heroes> {
        if (this.healdrinks != 0) {
            println("Choose a hero: held,magier,heiler")
            for (i in heroesList.indices) {
                println("${heroesList[i].getName()}")
                var chooseHero = readln()
                when (chooseHero) {
                    "held" -> {
                        heroesList[0].setHp(heroesList[0].getHp() + 50)
                        println("Der Held ${heroesList[0].getName()} hat einen Heiltrank genommen")
                    }
                    "heiler" -> {
                        heroesList[1].setHp(heroesList[1].getHp() + 50)
                        println("Der Held ${heroesList[1].getName()} hat einen Heiltrank genommen")
                    }
                    "magier" -> {
                        heroesList[2].setHp(heroesList[2].getHp() + 50)
                        println("Der Held ${heroesList[2].getName()} hat einen Heiltrank genommen")
                    }
                    else -> {
                        println("Keine korrekte Eingabe!")
                    }

                }
            }

            this.healdrinks--
        } else if (this.healdrinks == 0) {
            println("Heiltränke aufgebraucht")
            return heroesList
        }
        return heroesList
    }

    fun useVitamins(heroesList: MutableList<Heroes>): MutableList<Heroes> {
        if (this.healdrinks != 0) {
            println("Choose a hero: held,magier,heiler")
            for (i in heroesList.indices) {
                println("${heroesList[i].getName()}")
                var chooseHero = readln()
                when (chooseHero) {
                    "held" -> {
                        heroesList[0].setHp(heroesList[0].getHp() + 50)
                        println("Der Held ${heroesList[0].getName()} hat einen Heiltrank genommen")
                    }
                    "heiler" -> {
                        heroesList[1].setHp(heroesList[1].getHp() + 50)
                        println("Der Held ${heroesList[1].getName()} hat einen Heiltrank genommen")
                    }
                    "magier" -> {
                        heroesList[2].setHp(heroesList[2].getHp() + 50)
                        println("Der Held ${heroesList[2].getName()} hat einen Heiltrank genommen")
                    }
                    else -> {
                        println("Keine korrekte Eingabe!")
                    }

                }
            }

            this.vitamins--
        } else if (this.vitamins == 0) {
            println("Heiltränke aufgebraucht")
            return heroesList
        }
        return heroesList
    }
}