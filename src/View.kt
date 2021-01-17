class View{

    var cornfield: Cornfield = Cornfield()

    fun show(){
        println("У вас есть поле размером ${cornfield.area} засаженное '${cornfield.currentCulture.name}'")
    }

    fun selectCulture(){
        println("Вы выбрали '${cornfield.currentCulture.name}'")
    }

    fun selectPest(){
        println("Используемые пестициды: '${cornfield.currentPest.name}'")
    }

    fun sell(x: Int): Int {
        return x * cornfield.area
    }
}
