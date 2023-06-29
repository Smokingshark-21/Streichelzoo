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
    }
}