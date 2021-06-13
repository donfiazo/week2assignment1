fun main() {
    var tecno : tecnoPhone = tecnoPhone("tecno spark7", 4, 5.6, 32, 2)

    var samsung : samsungPhone = samsungPhone (" Samsung GalaxyS2", 8, 10.6, 128, 1)

    var itel : itelPhone = itelPhone("Itel p37", 2, 3.7, 16, 3)

    var gionee : gioneePhone = gioneePhone ("Gionee Super Battery", 8, 10.6, 128, 1)

    var nokia : nokiaPhone = nokiaPhone("Nokia 705", 4, 5.6, 32, 2)

      tecno.setTecnoModel("Tecno Camon17")
    println(tecno.getTecnoModel())
println()
    samsung.setSamsungModel ("Samsung GalaxyX8")
    println(samsung.getSamsungModel())
    println()

    itel.setItelModel ("Itel h34")
    println(itel.getItelmodel())
    println()

    gionee.setGioneeModel ("Giomee Big Storage")
    println(gionee.getGioneeModel())
    println()

    nokia.setNokiaModel   ("Nokia 3310")
    println(nokia.getNokiaModel())
    println()

}

class tecnoPhone {
    private var tecnoModel = ""
    var tecnoRam = 0
    var tecnoScreen = 0.0
    var tecnoStorage = 0
    var tecnoSim = 0

    constructor(tMod: String, tRam: Int, tScreen: Double, tStorage: Int, tSim: Int) {
        this.tecnoModel = tMod
        this.tecnoRam = tRam
        this.tecnoScreen = tScreen
        this.tecnoStorage = tStorage
        this.tecnoSim = tSim
    }

    fun getTecnoModel(): String {
        return this.tecnoModel
    }

    fun setTecnoModel(tecnoModel: String) {
        this.tecnoModel = tecnoModel
    }
}

    class samsungPhone {
        private var samsungModel = ""
        var samsungRam   = 0
        var samsungScreen  = 0.0
        var samsungStorage  = 0
        var samsungSim  = 0

        constructor(sMod : String, sRam : Int, sScreen : Double, sStorage : Int, sSim : Int ) {
            this.samsungModel = sMod
            this.samsungRam = sRam
            this.samsungScreen = sScreen
            this.samsungStorage = sStorage
            this.samsungSim = sSim
        }
        fun getSamsungModel() : String{
            return this.samsungModel
        }
        fun setSamsungModel(samsungModel : String){
            this.samsungModel = samsungModel
        }
}


class itelPhone {
    private var itelModel = ""
    var itelRam = 0
    var itelScreen = 0.0
    var itelStorage = 0
    var itelSim = 0

    constructor(iMod: String, iRam: Int, iScreen: Double, iStorage: Int, iSim: Int) {
        this.itelModel = iMod
        this.itelRam = iRam
        this.itelScreen = iScreen
        this.itelStorage = iStorage
        this.itelSim = iSim
    }

    fun getItelmodel() : String {
        return this.itelModel
    }

    fun setItelModel(itelModel: String) {
        this.itelModel = itelModel
    }
}

class gioneePhone {
    private var gioneeModel = ""
    var gioneeRam   = 0
    var gioneeScreen  = 0.0
    var gioneeStorage  = 0
    var gioneeSim  = 0

    constructor(gMod : String, gRam : Int, gScreen : Double, gStorage : Int, gSim : Int ) {
        this.gioneeModel = gMod
        this.gioneeRam = gRam
        this.gioneeScreen = gScreen
        this.gioneeStorage = gStorage
        this.gioneeSim = gSim
    }
    fun getGioneeModel() : String{
        return this.gioneeModel
    }
    fun setGioneeModel(gioneeModel : String){
        this.gioneeModel = gioneeModel
    }
}


class nokiaPhone {
    private var nokiaModel = ""
    var nokiaRam   = 0
    var nokiaScreen  = 0.0
    var nokiaStorage  = 0
    var nokiaSim  = 0

    constructor(nMod : String, nRam : Int, nScreen : Double, nStorage : Int, nSim : Int ) {
        this.nokiaModel = nMod
        this.nokiaRam = nRam
        this.nokiaScreen = nScreen
        this.nokiaStorage = nStorage
        this.nokiaSim = nSim
    }
    fun getNokiaModel() : String{
        return this.nokiaModel
    }
    fun setNokiaModel(nokiaModel : String){
        this.nokiaModel = nokiaModel
    }
}
