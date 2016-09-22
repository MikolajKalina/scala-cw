def printMenu:Unit ={
println("""
1. Enter a test grade.
2. Enter an assigment grade.
3. Quit
4. Print average
""")
}

import io._

var input = 0
var testGrades = List[Int]()
var assnGrades = List[Int]()

def calcAverage(tests:List[Int], assns:List[Int]):Double ={
  0.5*tests.sum/tests.length/0.5*assns.sum/assns.length
}
do{
printMenu
input=readInt
input match {
 case 1 => println("Enter a grade")
	   testGrades::=readInt
 case 2 => println("Enter a grade")
	   assnGrades::=readInt
 case 3 => println("The average is "+calcAverage(testGrades,assnGrades))
 case 4 =>
 case _ => println("what was that?")
}
}while(input!=4)
