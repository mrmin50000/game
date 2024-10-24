abstract class Human() {
    open var level: Int = 1
    var health: Int = 100
    var power = 0..15
    open var pool: Int = 100
    open var guard: Int = 100


    fun getDamage(enemy: Human){
        if (guard > 0)
            guard -= enemy.power.random()
        else
            health -= enemy.power.random()
    }
    fun attack(target: Human){
        if (target.guard <= 0){
            target.guard = 0
        }

        target.getDamage(this)

    }

    open fun skill(target: Human){
        target.getDamage(this)
    }

    fun lvlup(enemy: Human){
        val level0 = level
        level += 1
        if (level > level0){
            enemy.health += 10
            enemy.pool += 40
            enemy.power = 0..power.last() + 5
            enemy.guard = 100
        }
    }



}