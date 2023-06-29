open class Tier(var name:String, var gewicht:Double, var alter:Int, var geschlecht:String) {
    fun bewegung(){
        println("Das Tier[$name] hat ein paar schritte nach vorne gemacht")
    }

    open fun geraeuscheMachen(){
        println("Das Tier[$name] macht *Geraeusche*")
    }

    fun streicheln(besucher: Besucher){
        println("Das Tier[$name] wird von ${besucher.name} gestreichelt")
    }

   open fun fuettern(besucher: Besucher){
        println("Das Tier[$name] wird von ${besucher.name} gefuettert")
        gewicht+=gewicht*0.02
    }

    open fun aktionAuswaehlen(){}
}