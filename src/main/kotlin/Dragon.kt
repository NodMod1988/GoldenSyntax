class Dragon(name:String, hp: Double, dmg: Double): Enemies(name, hp, dmg) {

    var runnable = true
    var cursed = false



    override fun attack(hero: Heroes): Heroes {
        if(hero.getIsBlock()){
            println("${hero.getName()} hat den Angriff blockiert")
            hero.setIsBlocking(false)
            return hero
        }else
        hero.setHp(hero.getHp()-getDmg())
        println("Der Drache ${getName()} hat den Helden ${hero.getName()} gehauen: ${hero.getHp()}")
        return hero
    }

    override fun attackGroup(heroes: MutableList<Heroes>) : MutableList<Heroes>{
        for (i in heroes.indices){
            if(heroes[i].getIsBlock()){
                println("${heroes[i].getName()} ist den Angriff ausgewichen")
                heroes[i].setIsBlocking(false)
            }else if(!heroes[i].getIsBlock()){
            heroes[i].setHp(heroes[i].getHp() - getDmg())
            println("Der Drache ${getName()} hat Gruppenschaden gemacht:${heroes[i].getName()}: ${heroes[i].getHp()} Hp")
            }
        }

        println("Helden haben ${getDmg()} Dmg erhalten")
        return heroes
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
        if(!hero.getCursed()){
            hero.setCursed(true)
            println("${hero.getName()} wurde mit einem Fluch belegt")
        }
        return hero
    }
}