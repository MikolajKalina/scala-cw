import io._

def sum(n:Int):Int = {
	if(n<1) 0
	else{
	 val input = readInt
	 input + sum(n-1)
	}
}

def sumPositive():Int ={
 val input = readInt
 if(input>=0) {
  input+sumPositive()
 }else 0
}


def multAndCount():(Int,Int)={
val input = readLine.toLowerCase.trim
if(input=="quit") (1,0)
else {
 val (prod,count) = multAndCount()
 (input.toInt+prod, count+1)
}
}

def InputAndCount(base:Int op:(Int,Int)=> Int):(Int,Int)={
val input = readLine.toLowerCase.trim
if(input=="quit") (base,0)
else {
 val (value,count) = InputAndCount(base,op)
 (op(input.toInt+value), count+1)
}
}

val (s,c) = InputAndCount(0,_+_)
println(s+" "+c)
