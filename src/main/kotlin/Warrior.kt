class Warrior(name: String, hp: Double, dmg: Double) : Heroes(name, hp, dmg) {

    override fun attack(enemy: Enemies): Enemies {
        enemy.setHp(enemy.getHp() - getDmg()*block())
        return enemy
    }

    override fun block(): Double {
        println("Der Held ${getName()} blockiert den Angriff ")
        return 0.7
    }
}