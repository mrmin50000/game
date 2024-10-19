class Robot: Human() {
    var battery = 100
    override var pool = battery
    override var guard = 50
    override fun skill(target: Human) {
        if (battery > 0){
            battery-=50
            pool = battery
            power = (40..60).random()
            target.getDamage(this)
        }
        else{
            println("no")
        }

    }


}