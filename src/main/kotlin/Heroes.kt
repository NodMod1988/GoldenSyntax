
open class Heroes{

    private var name: String
    private var hp: Double
    private var dmg: Double
    private var isCursed: Boolean = false
    private var isBlocking: Boolean = false

    constructor(name: String, hp:Double, dmg: Double){
        this.name = name
        this.hp = hp
        this.dmg = dmg
        this.isCursed = isCursed
    }

    fun getName(): String{
        return name
    }

    fun setIsBlocking(isBlocking: Boolean){
        this.isBlocking = isBlocking
    }

    fun getIsBlock(): Boolean{
        return isBlocking
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

    fun getCursed():Boolean{
        return isCursed
    }

    fun setCursed(isCursed: Boolean){
        this.isCursed = isCursed
    }

    open fun attack(enemy: Enemies): Enemies{
        return enemy
    }


    open fun useBag(heroes: MutableList<Heroes>): MutableList<Heroes>{
        return heroes
    }


}