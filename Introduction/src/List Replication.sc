def f(num: Int, arr: List[Int]): List[Int] = {
  var resVal = List[Int]()

  for (i <- arr) resVal = resVal ++ List.fill(num)(i)

  resVal
}

f(3, List(1, 2, 3, 4))