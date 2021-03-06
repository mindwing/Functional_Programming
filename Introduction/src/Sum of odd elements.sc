def f(arr: List[Int]): Int = {
  var resVal = 0

  for (i <- arr
       if i % 2 != 0
  ) {
    resVal += i
  }

  resVal
}

val input1 = List(3, 2, 4, 6, 5, 7, 8, 0, 1)
f(input1)

val input2 = List(11, 25, 18, -1, 26, -20, -19, 23, -24, -8)
f(input2)





/*
Problem Statement

Return sum of odd elements from an list. The input and output portions will be handled automatically. You need to write a function with the recommended method signature.

Constraints
The list will have 1-100 elements. Each element will be an integer X such that -100<=X<=100.

Sample Input

3
2
4
6
5
7
8
0
1
Sample Output

16
Explanation
Sum of odd elements = 3 + 5 + 7 + 1 = 16

Method Signature

Number Of Parameters: 1
Parameters: [list]
Returns: Number
For Hackers Using Clojure

This will be the outline of your function body (fill up the blank portion marked by underscores):

 (fn[lst]___________________________)
For Hackers Using Scala
This will be the outline of your function body (fill up the blank portion marked by underscores):

 def f(arr:List[Int]):Int = __________________
For Hackers Using Haskell
This will be the outline of your function body (fill up the blank portion marked by underscores):

 f arr = ______________________
For Hackers Using other Languages
You have to read input from standard input and write output to standard output. Please follow input/output format mentioned above.

Please note that you only need to submit the code above, after filling in the blanks appropriately. The input and output section will be handled by us. The focus is on writing the correct function.

 */