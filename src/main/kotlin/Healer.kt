class Healer(name:String, hp: Double, dmg: Double) : Heroes(name,hp,dmg) {


    override fun attack(enemy: Enemies): Enemies {
        enemy.setHp(enemy.getHp()-getDmg())
        return enemy
    }

    fun heal(heroes: MutableList<Heroes>): MutableList<Heroes> {
        var action = """ Welcher Held soll geheilt werden? 
                         1.Held       2.Heiler      3.Magier
                     """.trimMargin()

        println(action)

        var a = readLine()

        when(a){
            "1" -> {
                heroes[0].setHp(heroes[0].getHp() + 30)
                println("Der Held wurde umm 30 HP geheilt")
            }
            "2" ->{
                heroes[1].setHp(heroes[1].getHp() + 30)
                println("Der Heiler wurde umm 30 HP geheilt")
            }
            "3" -> {
                heroes[2].setHp(heroes[2].getHp() + 30)
                println("Der Magier wurde umm 30 HP geheilt")
            }
            else -> println("Ungültige Eingabe")
        }
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