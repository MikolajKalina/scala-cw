import scala.io.Source
val source = Source.fromFile("daneCalki.txt")
source.foreach(println)
source.close
