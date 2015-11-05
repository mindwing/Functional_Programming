object Solution {

  def gcd(x: Int, y: Int): Int = {
    // You only need to fill up this function
    // To return the value of the GCD of x and y

    if (x == y) x
    else if (x > y) gcd(x - y, y)
    else gcd(x, y - x)
  }

  def gcd2(x: Int, y: Int): Int = x match {
    case x if x > y => gcd2(x - y, y)
    case x if x < y => gcd2(x, y - x)
    case _ => x
  }

  /** This part handles the input/output. Do not change or modify it **/
  def acceptInputAndComputeGCD(pair: List[Int]) = {
    println(gcd(pair.head, pair.reverse.head))
  }

  def main(args: Array[String]) {
    /** The part relates to the input/output. Do not change or modify it **/
    acceptInputAndComputeGCD(io.StdIn.readLine().trim().split(" ").map(x => x.toInt).toList)

  }
}

Solution.gcd(4, 12)
Solution.gcd(4, 13)
Solution.gcd(6, 12)
Solution.gcd(16584, 128)
Solution.gcd(880, 80)

Solution.gcd2(4, 12)
Solution.gcd2(4, 13)
Solution.gcd2(6, 12)
Solution.gcd2(16584, 128)
Solution.gcd2(880, 80)



/*
Problem Statement

The Euclidean Technique for Computing the GCD of two integers

Given two integers 'x' and 'y' a recursive technique to find their GCD is the Euclidean Algorithm.

This Algorithm tells us that, for computing the GCD of two positive integers x and y, if x and y are equal, GCD(x,y) = x, otherwise GCD(x,y) = GCD(x-y,y) if x > y. There are a few optimizations that can be made to the above logic, to arrive at a more efficient implementation.

Given the starter code, you need to complete a function body which returns the GCD of two integers 'x' and 'y' which will be provided to you.

The task of reading in Input and printing the output will be handled by us.
The Youtube video below might be helpful.

How to Find the Greatest Common Divisor by Using the Euclidian Algorithm

https://www.youtube.com/watch?v=JUzYl1TYMcU

Input Format
2 integers with a space in between them.

Output Format
One Integer (i.e, the GCD of the two numbers provided as input).

Sample Input
1 5

Sample Output
1

Constraints
The integers provided to you will be a, b. 1 <= a,b <= 106

Programming Language Support
At this point of time, we have a template for Scala, which means that we provide the code required to accept the input and display the output.

Sample Return Values:

GCD(1,5) = 1
GCD(10,100) = 10
GCD(22,131) = 1

 */