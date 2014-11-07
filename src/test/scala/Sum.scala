object Sum extends App {

  def getSum(numbers:List[Int]): Int = {
    var total = 0;
    numbers.foreach(n => {total += n})
    total
  }

  val numbers = (1 to 100).toList
  println(getSum(numbers))

/*
総和計算

val numbers = (1 to 100).toListのすべての要素を合計する関数getSumを実装せよ。ただし、Iterable[T]#sum メソッドを利用しないこと。

scala> val numbers = (1 to 100).toList
numbers: List[Int] = ...

scala> val sum = getSum(numbers)
sum: Int = 5050

    さらに getSum((1 to 100000).toList) でもスタックオーバーフローが起きないように工夫せよ。

scala> getSum((1 to 100000).toList)
java.lang.StackOverflowError

関数のプロトタイプ例

def getSum(numbers: List[Int]): Long

*/


}
