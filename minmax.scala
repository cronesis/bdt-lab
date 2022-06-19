import scala.io.StdIn
import scala.collection.mutable.ArrayBuffer

object scalaMinMax {
	def main(args: Array[String]) {
		val numArray = ArrayBuffer[Int]()
		println("Enter the number of elements.")
		val n = StdIn.readInt()

		println("Enter the array elements.")
		for(i <- 1 to n)
			numArray += StdIn.readInt()

		val result = minmax(numArray)
		println("Largest element is " +result._1+ " and the smallest number is " +result._2)
	}

	def minmax (nA: ArrayBuffer[Int]): (Int, Int) = {
		var max: Int = -999
		var min: Int = 999
		
		for (v <- nA) {
			if (v > max)
				max = v
			if (v < min)
				min = v
		}

		(max, min)
	}
}
