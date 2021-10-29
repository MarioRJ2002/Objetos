fun main(){
    var a = tiempo(12,15,21)
}

class tiempo(Hs:Int,min:Int=0,seg:Int=0){
    var h: Int
    var min = 0
    var seg = 0
    init{
        this.seg=seg
        this.min=min
        this.h=Hs
        print(this.toString())
    }

    override fun toString(): String {
        return(this.h.toString() + "h "+ this.min.toString() + "m " + this.seg.toString() + "seg")
    }
}