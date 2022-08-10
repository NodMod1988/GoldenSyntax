class Magician(name: String, hp: Double, dmg: Double) : Heroes(name, hp, dmg) {

    override fun attack(enemy: Enemies): Enemies {
        setHp(enemy.getHp() - getDmg())
        println("${getName()} hat den Drachen ${enemy.getName()} mit ${getDmg()} angegriffen.")
        return enemy
    }

    fun groupAttack(enemies: MutableList<Enemies>) : MutableList<Enemies>{
        for (i in enemies.indices){
            enemies[i].setHp(enemies[i].getHp() - getDmg())
            println("Gruppenschaden: ${enemies[i].getHp()}")
        }
        println("Alle gegner haben ${getDmg()} von ${getName()} erhalten")
        return mutableListOf<Enemies>()
    }


}