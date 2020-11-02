/* Program utama */

fun main(){
    val model = SuitGame()
    val view = SuitView()
    val controller = Controller(model,view)
    controller.startSuitGame()
}