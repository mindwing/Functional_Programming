def f(arr: List[Int]): Int = {
  var resVal = 0

  for (i <- arr
       if i % 2 == 1
  ) {
    resVal += i
  }

  resVal
}

var input = List(3, 2, 4, 6, 5, 7, 8, 0, 1)
f(input)
// why is my answer incorrect?