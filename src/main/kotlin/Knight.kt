class Knight: Human() {
    override var pool = 100
    override var guard = 100
    override fun skill(target: Human) {
        if (pool > 0){
            pool-=50
            guard += 50
        }
        else{
            println("(((")
        }
    }


}