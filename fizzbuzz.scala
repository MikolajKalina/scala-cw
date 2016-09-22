def fizzBuzz(i:Int): Unit ={
  if(i<=100) {
   (i%3,i%5) match{
	case(0,0) => println("FizzBuzz")
	case(0,_) => println("Fizz")
	case(_,0) => println("Buzz")
	case _ => println(i)
   }
   fizzBuzz(i+1)
  }
}

fizzBuzz(1)
