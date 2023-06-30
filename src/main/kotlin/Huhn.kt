class Huhn(
    name:String,
    gewicht:Double,
    alter:Int,
    geschlecht:String,
):Tier(name,gewicht,alter,geschlecht) {
    var anzahlEierProTag=0

    init {
        if (geschlecht == "weiblich"){
            anzahlEierProTag=(0..3).random()
        }

    }

    override fun geraeuscheMachen() {
        println("ga-gack")
    }

    override fun aktionAuswaehlen() {
        do {
            try {

                println("welche aktion soll das Huhn ausführen\n" +
                        "Geräuchemachen,Streicheln,Füttern")

                var input = readln().lowercase()

                when(input){
                    "geräuchemachen" -> {geraeuscheMachen()}
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