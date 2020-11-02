/* Controller : Penghubung View dan Model */

class Controller(suitGame: SuitGame, view: SuitView) {
    private var suitGame: SuitGame?= suitGame
    private var suitView: SuitView?= view

    fun startSuitGame(){
        do {
            suitView?.startSuit()
            suitGame?.setPlayer1Input(suitView?.getPlayerInput1())
            suitGame?.setPlayer2Input(suitView?.getPlayerInput2())
            suitView?.result(suitGame!!.result())
            print("Ulangi?(y/n):")
            var stat = readLine().equals("y", true)
        }while(stat)
    }
}
