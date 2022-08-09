class Healer(name:String, hp: Double, dmg: Double) : Heroes(name,hp,dmg) {


    override fun attack(enemy: Enemies): Enemies {
        enemy.setHp(enemy.getHp()-getDmg())
        return enemy
    }

    fun heal(heroes: Heroes): Heroes {
        heroes.setHp(heroes.getHp() + 30)
        return heroes
    }

    fun healGroup(heroes:MutableList<Heroes>) : MutableList<Heroes>{
        for (i in heroes.indices){
            heroes[i].setHp(getHp() + 30.0)
        }
        println("Die gruppe wurde geheilt mit 30 Hp")
        return mutableListOf()
    }
}