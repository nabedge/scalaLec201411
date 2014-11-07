import java.io.File

/**
 * Created by yu.watanabe on 2014/11/07.
 */
object FileSearch extends App {

  def find(keyword: String, root: java.io.File): Seq[java.io.File] = {
    var files = root.listFiles().toSeq
    files
  }

  val files = find("foo", new File("C:/tmp"))
  println(files)

  /*
  ファイルを再帰的に検索してみる

  キーワードとディレクトリを指定するとそのディレクトリ配下のファイルから
  ファイル名に指定したキーワードを含むファイルの一覧を
  検索して返す関数を実装してみましょう。
  外部ライブラリを使用せず、JavaとScalaの基本ライブラリだけで実行するものとします。

  関数のシグネチャの例を以下に示します。

  def find(keyword: String, root: java.io.File): Seq[java.io.File]

  また、上記の課題ができたらファイル名に加え、
  ファイルの内容にキーワードを含むものを検索する関数を作ってみましょう。
  ただし、「検索対象のディレクトリ内に巨大なファイルが
  存在する場合でもエラーにならず正しい検索結果を返せること」を条件とします。
  */

}
