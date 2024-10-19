fun bot(x:Human, y:Human){
    if (x is Wizard){
        if ((x.health <= 50) and (x.pool > 0)) {
            x.skill(x)
            println("2\n")
        }
        else {
            x.attack(y)
            println("1\n")
        }
    }
    else if (x is Knight){
        if ((x.guard <= 20) and (x.pool > 0)) {
            x.skill(x)
            println("2\n")
        }
        else{
            x.attack(y)
            println("1\n")
        }
    }
    else{
        val g: Int = (1..2).random()
        if ((g == 1) and (x.pool > 0)) {
            x.skill(y)
            println("2\n")
        }
        else {
            x.attack(y)
            println("1\n")
        }
    }
}



fun main(){
    println("Обзор персонажей:\n Wizard - атака: 0-15 здоровье: 100 щит: 20 скилл: хилл +50, но мана -20\n Knight - атака: 0-7 здоровье: 100 щит: 100 скилл: щит +30 защита -20\n Robot - атака: 0-20 щит: 50 скилл: единоразовый урон +(40-60) батарея -50\n\n\n")
    println("Выбирайте персонажа: Wizard, Knight, Robot")
    val input = readln()
    println("Выбирайте противника: Wizard, Knight, Robot")
    val input1 = readln()
    val input_enum = Character.valueOf(input.uppercase())
    val input_enum1 = Character.valueOf(input1.uppercase())

    val hero: Human = when (input_enum){
        Character.WIZARD -> Wizard()
        Character.KNIGHT -> Knight()
        Character.ROBOT -> Robot()
    }
    val mob: Human = when (input_enum1){
        Character.WIZARD -> Wizard()
        Character.KNIGHT -> Knight()
        Character.ROBOT -> Robot()
    }
    while (true){
        if (mob.health <= 0) {
            println("ВЫ победили!")
            break
        }
        if (hero.health <= 0) {
            println("ВЫ проиграли!")
            break
        }
        println("1 - атака с руки\n2 - скилл\nДелайте ход: ")
        val move = readln()
        when(move){
            "1" -> hero.attack(mob)
            "2" -> hero.skill(mob)

        }
        println("Ход противника: ")
        bot(mob, hero)
        println("Здоровье противника ${mob.health}")
        when (input_enum1){
            Character.WIZARD -> println("Полоска mana ${mob.pool}\nПолоска guard ${mob.guard}\n\n")
            Character.KNIGHT -> println("Полоска defence ${mob.pool}\nПолоска guard ${mob.guard}\n\n")
            Character.ROBOT -> println("Полоска battery ${mob.pool}\nПолоска guard ${mob.guard}\n\n")
        }
        println("Ваше здоровье ${hero.health}")
        when (input_enum){
            Character.WIZARD -> println("Полоска mana ${hero.pool}\nПолоска guard ${hero.guard}\n\n")
            Character.KNIGHT -> println("Полоска defence ${hero.pool}\nПолоска guard ${hero.guard}\n\n")
            Character.ROBOT -> println("Полоска battery ${hero.pool}\nПолоска guard ${hero.guard}\n\n")
        }
        if (hero.guard <= 0){
            println("ВАШ ЩИТ СЛОМАН")
        }
        if (mob.guard <= 0){
            println("ЩИТ ПРОТИВНИКА СЛОМАН\n\n")
        }




    }
}