def f(delim: Int, arr: List[Int]): List[Int] = arr.filter(i => i < delim)

f(3, List(3, 10, 9, 8, 2, 7, 5, 1, 3, 0))
