class Dragon(name:String, hp: Double, dmg: Double): Enemies(name, hp, dmg) {

    override fun attack(hero: Heroes): Heroes {
        hero.setHp(hero.getHp()-getDmg())
        return hero
    }
}