class Knight: Human() {
    var defence = 90
    override var pool = defence
    override var guard = 100
    override fun skill(target: Human) {
        if (defence > 0){
            defence-=30
            pool = defence
            guard += 30
        }
        else{
            println("(((")
        }
    }


}