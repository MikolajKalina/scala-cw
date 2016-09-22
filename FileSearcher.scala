object FM {
 private def filesHere = (new java.io.File(".")).listFiles

/* def filesEnding(query: String) = for (file<- filesHere; if file.getName.endsWith(query))
   yield file

 def filesContaining(query: String) = for( file <- filesHere; if file.getName.contains(query)) yield file

 def filesRegex(query: String) = for(file <-filesHere; if file.getName.matches(query)) yield file
}
*/
def filesMatching(q:String, matcher:(String,String) => Boolean) = { 
	for(file <- filesHere; if matcher(file.getName,q)) yield file
}

def filesEnding(q:String) = filesMatching(q, _.endsWith(_))
def filesCont(q:String) = filesMatching(q,_.contains(_))
def filesReges(q:String) = filesMatching(q,_.matches(_))
}

