class Dragon(name:String, hp: Double, dmg: Double): Enemies(name, hp, dmg) {

    override fun attack(hero: Heroes): Heroes {
        hero.setHp(hero.getHp()-getDmg()*hero.block())
        return hero
    }

    override fun createEnemy(enemies: Enemies): Enemies {
        var counter = true
        if (counter == true){
            var newEnemy: Enemies = Enemies("Jürgen", hp = 100.0, dmg = 20.0)
            counter = false
        }else if(!counter){
            println("Aktion nicht mehr durchfuehrbar")
        }
        return  enemies
    }


}