
def evalPoly(coeffs:Array[Double],x:Double):Double ={
 var sum = 0.0
 for(i <- coeffs.indices){
 sum += coeffs(i)*math.pow(x,coeffs.length-1-i)
 }
 sum
}

println(evalPoly(Array(3,2,-5),1))


def evalPoly2(coeffs:Array[Double],x:Double):Double ={
 var sum = 0.0
 var power = 1.0

 for(c <- coeffs.reverse){
 sum += c*power
 power*=x 
}
 sum
}

println(evalPoly2(Array(3,2,-5),1))
