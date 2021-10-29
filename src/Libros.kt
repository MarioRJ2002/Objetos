fun main() {
    var l1 = Libros("Juanito el golondrina", "El señor de las estrellas", 100, 10.0.toFloat())
    var l2 = Libros("Amigo de los gallos y de las gallines", "MC Dinero", 426, 7.0.toFloat())

    var cl1 = ConjuntoLibros()
    cl1.añadirLibro(l1)
    cl1.añadirLibro(l2)

    cl1.borrarLibroAutor("MC Dinero")
    cl1.borrarLibroTitulo("Juanito el golondrina")

    cl1.añadirLibro(l1)
    print(cl1)
}

class Libros (titulo:String, autor:String, nPags:Int, calificacion:Float){
    val titulo = titulo
    val autor = autor
    val nPags = nPags
    val calificacion = calificacion

    override fun toString(): String {
        return("Este es el libro " + titulo + " escrito por " + autor + ".Consta de " + nPags +
                " paginas y tiene una calificación de " + calificacion+"\n\n")
    }
}

class ConjuntoLibros{
    var libros = arrayOfNulls<Libros?>(10)
    var placeholder = Libros("","",0,0.0.toFloat())
    fun añadirLibro(libro: Libros){
        libros[libros.indexOfFirst { it==null}] = libro
    }
    fun borrarLibroTitulo(titulo:String){
        libros[libros.indexOfFirst { it?.titulo==titulo }] = null
    }
    fun borrarLibroAutor (autor:String){
        libros[libros.indexOfFirst { it?.autor==autor }] = null
    }
    fun mayorMenorCalificacion(){
        var max:Libros = placeholder
        var min:Libros = placeholder
        libros.forEach {
            if (max.calificacion > it?.calificacion?:0){
                max = it
            }
            if (min.calificacion < it?.calificacion?:11){
                min = it
            }
        }
    }

    override fun toString(): String {
        var conjunto = ""
        libros.forEach {
             conjunto += it?:""
        }
        return conjunto
    }
}