class Warrior(name: String, hp: Double, dmg: Double) : Heroes(name, hp, dmg) {

    override fun attack(enemy: Enemies): Enemies {
        enemy.setHp(enemy.getHp() - getDmg())
        return enemy
    }

    fun block(enemy: Enemies): Enemies {
        return enemy
    }
}