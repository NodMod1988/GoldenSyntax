open class Enemies{

    private var name: String
    private var hp: Double
    private var dmg: Double

    constructor( name: String,hp: Double, dmg: Double){
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

    fun setDmg(dmg:Double){
        this.dmg = dmg
    }

    open fun attack(hero: Heroes): Heroes{
        return hero
    }

    fun block(): Double{
        return 0.4
    }

    open fun createEnemy(enemies: Enemies):Enemies{
        return enemies
    }
}