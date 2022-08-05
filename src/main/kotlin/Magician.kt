class Magician(name: String, hp: Double, dmg: Double ) : Heroes(name, hp, dmg) {

    override fun attack(enemy: Enemies): Enemies {
        setHp(enemy.getHp() - getDmg())
        return enemy
    }
}