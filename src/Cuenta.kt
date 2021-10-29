fun main(){
    var p1 = persona("1234567Y",)
    var c1 = Cuenta(1,0.0.toFloat())
    var c2 = Cuenta(2,700.0.toFloat())

    p1.añadirCuenta(c1)
    p1.añadirCuenta(c2)

    c1.recibirAbono(1100)
    c2.realizarPago(750)

    println(Cuenta.isMorosa(p1))

    c1.realizarTransferencia(100,c2)

    println(Cuenta.isMorosa(p1))
}
class Cuenta(numCuenta:Int, saldo:Float){
    var numCuenta = numCuenta
    var saldo: Float = saldo

    fun realizarPago( valor:Int){
        this.saldo-=valor
    }
    fun recibirAbono(valor: Int){
        this.saldo+=valor
    }
    fun realizarTransferencia(valor:Int, C2:Cuenta){
        this.realizarPago(valor)
        C2.recibirAbono(valor)
    }
    companion object {
        fun isMorosa(C1: persona):Boolean {
            var isMorosa =false
            C1.cuentas.forEach{
                if(it != null) {
                    if(it.saldo<0){
                        isMorosa=true
                    }
                }
            }
            return isMorosa
        }
    }
}
class persona(Dni:String){

    var DNI : String = Dni
    var cuentas = arrayOfNulls<Cuenta?>(3)

    fun añadirCuenta(C1: Cuenta){
        for(i in 0..cuentas.size-1){
            if (cuentas[i]==null){
                cuentas[i]=C1
                break
            }
            if(cuentas[2]!=null){
                System.out.println("No se pueden añadir mas de tres cuentas")
            }
        }
    }
}