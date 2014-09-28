package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =  {
		if ((c == 0 ) && (r == 0) ) 1
		else if ( r == 1 ) 1
		else {
			if (c==0 || c == r  ) 1
			else pascal(c, r -1) + pascal (c-1, r - 1)
		}
  }
  
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
  	def bal(excec: Int, aChars: List[Char]): Boolean ={
	  	if ( aChars.isEmpty ) false
	    else if	( aChars.head.toString == "(" ) {
	    	if (aChars.tail.isEmpty) false
	    	else bal(excec + 1, aChars.tail)
	    }
	    else if ( aChars.head.toString == ")" ) {
	    	if (aChars.tail.isEmpty ) {
	    		if (excec >= 2) true
	    		else false
	    	}
	    	else bal(excec + 1, aChars.tail)
	    }
	    else {
	  		bal(excec, aChars.tail)
	    }
  	}
  	bal(1, chars)
  }             
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = 0
}
