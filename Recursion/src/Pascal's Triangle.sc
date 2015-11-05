
//Solution.printPascalTriangle(0)
//Solution.printPascalTriangle(1)
//Solution.printPascalTriangle(2)
//Solution.printPascalTriangle(3)
//Solution.printPascalTriangle(4)
//Solution.printPascalTriangle(5)
//Solution.printPascalTriangle(6)
//Solution.printPascalTriangle(7)

//Solution.calcNum(0, 0)
//Solution.calcNum(1, 0)
//Solution.calcNum(1, 1)
//Solution.calcNum(2, 0)
//Solution.calcNum(2, 1)
//Solution.calcNum(2, 2)
//Solution.calcNum(3, 0)
//Solution.calcNum(3, 1)
//Solution.calcNum(3, 2)
//Solution.calcNum(3, 3)

object Solution {
  def calcNum(n: Int, r: Int): Int =
    factorial(n) / (factorial(r) * factorial(n - r))

  def factorial(i: Int): Int = i match {
    case 0 => 1
    case x => x * factorial(x - 1)
  }

  def printPascalTriangle(lineNum: Int) {
    for (y <- 0 until lineNum; x <- 0 to y) {
      val num = calcNum(y, x)
      if (x == y) println(num) else print(num + " ")
    }
  }

  def main(args: Array[String]) {
    val lineNum = io.StdIn.readInt()

    printPascalTriangle(lineNum)
  }
}


/*
Problem Statement

For a given integer K, print the first K rows of Pascal's Triangle.
Print each row with values separated by spaces.
The value at nthrow and rth column of the triangle
  is equal to n! / (r! * (n-r)!) where indexing start from 0.
These values are the binomial coefficients.

The Pascal Triangle

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
....
Input Format
A Single Integer, K.

Constraints

2 <= K <=10

Output Format

The first K rows of the Pascal Triangle.

Sample Input

4
Sample Output

1
1 1
1 2 1
1 3 3 1

 */