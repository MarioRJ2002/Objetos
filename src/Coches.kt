
fun main(){
    var a = Coches("rojo", "fiat", "500", 200,4,"1010DAM")
    var b = Coches("azul", "fiat", "500", 250,4,"1010DA")
    var c = Coches("verde", "fiat", "500", 100,4,"1010DAW")
    print(c.toString())
    print(b.toString())
    print(a.toString())
    a.color="amarillo"
    print(a.toString())
}
class Coches (color:String,marca:String,modelo:String,Num_Caballos:Int,Num_Puertas:Int,matricula:String) {
    var color: String
    var marca: String
    var modelo: String
    var Num_Caballos: Int
    var Num_Puertas: Int
    var matricula: String

    init {
        this.color = color
        this.marca = marca
        this.modelo = modelo
        this.Num_Caballos = Num_Caballos
        this.Num_Puertas = Num_Puertas
        this.matricula = matricula
    }
    override fun toString(): String {
        return("Color: " + this.color + "\n Marca: " + this.marca + "\n Modelo: " + this.modelo
                + "\n Numero de caballos: " + this.Num_Caballos + "\n NumPuertas: " + Num_Puertas
                + "\n Matriculo: " + this.matricula+"\n\n")
    }
}