class Dragon(name:String, hp: Double, dmg: Double): Enemies(name, hp, dmg) {

    override fun attack(hero: Heroes): Heroes {
        hero.setHp(hero.getHp()-getDmg()*hero.block())
        return hero
    }

    override fun createEnemy(enemies: MutableList<Enemies>): MutableList<Enemies> {
        var counter = true
        if (counter){
            var newEnemy: Enemies = Enemies("Jürgen", hp = 100.0, dmg = 20.0)
            enemies.add(newEnemy)

        }else if(!counter){
            println("Aktion nicht mehr durchfuehrbar")
        }
        counter = false
        return  enemies
    }


}