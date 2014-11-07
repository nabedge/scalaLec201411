object Factorial extends App {

  def fact(n: Int): Long = {
    var result:Long = 1L
    for (i <- 1 to n) {
      result = n * fact(n-1)
    }
    result
  }
  println(fact(5)) // 120


  //println(fact(10000))

/*
  階乗計算

以下のような階乗計算を行う関数factを実装せよ。

fact(0) = 1
fact(1) = 1
fact(2) = 2 * 1 = 2
fact(3) = 3 * 2 * 1 = 6
fact(4) = 4 * 3 * 2 * 1 = 24
fact(5) = 5 * 4 * 3 * 2 * 1 = 120

n = 2以上は fact(n) = n * fact(n - 1) に抽象化できる

    さらに fact(10000) でもスタックオーバーフローが起きないように工夫せよ。

scala> fact(10000)
java.lang.StackOverflowError

関数のプロトタイプ例

def fact(n: Int): Long

   */

}
