object Pe001 {
  def main(args: Array[String]): Unit = {
     println((1 to 999).toList.filter(x => x % 3 == 0 || x % 5 == 0).sum)
  }
}