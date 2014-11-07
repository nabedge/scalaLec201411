object Fibonacci extends App {

  /*
  次のフィボナッチ数列を扱う関数fibを実装せよ。
  fib(0) = 0
  fib(1) = 1
  fib(2) = 1
  fib(3) = 2
  fib(4) = 3
  fib(5) = 5
  fib(6) = 8
  fib(7) = 13
  fib(8) = 21
  fib(9) = 34
  fib(10) = 21
  n = 2以上は fib(n) = fib(n - 2) + fib(n - 2 +1) に抽象化できる
  */
  def fib(n: Long): Long = {

    var f0 = 0
    var f1 = 1
    var fn = 0

    for (i <- 1L to n -1) {
      fn = f0 + f1
      f0 = f1
      f1 = fn
    }
    fn
  }
  println(fib(9))

}
