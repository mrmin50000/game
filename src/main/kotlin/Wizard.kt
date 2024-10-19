class Wizard: Human() {
    var mana = 100
    override var pool = mana
    override var guard = 20
    override fun skill(target: Human) {
        if (mana > 0){
            mana-=20
            pool = mana
            health += 50
        }
        else{
            println("no")
        }
    }

}