/* View : Tampilan dari suit game */

class SuitView : ConsoleGame {
    private var playerInput1:String? = null
    private var playerInput2:String? = null

    fun getPlayerInput1():String?{
        return this.playerInput1
    }

    fun getPlayerInput2():String?{
        return this.playerInput2
    }

    fun startSuit() {
        println("====================================")
        println("    GAME SUIT TERMINAL VERSION      ")
        println("Masukkan : Batu, Gunting atau Kertas")
        println("====================================")

        do {
            print("1. Masukkan Pemain 1 :")
            this.playerInput1 = readLine()
            if(!checkInput(playerInput1)) println("Input Salah, Silakan Ulangi!")
            else break
        }  while(true)

        do {
            print("2. Masukkan Pemain 2 :")
            this.playerInput2 = readLine()
            if(!checkInput(playerInput2)) println("Input Salah, Silakan Ulangi!")
            else break
        }  while(true)
    }

    override fun result(result:String) {
        println(result)
        println("=====================================")
    }

    fun checkInput(input:String?) :Boolean {
        return input.equals("Batu",true)||input.equals("Gunting",true)||input.equals("Kertas",true)
    }
}