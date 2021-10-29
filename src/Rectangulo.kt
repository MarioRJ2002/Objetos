
class Rectangulo (largo:Float,ancho :Float){


    var largo: Float
    var ancho: Float

    init{
        this.largo = largo
        this.ancho = ancho
    }


        fun areaRectangulo() :Float{ return(ancho*largo)}

        fun perimetroRectangulo() :Float{ return((2*ancho)+(2*largo)) }
}

fun main(){

    var r1 = Rectangulo(2.5.toFloat(),5.2.toFloat())
    var r2 = Rectangulo(5.toFloat(),3.2.toFloat())
    var r3 = Rectangulo(9.4.toFloat(),1.5.toFloat())
    var r4 = Rectangulo(2.toFloat(),59.toFloat())

    println(r1.areaRectangulo())
    println(r2.areaRectangulo())
    println(r3.areaRectangulo())
    println(r4.areaRectangulo())

    println("")

    println(r1.perimetroRectangulo())
    println(r2.perimetroRectangulo())
    println(r3.perimetroRectangulo())
    println(r4.perimetroRectangulo())

}
