import java.time.Year

//"OPEN" convert class father
open class Guitar {

    //Properties
    var _marca:String=""
    //"open" to access
    open var modelo:String="M1"

    var year:Int=1999

    //forced inicialization
    init {
        println("Casa")
        //this._marca = marca
    }

    //Constructors
    constructor(marca: String){
        this._marca = marca
    }

    constructor(marca: String,modelo:String):this(marca){
        this.modelo = modelo
    }

    constructor(marca:String,modelo: String,year: Int):this(marca,modelo){
        this.year = year
    }
}