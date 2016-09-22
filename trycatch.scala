import io._

def safeReadInt:Int = {
 try{
  readInt
 } catch{
    case e:NumberFormatException => println("to nie int, daj inta")
   safeReadInt
 }



}
val i = safeReadInt

println(i)
