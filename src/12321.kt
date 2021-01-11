fun main(){
    var culture1: culture= culture()
    culture1.name = "Пшено"
    var culture2: culture= culture()
    culture2.name = "Греча"

    var view = View()
    view.show()

    println("Выберите культуру для посадки: ")
    println("1: ${culture1.name}")
    println("2: ${culture2.name}")

    var user = readLine()

    when(user){
        "1" -> {view.currentCulture(culture1)}
        "2" -> {view.currentCulture(culture2)}
    }
}