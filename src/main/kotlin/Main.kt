
    fun main() {

        var drache: Dragon = Dragon("Paul", 100.0, 100.0)
        var held: Warrior = Warrior("Günther", 100.0, 10.0)

        while (drache.getHp() > 0 && held.getHp() > 0){

            println("Drache angreifen?")
            var a = readln()
            when(a){
                "ja" -> held.attack(drache)
                "nein" -> held.block(drache)
            }




            println("der held ${held.getName()} haut den Drachen mit ${drache.getHp()}")
            println("der Drache ${drache.getName()} haut den Held mit ${held.getHp()}")

        }
    }


