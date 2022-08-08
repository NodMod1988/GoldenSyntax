class Bag(var healdrinks: Int = 3,var vitamins: Int = 1) {

    fun useHealdrink(heroesList:MutableList<Heroes>): MutableList<Heroes>{
        if(this.healdrinks !=0){
            println("Choose a hero: ")
            for (i in heroesList.indices){
                println("${heroesList[i].getName()}")
                var chooseHero = readln()
                when (chooseHero){
                    "held" -> {
                        heroesList[0].setHp(heroesList[0].getHp() + 50)
                        println("Der Held ${heroesList[0].getName()} hat einen Heiltrank genommen")
                    }
                    "magier" -> {
                        heroesList[1].setHp(heroesList[1].getHp() + 50)
                        println("Der Held ${heroesList[1].getName()} hat einen Heiltrank genommen")
                    }
                    "heiler" -> {
                        heroesList[2].setHp(heroesList[2].getHp() + 50)
                        println("Der Held ${heroesList[2].getName()} hat einen Heiltrank genommen")
                    }

                }
            }

            this.healdrinks--
        }
        else if(this.healdrinks == 0){
            println("Heiltränke aufgebraucht")
            return heroesList
        }
        return heroesList
    }

    fun useVitamins(heroes: Heroes): Heroes{
        if(this.vitamins == 1){
            heroes.setDmg(heroes.getDmg()+heroes.getDmg() *  0.1)
            this.vitamins --
        }
        else if(this.vitamins == 0){
            println("Keine Vitamine mehr in der Tasche")
        }
        return heroes
    }
}