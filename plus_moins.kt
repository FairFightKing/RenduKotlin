fun main(args: Array<String>){

    print("Le nombre secret sera:")
    var initialNb = readLine()!!
    print("donne ta réponse:")
    var tryNb = readLine()!!

    while (tryNb != initialNb) {

        print("réessaye:")
        var tryNb = readLine()!!
        if (initialNb == tryNb) {
            break
        } else if (initialNb > tryNb) {
            print("C'est plus, ")
        } else if (initialNb < tryNb) {
            print("c'est moins, ")
        }
    }
    print("Tu as gagné !")
}