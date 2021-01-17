fun main(){
    val culture1 = Culture("Пшено")
    val culture2 = Culture("Греча")
    var view = View()
    view.show()


    println("Выберите культуру для посадки: ")
    println("1: ${culture1.name}")
    println("2: ${culture2.name}")

    var userCulture = readLine()!!.toInt()
    when(userCulture){

        1 -> {view.cornfield.currentCulture.name = culture1.name }
        2 -> {view.cornfield.currentCulture.name = culture2.name }
    }

    view.selectCulture()

    view.show()

    val pesticides1 = Pesticides("Олег")
    val pesticides2 = Pesticides("НеОлег")

    println("Выберите пестициды для обработки: ")
    println("1: ${pesticides1.name}")
    println("2: ${pesticides2.name}")

    var userPest = readLine()!!.toInt()

    when(userPest){
        1-> {view.cornfield.currentPest.name = pesticides1.name}
        2-> {view.cornfield.currentPest.name = pesticides2.name}
    }

    view.selectPest()

    println("За сколько толкнём товар?:")
    println("Прибыль составила ${view.sell(readLine()!!.toInt())} рубликов")
}