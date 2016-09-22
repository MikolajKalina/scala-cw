import scala.io.Source

val filename = io.Source.fromFile("DataToCezarCode.txt")
for(char <- filename){

 if(char>=65 && char <= 122){
 val c = (char+13).toChar
 print(c)
 print(" " + char)
 println()
 }

 else println(char)
}
println()

