open class Enemies{

    private var name: String = ""
    private var hp: Double = 0.0
    private var dmg: Double = 0.0

    fun getHp(): Double{
        return hp
    }

    fun setHp(hp:Double){
        this.hp = hp
    }

    fun getName(): String{
        return name
    }

    fun setName(name: String){
        this.name = name
    }

    fun getDmg(): Double{
        return dmg
    }

    fun setDmg(dmg: Double){
        this.dmg = dmg
    }

    constructor(name: String, hp: Double, dmg:Double){
        setName(name)
        setHp(hp)
        setDmg(dmg)
    }
}