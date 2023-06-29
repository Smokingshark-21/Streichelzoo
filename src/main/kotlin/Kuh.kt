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
}