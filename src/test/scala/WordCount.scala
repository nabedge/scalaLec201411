/**
 * Created by yu.watanabe on 2014/11/07.
 */
object WordCount extends App {

  val lines = List("apple banana", "orange apple mango", "kiwi papaya orange","mango orange muscat apple")
  // に含まれるフルーツの数を数える関数 countFruitsFromLines を実装せよ。

  def countFruitsFromLines(lines: List[String]): Map[String, Int] = {
    //lines.
    var map = Map()
    lines.foreach(string => {
      string.split(" ").foreach(key => {
        map.put()
        println(key)
      })
    })
    null // TODO
  }

  val fruitsCounts = countFruitsFromLines(lines)
  if (fruitsCounts == Map("banana" -> 1, "muscat" -> 1, "orange" -> 3, "mango" -> 2, "apple" -> 3, "kiwi" -> 1, "papaya" -> 1)){
    println("正解")
  } else {
    println("不正解")
  }

}
