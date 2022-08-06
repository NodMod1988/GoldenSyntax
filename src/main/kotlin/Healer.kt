class Healer(name:String, hp: Double, dmg: Double) : Heroes(name,hp,dmg) {


    override fun attack(enemy: Enemies): Enemies {
        enemy.setHp(enemy.getHp()-getDmg())
        return enemy
    }

    fun heal(heroes: Heroes): Heroes {
        heroes.setHp(heroes.getHp() + 30)
        return heroes
    }


}