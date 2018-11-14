//"OPEN" convert class father
open class Guitar(marca:String) {

    //Properties
    var marca:String=""
    //"open" to access
    open var modelo:String="M1"

    //forced inicialization
    init {
        this.marca = marca
    }

    //Constructor
    constructor(marca: String,modelo:String):this(marca){
        this.modelo = modelo
    }
}