class Wizard: Human() {
    override var pool = 100
    override var guard = 20
    override fun skill(target: Human){
        if (pool > 0) {
            pool -= 25
            health += 10
        }
        else
            println("sosihuy")
    }


    }

