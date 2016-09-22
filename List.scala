import io._

def inputList(n:Int):List[Int] = {
 if(n < 1) Nil
 else readInt :: inputList(n-1)
}

def operationOnList(lst:List[Int], base:Int, f:(Int,Int)=>Int):Int ={  
 if(lst == Nil) base
 else f(lst.head,operationOnList(lst.tail, base, f))
}

def operateOnList(lst:List[Int], base:Int, f:(Int,Int) => Int):Int = lst match{
 case Nil => base
 case h :: t => f(h,operateOnList(t,base,f))

}

def fillList(n:Int, v:Double):List[Double]={
 if(n<1) Nil
 else v :: fillList(n-1,v)
}


val lst = inputList(5)
println(lst)
println(operationOnList(lst, 0,_+_))
