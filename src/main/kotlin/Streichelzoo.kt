class Streichelzoo() {
    var tierliste= listOf<Tier>(
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

    fun verwalten(){}
}