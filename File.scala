import scala.io.Source
import java.io.PrintWriter

if(args.length<2){
	println("Usage requires two args a file and a name to thin to")
} else {
 
val source = Source.fromFile(args(0))
val lines = source.getLines
val matches = lines.filter(line =>( line.split(",")(1)==args(1)))
val pw = new PrintWriter(args(1)+".txt")
matches.foreach(line => pw.println(line))
pw.close 
source.close

}
