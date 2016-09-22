def readInts:List[Int] = {
 var input = readLine
 var lst = List[Int]()
 while(input != "quit"){
   lst ::= input.toInt
   input = readLine
 }
 lst.reverse
}

println(readInts)
