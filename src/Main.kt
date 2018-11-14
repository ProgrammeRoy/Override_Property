fun main(args: Array<String>){

    /*
    1.Class father(Guitar)
      -Write "open" before class
      -Write "open" before property
    2.Class son(Acoustic)
      -Write "override" before property to override with the SAME NAME and the SAME TYPE
   */

    //Build class guitar
    val guitar = Guitar("Fender")
    println(guitar.marca+" "+guitar.modelo)

    //Build class Acoustic
    val acoustic = Acoustic("Epiphone","")
    println(acoustic.marca+" "+acoustic.modelo)

}