class Warrior(name: String, hp: Double, dmg: Double) : Heroes(name, hp, dmg) {

    override fun attack(enemy: Enemies): Enemies {
        enemy.setHp(enemy.getHp() - getDmg())
        println("Der Held ${getName()} hat den Gegner ${enemy.getName()} gehauen: ${enemy.getHp()}")
        return enemy
    }

    override fun block(): Double {
        return 0.7
    }

    fun groupAttack(enemies: MutableList<Enemies>) : MutableList<Enemies>{
        for (i in enemies.indices){
            enemies[i].setHp(enemies[i].getHp() - getDmg())
            println("Gruppenschaden: ${enemies[i].getHp()}")
        }
        println("Alle gegner haben ${getDmg()} erhalten")
        return mutableListOf<Enemies>()
    }

}