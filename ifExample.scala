import io._

println("How old are you")
val age = readInt
val response = if(age<21) "Get lost" 
		else "good"

println(response)
