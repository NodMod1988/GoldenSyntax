import java.util.DoubleSummaryStatistics

open class Heroes{

    private var name: String = ""
    private var hp: Double = 0.0

    fun getGp(): Double{
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

    constructor(name: String, hp: Double){
        setName(name)
        setHp(hp)
    }
}