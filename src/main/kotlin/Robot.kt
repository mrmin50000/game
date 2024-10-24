class Robot: Human() {
    override var pool = 100
    override var guard = 50
    override fun skill(target: Human) {
        if (pool > 0){
            pool-=50
            power = power.last() + 15..power.last() + 50
            target.getDamage(this)
        }
        else{
            println("no")
        }

    }

}


