import scala.io.StdIn

object quickSort {
	def fqsort(a: List[Int]): List[Int] = {
    		if (a.length < 2)
     	 		a
    		else {
     	 		val pivot = a(a.length / 2)
     	 		fqsort(a.filter(_ < pivot)) :::
     	      	a.filter(_ == pivot) :::
     	      	fqsort(a.filter(_ > pivot))
    		}
  	}

	def iqsort(a: Array[Int]) {
		def swap(i: Int, j: Int) {
			val t = a(i); 
			a(i) = a(j); 
			a(j) = t
    		}
	
    		def sort1(l: Int, r: Int) {
     	 		val pivot = a((l + r) / 2)
     	 		var i = l
     	 		var j = r
     		
			while (i <= j) {
     	   			while (a(i) < pivot) i += 1
     	   			while (a(j) > pivot) j -= 1
     	   		
				if (i <= j) {
     	     				swap(i, j)
     	     				i += 1
     	     				j -= 1
     	   			}
     	 		}
     	 	
			if (l < j) sort1(l, j)
     	 		if (j < r) sort1(i, r)
    		}
		
    		if (a.length > 0)
			sort1(0, a.length - 1)
  	}
	
  	def println2(ar: Array[Int]) {
		def print1 = {
     			def iter(i: Int): String =
        		ar(i) + (if (i < ar.length-1) "," + iter(i+1) else "")
      		if (ar.length == 0) "" else iter(0)
    		}
    	
		Console.println("[" + print1 + "]")
  	}

	def main(args: Array[String]) {
		printf("Choose type of quick sort:\n1. Imperative\n2. Functional\n")
		var choice = StdIn.readInt()

		val ar = Array(6,5,2,1,8)
		val ar2 = List(6,2,8,5,1)

		if (choice == 1) {
    			println2(ar)
			iqsort(ar)
    			println2(ar)
		} else if (choice == 2) {
			println(ar2)
    			println(fqsort(ar2))
		}
	}
}
