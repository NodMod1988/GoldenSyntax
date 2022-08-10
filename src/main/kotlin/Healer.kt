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

    fun protect(heroes: MutableList<Heroes>): MutableList<Heroes>{

        var action = """ Welcher Held soll geschützt werden? 
                         1.Held       2.Heiler      3.Magier
                     """.trimMargin()

        println(action)

        var a = readLine()
        when(a){
            "1" -> heroes[0].setIsBlocking(true)
            "2" -> heroes[1].setIsBlocking(true)
            "3" -> heroes[2].setIsBlocking(true)
            else -> println("Ungültige Eingabe")
        }
        return heroes
    }
}