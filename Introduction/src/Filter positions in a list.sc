def f(arr: List[Int]): List[Int] = {
  var b: Boolean = false
  var resVal = List[Int]()

  for (i <- arr) {
    resVal = if (b) resVal ::: List(i) else resVal
    b = !b
  }

  resVal
}

def f2(arr: List[Int]): List[Int] = {
  var resVal = List[Int]()

  for (i <- 1 until arr.length by 2) {
    resVal = arr(i) :: resVal
  }

  resVal.reverse
}

def f3(arr: List[Int]): List[Int] = {
  var resVal = List[Int]()
  val l = arr.length - (if (arr.length % 2 == 0) 1 else 2)

  for (i <- l to 0 by -2) {
    resVal = arr(i) :: resVal
  }

  resVal
}

def f4(arr: List[Int]): List[Int] = {
  var arr2 = arr.drop(1)
  var resVal = List[Int]()

  while (arr2.nonEmpty) {
    resVal = resVal ++ arr2.take(1)
    arr2 = arr2.drop(2)
  }

  resVal
}

val arr = List(2, 5, 3, 4, 6, 7, 9, 8)
f(arr)
f2(arr)
f3(arr)
f4(arr)

//arr
//var arr2 = arr.drop(1)
//
//arr2.take(1)
//arr2 = arr2.drop(2)
//arr2.take(1)
//arr2 = arr2.drop(2)
//arr2.take(1)
//arr2 = arr2.drop(2)
//arr2.take(1)
//arr2 = arr2.drop(2)
//arr2.take(1)
//arr2 = arr2.drop(2)





/*
Problem Statement

For a given list with N integers, return a new list removing the elements at odd positions. The input and output portions will be handled automatically. You need to write a function with the recommended method signature.

Input Format
N integers contained in the list, each on a new line.

Output Format
List of integers, with integers at odd positions removed (so the first element, the third element and so on will be removed). The relative positions of the remaining (even-position) elements should be the same as they were in the original array. Each integer will be on a new line.

Please note, that by "odd positions" we mean the first, third, fifth position of the array need to be filtered out. As per programming language conventions, these might (and they often do) correspond to indices 0, 2, 4 and so on.

Sample Input

2
5
3
4
6
7
9
8
Sample Output

5
4
7
8
Recommended Method Signature

Number Of Parameters: 1
Parameters: [list]
Returns: List or Vector
For Hackers Using Clojure

This will be the outline of your function body (fill up the blank portion marked by underscores):

 (fn[lst]___________________________)
For Hackers Using Scala
This will be the outline of your function body (fill up the blank portion marked by underscores):

 def f(arr:List[Int]):List[Int] = ______________________
For Hackers Using Haskell
This will be the outline of your function body (fill up the blank portion marked by underscores):

 f lst = _________________________
For Hackers Using other Languages
You have to read input from standard input and write output to standard output. Please follow input/output format mentioned above.

Please note that you only need to submit the code above, after filling in the blanks appropriately. The input and output section will be handled by us. The focus is on writing the correct function.

 */