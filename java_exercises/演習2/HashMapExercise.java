import java.util.ArrayList;
import java.util.HashMap;

/**
 * HashMap の基本演習
 * 
 * この演習では、HashMap の基本的な操作を学びます：
 * - HashMapの宣言と初期化
 * - キーと値の追加、取得、削除
 * - HashMapの操作と検索
 */
public class HashMapExercise {

    /**
     * 整数と文字列のマッピングを格納するHashMapを作成します
     * 
     * @param numbers 整数の配列（キー）
     * @param strings 文字列の配列（値）
     * @return 整数をキー、文字列を値とするHashMap
     */
    public static HashMap<Integer, String> createNumberMap(int[] numbers, String[] strings) {
        // TODO: 以下のステップを実装してください
        // 1. Integer型をキー、String型を値とするHashMapを宣言して初期化する (HashMap<Integer, String>
        // mapという名前を使ってください)
        // 2. numbers配列とstrings配列の要素を対応付けてマップに追加する（両方の配列は同じ長さと仮定）
        // 3. マップを返す

        return null; // この行を適切に修正してください
    }

    /**
     * 文字列の出現回数をカウントするHashMapを作成します
     * 
     * @param words 文字列の配列
     * @return 文字列をキー、出現回数を値とするHashMap
     */
    public static HashMap<String, Integer> countWords(String[] words) {
        // TODO: 以下のステップを実装してください
        // 1. String型をキー、Integer型を値とするHashMapを宣言して初期化する (HashMap<String, Integer>
        // countMapという名前を使ってください)
        // 2. words配列の各要素について、既にマップに存在する場合はカウントを1増やし、
        // 存在しない場合は新しいエントリとしてカウント1で追加する
        // 3. マップを返す

        return null; // この行を適切に修正してください
    }

    /**
     * HashMapから指定された値を持つすべてのキーを抽出します
     * 
     * @param map   検索対象のHashMap
     * @param value 検索する値
     * @return 指定された値を持つキーのArrayList
     */
    public static ArrayList<String> findKeysByValue(HashMap<String, Integer> map, Integer value) {
        // TODO: 以下のステップを実装してください
        // 1. 結果を格納するためのString型のArrayListを宣言して初期化する
        // 2. mapの各エントリーを調べ、値が指定されたvalueと一致するエントリーのキーをリストに追加する
        // 3. リストを返す

        return null; // この行を適切に修正してください
    }

    /**
     * HashMapから指定された条件を満たすエントリーを削除します
     * この場合、値が指定された閾値より小さいエントリーを削除します
     * 
     * @param map       操作対象のHashMap
     * @param threshold 閾値
     */
    public static void removeEntriesBelowThreshold(HashMap<String, Integer> map, int threshold) {
        // TODO: mapから値がthreshold未満のエントリーを削除するコードを実装してください
        // ヒント: Java 8以降ではremoveIf()メソッドが使えます、または安全な反復処理を使用してください
    }

    /**
     * HashMapの値の合計を計算します
     * 
     * @param map 整数値を持つHashMap
     * @return 値の合計
     */
    public static int calculateValueSum(HashMap<String, Integer> map) {
        // TODO: マップの値の合計を計算するコードを実装してください

        return 0; // この行を適切に修正してください
    }

    /**
     * HashMapで最大の値を持つキーを見つけます
     * 
     * @param map 整数値を持つHashMap
     * @return 最大値を持つキー（複数ある場合は任意の一つ）、マップが空の場合はnull
     */
    public static String findKeyWithMaxValue(HashMap<String, Integer> map) {
        // TODO: 以下のステップを実装してください
        // 1. マップが空の場合はnullを返す
        // 2. マップ内の最大値とそのキーを見つける
        // 3. 最大値を持つキーを返す

        return null; // この行を適切に修正してください
    }

    /**
     * テスト用メインメソッド
     */
    public static void main(String[] args) {
        // createNumberMapのテスト
        int[] keys = { 1, 2, 3, 4, 5 };
        String[] values = { "りんご", "バナナ", "オレンジ", "ぶどう", "メロン" };

        HashMap<Integer, String> fruitMap = createNumberMap(keys, values);
        System.out.println("数値-果物マップ: " + fruitMap);

        // countWordsのテスト
        String[] words = { "りんご", "バナナ", "りんご", "オレンジ", "バナナ", "りんご", "ぶどう" };
        HashMap<String, Integer> wordCounts = countWords(words);
        System.out.println("\n単語出現回数: " + wordCounts);

        // findKeysByValueのテスト
        ArrayList<String> twoCountWords = findKeysByValue(wordCounts, 2);
        System.out.println("\n2回出現する単語: " + twoCountWords);

        // removeEntriesBelowThresholdのテスト
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 85);
        scores.put("Bob", 62);
        scores.put("Charlie", 90);
        scores.put("David", 55);
        scores.put("Eve", 71);

        System.out.println("\n元のスコア: " + scores);
        removeEntriesBelowThreshold(scores, 70);
        System.out.println("70未満のスコアを削除後: " + scores);

        // calculateValueSumのテスト
        HashMap<String, Integer> quantities = new HashMap<>();
        quantities.put("りんご", 5);
        quantities.put("バナナ", 3);
        quantities.put("オレンジ", 2);

        int sum = calculateValueSum(quantities);
        System.out.println("\n数量の合計: " + sum);

        // findKeyWithMaxValueのテスト
        HashMap<String, Integer> productPrices = new HashMap<>();
        productPrices.put("パソコン", 80000);
        productPrices.put("スマートフォン", 60000);
        productPrices.put("タブレット", 40000);

        String mostExpensive = findKeyWithMaxValue(productPrices);
        System.out.println("\n最も高価な製品: " + mostExpensive);
    }
}
