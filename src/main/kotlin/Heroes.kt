
open class Heroes{

    private var name: String
    private var hp: Double
    private var dmg: Double

    constructor(name: String, hp:Double, dmg: Double){
        this.name = name
        this.hp = hp
        this.dmg = dmg
    }

    fun getName(): String{
        return name
    }

    fun setName(name:String){
        this.name = name
    }

    fun getHp(): Double{
        return hp
    }

    fun setHp(hp:Double){
        this.hp = hp
    }

    fun getDmg():Double{
        return dmg
    }

    fun setDmg(dmg: Double){
        this.dmg = dmg
    }

    open fun attack(enemy: Enemies): Enemies{
        return enemy
    }

    open fun block(): Double{
        return 1.0
    }

    open  fun dodge():Boolean{
        return false
    }

    open fun useBag(heroes: MutableList<Heroes>): MutableList<Heroes>{
        return heroes
    }

}