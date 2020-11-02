/* Model : Logika suit game */


class SuitGame{
    private var player1Input: String? = null
    private var player2Input: String? = null

    fun setPlayer1Input(answer1: String?) {
        this.player1Input = answer1
    }

    fun setPlayer2Input(answer2: String?) {
        this.player2Input = answer2
    }

    fun result(): String {
        //player 1 win
        return if ((player1Input.equals("BATU",true) && player2Input.equals("GUNTING",true)) ||
            (player1Input.equals("KERTAS",true) && player2Input.equals("BATU",true)) ||
            (player1Input.equals("GUNTING",true) && player2Input.equals("KERTAS",true)))
        {
            "Pemain 1 MENANG!"
        }

        //player 2 win
        else if ((player2Input.equals("BATU",true) && player1Input.equals("GUNTING",true)) ||
            (player2Input.equals("KERTAS",true) && player1Input.equals("BATU",true)) ||
            (player2Input.equals("GUNTING",true) && player1Input.equals("KERTAS",true)))
        {
            "Pemain 2 MENANG!"
        }

        else "DRAW!"
    }
}