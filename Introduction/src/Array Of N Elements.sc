def f(num: Int): List[Int] = List.fill(num)(num)

def f2(num: Int): List[Int] = {
  var resVal = List[Int]()

  for (i <- 0 until num) {
    resVal = i :: resVal
  }

  resVal
}

f(1)
f(2)
f(3)
f2(4)
f2(5)
