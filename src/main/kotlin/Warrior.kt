class Warrior(name: String, hp: Double, dmg: Double) : Heroes(name, hp, dmg) {

    override fun attack(enemy: Enemies): Enemies {
        enemy.setHp(enemy.getHp() - (0.55 * enemy.block()))
        println("Der Held ${getName()} hat den Gegner ${enemy.getName()} gehauen: ${enemy.getHp()}")
        return enemy
    }

    override fun block(): Double {
        return 0.7
    }
}