class Streichelzoo() {
    var tierliste= mutableListOf<Tier>(
        Schaf("Manuel",30.0,3,"männlich",false),
        Schaf("John",50.0,6,"männlich",true),
        Huhn("Sabine",5.0,4,"weiblich"),
        Huhn("Torben",5.0,6,"männlich"),
        Kuh("Nicole",400.0,10,"weiblich"),
        Pony("Tobi",250.0,10,"männlich",150.0),
        Pony("Marie",200.0,5,"weiblich",180.0)
        )

    var besucherListe= mutableListOf<Besucher>()

    var i = 0
    fun neuerBesucher(besucher: Besucher){
        if (i < 5){
            besucherListe.add(besucher)
            besucher.vorstellen()
            tiereUndIhreGeräusche()
            i++
        }else{
            println("Es dürfen nicht mehr als 5 Besucher gemeinsam in den Streichelzoo")
        }
    }

    fun exit(besucher: Besucher){
        if (besucherListe.contains(besucher))
            besucherListe.remove(besucher)
    }

    private fun tiereUndIhreGeräusche(){
        for (i in tierliste){
            i.geraeuscheMachen()
        }
    }

    fun rennen(pony1: Pony = tierliste[5] as Pony, pony2: Pony = tierliste[6] as Pony){
        if (pony1.geschwindigkeit<pony2.geschwindigkeit){
            println("Der gewinner ist ${pony2.name}")
        }else{
            println("Der gewinner ist ${pony1.name}")
        }
    }

    fun verwalten(){

        do {

            try {

                println("Wähle ein tier aus bei dem eine Aktion ausgeführt werden soll")

                for (i in tierliste.indices){
                    println("[$i] ${tierliste[i].name}")
                }
                println("[7] Programm beenden")
                var inputTier = readln().toInt()

                when(inputTier){
                    0 -> {tierliste[0].aktionAuswaehlen()}
                    1 -> {tierliste[1].aktionAuswaehlen()}
                    2 -> {tierliste[2].aktionAuswaehlen()}
                    3 -> {tierliste[3].aktionAuswaehlen()}
                    4 -> {tierliste[4].aktionAuswaehlen()}
                    5 -> {tierliste[5].aktionAuswaehlen()}
                    6 -> {tierliste[6].aktionAuswaehlen()}
                    7 -> {
                        println("Sind sie sicher das sie das Programm verlassen wollen\n Ja/Nein")
                        var input = readln().lowercase()
                        if (input == "ja"){
                            println("Das Program wurde beendet")
                            break
                        }else if (input == "nein"){
                            continue
                        }
                    }
                }

            }catch (e:Exception){

                println("\nDeine eingabe war nicht richtig probiere es nochmal\n")
                Thread.sleep(2000)
                continue

            }

        }while (true)

    }
}