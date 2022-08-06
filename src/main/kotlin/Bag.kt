class Bag(var healdrinks: Int = 3,var vitamins: Int = 1) {

    fun useHealdrink(heroes: Heroes): Heroes{
        if(this.healdrinks >0){
            heroes.setHp(heroes.getHp() + 50)
            this.healdrinks--
        }
        else if(this.healdrinks == 0){
            println("Heiltränke aufgebraucht")
            return heroes
        }
        return heroes
    }

    fun useVitamins(heroes: Heroes): Heroes{
        if(this.vitamins == 1){
            heroes.setDmg(heroes.getDmg() * 0.1)
            this.vitamins --
        }
        else if(this.vitamins == 0){
            println("Keine Vitamine mehr in der Tasche")
        }
        return heroes
    }
}