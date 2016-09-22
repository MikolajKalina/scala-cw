def fact2(n:Int): Int = n match {
case 0 => 1
case _=> n*fact2(n-1)
}

def sumsquares(n:Int):Int = n match {
case 0 => 1
case _=> n*n+sumsquares(n-1)
}

def countDown(n:Int):Unit = n match {
case 0 =>
case _=>{ 
 println(n)
 countDown(n-1)
}}
println(sumsquares(4))
countDown(5)

