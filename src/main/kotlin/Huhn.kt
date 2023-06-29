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
}