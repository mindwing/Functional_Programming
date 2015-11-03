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
