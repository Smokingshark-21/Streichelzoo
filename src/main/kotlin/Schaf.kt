class Schaf(
    name:String,
    gewicht:Double,
    alter:Int,
    geschlecht:String,
    var wolleSauber:Boolean
):Tier(name,gewicht,alter,geschlecht) {

    override fun geraeuscheMachen() {
        println("määäh")
    }

    fun baden(){
        if (!wolleSauber)
            wolleSauber=true
        println("Das Schaf[$name] wurde gebadet")
    }

    override fun aktionAuswaehlen() {

        do {
          try {

              println("welche aktion soll das schaf ausführen\n" +
                      "Geräuchemachen,Baden,Streicheln,Füttern")

              var input = readln().lowercase()

              when(input){
                  "geräuchemachen" -> {geraeuscheMachen()}
                  "baden" -> {baden()}
                  "streicheln" -> streicheln(besucherErstellen())
                  "füttern" -> {fuettern(besucherErstellen())}
                  else -> { continue}
              }
              Thread.sleep(2000)
              break


          }catch (e:Exception) {

              println("\nDeine eingabe war nicht richtig probiere es nochmal\n")
              Thread.sleep(2000)
              continue
          }

      }while (true)



    }
}