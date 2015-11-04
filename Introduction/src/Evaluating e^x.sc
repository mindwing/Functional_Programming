def f(x: Float): Float = {
  var resVal = 0.0

  for (i <- 0 to 9) {
    resVal += (math.pow(x, i) / factorial(i))
  }

  def factorial(i: Int): Int = i match {
    case 0 => 1
    case x => x * factorial(x - 1)
  }

  math.round(resVal * 10000) / 10000f
}

2423600.1887f
f(20.0000f)
f(20.0000f) == 2423600.1887f

143.6895f
f(5.0000f)
f(5.0000f) == 143.6895f

1.6487f
f(0.5000f)
f(0.5000f) == 1.6487f

0.6065f
f(-0.5000f)
f(-0.5000f) == 0.6065f




/*
Problem Statement

The series expansion of ex is given by:

1 + x + x2/2! + x3/3! + x4/4! + .......

Evaluate e^x for given values of x, by using the above expansion for the first 10 terms.

Input Format

The first line contains an integer number N which will be the number of test cases. N lines follow, each line containing a value of x for which you need to output the value of e^x using the above series expansion.These input values have exactly 4 decimal places each.

Output Format

N lines, each of them containing the value of e^x, computed by your program.

Constraints

1 <= N <= 50
-20.00 <= x <= 20.00
Var, Val in Scala; def and defn in Clojure are blocked keywords. The challenge is to accomplish this without either mutable state, or direct declaration of local variables.

Sample Input

4
20.0000
5.0000
0.5000
-0.5000
Sample Output

2423600.1887
143.6895
1.6487
0.6065
Explanation

The output, has the computed values of ex; one per line; corresponding to each test case correct upto 4 decimal places.

Scoring

All test cases carry an equal weightage in the final score. For your solution to pass a given test case, all the values of ex computed by you must be within +/- 0.1 of the expected answers. This tolerance level has been kept to account for slightly different answers across different languages.

 */