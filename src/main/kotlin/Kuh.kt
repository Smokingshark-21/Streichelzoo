class Kuh (
    name:String,
    gewicht:Double,
    alter:Int,
    geschlecht:String,
    ):Tier(name,gewicht,alter,geschlecht) {
    var GibtMilch=false
        init {
            if (alter>3)
                GibtMilch=true
        }

    override fun geraeuscheMachen() {
        println("Muuuuhh")
    }

    fun melken(besucher: Besucher){
        if (GibtMilch){
            println("Die Kuh[$name] kann von ${besucher.name} gemolken werden")
        }else{
            println("Die Kuh[$name] kann noch keine Milch geben da sie noch nicht 3 jahre alt ist")
        }
    }

    override fun aktionAuswaehlen() {
        do {
            try {

                println("welche aktion soll die Kuh ausführen\n" +
                        "Geräuchemachen,Melken,Streicheln,Füttern")

                var input = readln().lowercase()

                when(input){
                    "geräuchemachen" -> {geraeuscheMachen()}
                    "melken" -> {melken(besucherErstellen())}
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