fun tierErstellen():Tier{
   while (true) {

       try {
           println(
           "Was für ein Tier möchten sie erstellen\n" +
                   "Schaf,Huhn,Kuh,Pony,")
           var firstinput = readln().lowercase()

           println("Was für einen namen hat das Tier?")
           var name = readln()

           println("Wie viel wiegt das Tier?")
           var weight = readln().toDouble()

           println("Wie Alt ist das Tier?")
           var age = readln().toInt()

           println("Was für ein Geschlecht hat das Schaf Männlich oder Weiblich")
           var gender = readln().lowercase()



           when(firstinput){

               "pony" ->{
                   println("Wie Schnell ist das Pony?")
                   var speed = readln().toDouble()
                   return Pony(name,weight,age,gender,speed)
               }
               "kuh" -> {return Kuh(name,weight,age,gender)}

               "huhn" -> {return Huhn(name,weight,age,gender)}

               "schaf" -> {
                   println("Ist die Wolle von dem Schaf sauber ja=true nein=false")
                       var clean = readln().toBoolean()

                   return Schaf(name,weight,age,gender,clean)
               }

           }

       } catch (e: Exception) {
           println("\nProbiere es nochmal\n")
           continue

       }

   }

}


fun besucherErstellen():Besucher{
    while (true){
        try {

            println("Wie heißt du")
            var name = readln()

            println("Wie alt bist du?")
            var age = readln().toInt()

            return Besucher(age,name)

        }catch (e:Exception) {
            println("\nProbiere es nochmal\n")
            continue
        }
    }
}
fun main(){
    var tierliste = mutableListOf<Tier>()

    repeat(4){
        tierliste.add(tierErstellen())
    }


}