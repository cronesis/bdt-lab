import scala.io.Source

object scalaWordCount {
	def main(args: Array[String]) {
		if (args.length != 1) {
			System.err.println("Need exactly 1 argument")
			System.exit(1)
		}

		val fileName = args(0)
		val wordCount = scala.collection.mutable.Map[String, Int]()

		for(line <- Source.fromFile(fileName).getLines())
			for(word <- line.split("\\s+"))
				wordCount(word) = if(wordCount.contains(word)) wordCount(word)+1 else 1

		for((k, v) <- wordCount)
			printf("Word %s appears %d times in the file.\n" ,k,v)
	}
}