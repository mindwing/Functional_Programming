def f(arr: List[Int]): List[Int] = {
  var resVal: List[Int] = List()

  for (i <- arr) {
    resVal = i :: resVal
  }

  resVal
}

var input = List(19, 22, 3, 28, 26, 17, 18, 4, 28, 0)
f(input)
