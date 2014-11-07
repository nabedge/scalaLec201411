
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCountJ {

    /**
     * 本体です。
     * val lines = List("apple banana", "orange apple mango", "kiwi papaya orange","mango orange muscat apple")
     * に含まれるフルーツの数を数える関数 countFruitsFromLines を実装せよ。
     *
     *   if (fruitsCounts == Map("banana" -> 1, "muscat" -> 1, "orange" -> 3, "mango" -> 2, "apple" -> 3, "kiwi" -> 1, "papaya" -> 1)){
     *      println("正解")
     *
     */
    private static Map<String,Integer> countFruitsFromLines(List<String> lines) {
        Map<String,Integer> map = new HashMap<String, Integer>();
        lines.forEach(line -> {
            Arrays.asList(line.split(" ")).forEach(string -> {
                Integer i = map.getOrDefault(string, 0);
                map.put(string, i + 1);
            });
        });
        return map;
    }

    /** 実行/検証メソッドです */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple banana", "orange apple mango", "kiwi papaya orange","mango orange muscat apple");
        Map<String, Integer> expected = new HashMap<String, Integer>() {
            {
                put("banana", 1);
                put("muscat", 1);
                put("orange", 3);
                put("mango", 2);
                put("apple", 3);
                put("kiwi", 1);
                put("papaya", 1);
            }
        };
        Map<String,Integer> result = countFruitsFromLines(list);
        if (result.equals(expected)) {
            System.out.println("正解");
        } else {
            System.out.println("不正解");
        }
    }

}
