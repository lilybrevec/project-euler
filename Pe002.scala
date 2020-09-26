object Pe002 {
  // val cache = collection.mutable.Map[Int, Int]()
  def fibList(f0: Int, f1: Int, l: Int): List[Int] = {
    // val ans:Long = cache.getOrElseUpdate(i, fib(i - 1) + fib(i - 2))
    val f2 = f0 + f1
    if (f2 > l) Nil else f2::fibList(f1, f2, l)
  }
  def fibList(l: Int): List[Int] = 1 :: 2 :: fibList(1, 2, l)
  def main(args: Array[String]): Unit = {
    println ("Pe002")
    println(fibList(4000000).filter(x => x % 2 == 0).sum)
  }
}