class Magician(name: String, hp: Double, dmg: Double,isCursed: Boolean = false ) : Heroes(name, hp, dmg, isCursed) {

    override fun attack(enemy: Enemies): Enemies {
        setHp(enemy.getHp() - getDmg())
        return enemy
    }
}