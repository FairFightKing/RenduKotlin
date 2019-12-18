class Animalerie{

}

interface Animal{
    var bruit : String
    var espece : String
    var nom : String

    fun quiSuisJe(){
        var result : String = "Je suis un $espece et je m'appelle $nom"
        println(result)
    }
    fun parler(){
        println(bruit)
    }
}

class Chien(nom: String) : Animal{
    override var bruit = "Whouaf Whouaf"
    override var espece : String = "chien"
    override var nom : String = nom
}class Chat(nom: String) : Animal{
    override var bruit = "Miaou"
    override var espece : String = "chat"
    override var nom : String = nom
}class Perroquet(nom: String) : Animal{
    override var bruit = "Coco"
    override var espece : String = "perroquet"
    override var nom : String = nom
}

fun main(Args: Array<String>){

    var Animalerie = Animalerie()

    println("Bienvenue dans notre Animalerie !")
    var bonjour = readLine()!!
    if(bonjour == "bonjour"){
        println("ça me fais plaisir de vous voir,")
    }
    println("Je m'appelle Marine et je vais vous présenter nos Animaux.")
    println("Nous ne prenons que des chiens, des chats et des perroquets.")
    var yes = readLine()!!
    if(yes != "non" || yes != "no") {

        var Bernard: Animal = Chien("Bernard")
        var Lucas: Animal = Perroquet("Lucas")
        var Blanche: Animal = Chat("Blanche")
        var Mamadou: Animal = Chien("Mamadou")

        println("Voilà nos Animaux, je les laisses ce présenter")
        Bernard.quiSuisJe()
        Bernard.parler()

        Blanche.quiSuisJe()
        Blanche.parler()

        Lucas.quiSuisJe()
        Lucas.parler()

        Mamadou.quiSuisJe()
        Mamadou.parler()

        println("Voulez-vous qu'on s'occupe de votre Animal ?")
        var reponse = readLine()!!

        if (reponse == "oui" || reponse == "o" || reponse == "yes" || reponse == "yes") {
            println("De quel race ?(chien, chat, perroquet)")
            var espece = readLine()!!
            println("Quel est son nom ?")
            var name = readLine()!!
            if (espece == "chien") {
                var animalDuJoueur: Animal = Chien(name)
                animalDuJoueur.quiSuisJe()
                animalDuJoueur.parler()
            } else if (espece == "chat") {
                var animalDuJoueur: Animal = Chat(name)
                animalDuJoueur.quiSuisJe()
                animalDuJoueur.parler()
            } else if (espece == "perroquet") {
                var animalDuJoueur: Animal = Perroquet(name)
                animalDuJoueur.quiSuisJe()
                animalDuJoueur.parler()
            } else {
                println("Vous vous êtes trompé, celà n'existe pas ou est mal écris")
            }
        }


        println("J'espère vous revoir bientôt.")
    }
    println("Merci d'être passé dans notre Animalerie !")
}