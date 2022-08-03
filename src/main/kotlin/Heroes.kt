import java.util.DoubleSummaryStatistics

open class Heroes{

    private var name: String = ""
    private var hp: Double = 0.0
    private var dmg: Double = 0.0
    private var moral: Int = 0

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

    fun getMoral(): Int{
        return moral
    }

    fun setMoral(moral: Int){
        this.moral = moral
    }

    constructor(name: String, hp: Double, dmg: Double, moral: Int){
        setName(name)
        setHp(hp)
        setDmg(dmg)
        setMoral(moral)
    }
}