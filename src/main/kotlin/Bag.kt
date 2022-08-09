class Bag(var healdrinks: Int = 3,var vitamins: Int = 1) {

    fun useHealdrink(heroesList: MutableList<Heroes>): MutableList<Heroes> {
        if (this.healdrinks != 0) {
            println("Choose a hero: held,magier,heiler")
                var chooseHero = readln()
                when (chooseHero) {
                    "held" -> {
                        heroesList[0].setHp(heroesList[0].getHp() + 50)
                        println("Der Held ${heroesList[0].getName()} hat einen Heiltrank genommen: ${heroesList[0].getHp()}")

                    }
                    "heiler" -> {
                        heroesList[1].setHp(heroesList[1].getHp() + 50)
                        println("Der Heiler ${heroesList[1].getName()} hat einen Heiltrank genommen: ${heroesList[1].getHp()}")

                    }
                    "magier" -> {
                        heroesList[2].setHp(heroesList[2].getHp() + 50)
                        println("Der Magier ${heroesList[2].getName()} hat einen Heiltrank genommen: ${heroesList[2].getHp()}")

                    }
                    else -> {
                        println("Keine korrekte Eingabe!")
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
        if (this.vitamins != 0) {
            println("Choose a hero: held,magier,heiler")
                var chooseHero = readln()
                when (chooseHero) {
                    "held" -> {
                        heroesList[0].setDmg(heroesList[0].getDmg() + 50)
                        println("Der Held ${heroesList[0].getName()} hat ein Vitamin genommen: ${heroesList[0].getDmg()}")

                    }
                    "heiler" -> {
                        heroesList[1].setDmg(heroesList[1].getDmg() + 50)
                        println("Der Heiler ${heroesList[1].getName()} hat ein Vitamin genommen: ${heroesList[1].getDmg()}")

                    }
                    "magier" -> {
                        heroesList[2].setDmg(heroesList[2].getDmg() + 50)
                        println("Der Magier ${heroesList[2].getName()} hat ein Vitamin genommen: ${heroesList[2].getDmg()}")

                    }
                    else -> {
                        println("Keine korrekte Eingabe!")
                    }

            }

            this.vitamins--
        } else if (this.vitamins == 0) {
            println("Vitamin aufgebraucht")
            return heroesList
        }
        return heroesList
    }
}