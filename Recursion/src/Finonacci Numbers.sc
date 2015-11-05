
object Solution {

  def fibonacci(x: Int): Int = {

    def calcFibonacci(fibo: Int): Int = fibo match {
      // normal fibonacci
      //      case x if x < 1 => 0
      //      case 1 => 1
      case y if y < 2 => 0
      case 2 => 1
      case _ => calcFibonacci(fibo - 2) + calcFibonacci(fibo - 1)
    }

    calcFibonacci(x)
  }

  def main(args: Array[String]) {
    /** This will handle the input and output **/
    println(fibonacci(readInt()))

  }
}


/*
Problem Statement

The Fibonacci Series

The Fibonacci series begins with 0 and 1 (which are the first and the second terms respectively). After this, every element is the sum of the preceding elements: i.e,

Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
Given the starter code, complete the fibonacci function to return the Nth term.

Please note, that we start counting from Fibonacci(1) = 0. This might differ from some other notations which treat Fibonacci(0) = 0.

So overall equation is:

             = 0 , n = 1
Fibonacci(n) = 1 , n = 2
               Fibonacci(n-1) + Fibonacci(n-2)  , n > 2
The Youtube video demonstrates some fascinating cases of Fibonacci sequences around us.


Input Format
One integer N.

Output Format
One integer which is the N-th Fibonacci number.

Sample Input

3
Sample Output

1
Function Prototype
The starter code is provided for Scala. The code for accepting the input and displaying the output is provided. You will be provided the input parameter N, and you need to return the Nth fibonacci term.

Sample Input and Output Values for the Fibonacci Series
fibonacci(3) = (0+1) = 1
fibonacci(4) = (1+1) = 2
fibonacci(5) = (1+2) = 3

Constraints
0 < N <= 40

What this problem requires
Simpler test cases can be cleared even with a purely recursive function with exponentially. To clear the more challenging test cases without violating the principles of functional programming, you might benefit from learning about the accumulator technique.

 */
