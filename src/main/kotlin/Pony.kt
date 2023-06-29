class Pony(
    name:String,
    gewicht:Double,
    alter:Int,
    geschlecht:String,
    var geschwindigkeit:Double
):Tier(name,gewicht,alter,geschlecht) {

    override fun geraeuscheMachen() {
        println("Wiehhiehie")
    }

    override fun fuettern(besucher: Besucher) {
        var list = listOf<String>("Zucker","Karotte")
        var bevorzugtesFutter=list.random()

        if (bevorzugtesFutter=="Zucker"){
            println("Das Pony[$name] wurde von ${besucher.name} mit $bevorzugtesFutter Gefuettert")
        }
    }

    fun reiten(besucher: Besucher){
        if (alter>1 ){
            if (besucher.alter>6) {
                println("${besucher.name} Reitet auf $name mit einer geschwindigkeit von $geschwindigkeit")
            }else{
                println("Der Besucher ${besucher.name} ist unter 6 Jahren und darf deswegen nicht auf dem Pony reiten")
            }
        }else{
            println("Das Pony $name ist unter einem Jahr und darf deswegen noch nicht geritten werden")
        }
    }
}