fun main(){
    var besucher1 = Besucher(15,"John")
    var besucher2 = Besucher(20,"Jimi")
    var besucher3 = Besucher(5,"Emy")
    var besucher4 = Besucher(10,"Thomas")
    var besucher5 = Besucher(2,"Karl")
    var besucher6 = Besucher(19,"Lisa")
    var streichelzoo= Streichelzoo()

    var besucherliste= listOf<Besucher>(besucher1,besucher2,besucher3,besucher4,besucher5,besucher6)


    // aufgabe 1
    for (i in besucherliste.indices){
        streichelzoo.neuerBesucher(besucherliste[i])
        println()
    }

    //aufgabe2
    for (i in streichelzoo.besucherListe.indices){
        var  pony =streichelzoo.tierliste[5] as Pony
        pony.reiten(streichelzoo.besucherListe[i])
        println()
    }

    //aufgabe3
    for (i in streichelzoo.besucherListe.indices) {

        if (true) {
            streichelzoo.tierliste[2].fuettern(streichelzoo.besucherListe[i])
            println()
            break
        }
    }

    //aufgabe4
    streichelzoo.tierliste[1].bewegung()
    println()

    //aufgabe5
    for (i in streichelzoo.besucherListe.indices) {

        if (i <= 2){
            streichelzoo.tierliste[4].streicheln(streichelzoo.besucherListe[i])
            println()
        }else{
            continue
        }
    }

    //aufgabe6
    for (i in streichelzoo.besucherListe.indices){
        if (i<= 1){
            streichelzoo.exit(streichelzoo.besucherListe[i])
        }else{
            break
        }
    }


    //aufgabe7
    var melk =streichelzoo.tierliste[4] as Kuh
    melk.melken(streichelzoo.besucherListe[2])
    println()


    //aufgabe8
    for (i in streichelzoo.tierliste.indices){

        streichelzoo.tierliste[i].fuettern(streichelzoo.besucherListe[1])
    }
    println()

    //aufgabe9
    for (i in streichelzoo.tierliste.indices) {
        var schaf1 = streichelzoo.tierliste[0] as Schaf
        var schaf2 = streichelzoo.tierliste[1] as Schaf

        if (i < 2) {
            if (schaf1.wolleSauber && schaf2.wolleSauber) {
                continue
            } else if (!schaf2.wolleSauber) {
                schaf2.baden()
            } else {
                schaf1.baden()
            }
        }else{
            continue
        }
    }
    println()

    //aufgabe10
    streichelzoo.rennen()

    //aufgabe11
    streichelzoo.besucherListe.clear()

}