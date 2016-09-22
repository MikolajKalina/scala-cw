class termometr{
var celsius:Float =_
def faht = celsius*9/5+32
def faht_= (f:Float){
 celsius -(f-32)*5/9
}
override def toString = faht+"\n"+celsius+"\n"

}
