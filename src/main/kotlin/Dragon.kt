class Dragon(name:String, hp: Double, dmg: Double): Enemies(name, hp, dmg) {

    var runnable = true
    var cursed = false

    override fun attack(hero: Heroes): Heroes {
        hero.setHp(hero.getHp()-getDmg()*hero.block())
        println("Der Drache ${getName()} hat den Helden ${hero.getName()} gehauen: ${hero.getHp()}")
        return hero
    }

    override fun attackGroup(heroes: MutableList<Heroes>) : MutableList<Heroes>{
        for (i in heroes.indices){
            heroes[i].setHp(heroes[i].getHp() - (0.55 * heroes[i].block()))
            println("Der Drache ${getName()} hat Gruppenschaden gemacht: ${heroes[i].getHp()}")
        }
        println("Alle Helden haben ${getDmg()} erhalten")
        return mutableListOf()
    }

    override fun createEnemy(enemies: MutableList<Enemies>): MutableList<Enemies> {
        if (runnable){
            var newEnemy: Dragon = Dragon("Jürgen", hp = 100.0, dmg = 20.0)
            println("Ein neuer Gegner ist aufgetaucht!")
            enemies.add(newEnemy)
        }
        runnable = false
        return  enemies
    }

    override fun curseEnemy(hero: Heroes): Heroes {



        return hero
    }
}