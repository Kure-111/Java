import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * HashMap演習のテスト
 * 
 * このテストファイルは HashMapExercise クラスの機能をテストします。
 */
public class HashMapExerciseTest {

    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("HashMap演習のテスト");
        System.out.println("===================================");

        testCreateNumberMap();
        testCountWords();
        testFindKeysByValue();
        testRemoveEntriesBelowThreshold();
        testCalculateValueSum();
        testFindKeyWithMaxValue();

        // 最終結果の出力
        System.out.println("\n--- テスト結果の概要 ---");
        System.out.println("合計テスト数: " + totalTests);
        System.out.println("成功: " + passedTests);
        System.out.println("失敗: " + (totalTests - passedTests));

        if (passedTests == totalTests) {
            System.out.println("\n🎉 おめでとうございます！すべてのテストに合格しました！");
        } else {
            System.out.println("\n💡 すべてのテストに合格していません。失敗したテストを確認して修正してください。");
        }
    }

    /**
     * createNumberMap メソッドのテスト
     */
    private static void testCreateNumberMap() {
        System.out.println("\n----- createNumberMap のテスト -----");

        // テスト1: 通常の配列
        int[] keys1 = { 1, 2, 3 };
        String[] values1 = { "りんご", "バナナ", "オレンジ" };

        HashMap<Integer, String> expected1 = new HashMap<>();
        expected1.put(1, "りんご");
        expected1.put(2, "バナナ");
        expected1.put(3, "オレンジ");

        HashMap<Integer, String> result1 = HashMapExercise.createNumberMap(keys1, values1);
        runTest("createNumberMap が正しいマップを返すこと",
                result1 != null && result1.equals(expected1));

        // テスト2: 空の配列
        int[] keys2 = {};
        String[] values2 = {};

        HashMap<Integer, String> expected2 = new HashMap<>();
        HashMap<Integer, String> result2 = HashMapExercise.createNumberMap(keys2, values2);
        runTest("createNumberMap が空の配列を正しく処理すること",
                result2 != null && result2.equals(expected2));
    }

    /**
     * countWords メソッドのテスト
     */
    private static void testCountWords() {
        System.out.println("\n----- countWords のテスト -----");

        // テスト1: 重複を含む配列
        String[] words1 = { "りんご", "バナナ", "りんご", "オレンジ", "バナナ", "りんご" };

        HashMap<String, Integer> expected1 = new HashMap<>();
        expected1.put("りんご", 3);
        expected1.put("バナナ", 2);
        expected1.put("オレンジ", 1);

        HashMap<String, Integer> result1 = HashMapExercise.countWords(words1);
        runTest("countWords が単語出現回数を正しく数えること",
                result1 != null && result1.equals(expected1));

        // テスト2: 重複のない配列
        String[] words2 = { "赤", "青", "緑" };

        HashMap<String, Integer> expected2 = new HashMap<>();
        expected2.put("赤", 1);
        expected2.put("青", 1);
        expected2.put("緑", 1);

        HashMap<String, Integer> result2 = HashMapExercise.countWords(words2);
        runTest("countWords が重複のない配列を正しく処理すること",
                result2 != null && result2.equals(expected2));

        // テスト3: 空の配列
        String[] words3 = {};

        HashMap<String, Integer> expected3 = new HashMap<>();
        HashMap<String, Integer> result3 = HashMapExercise.countWords(words3);
        runTest("countWords が空の配列を正しく処理すること",
                result3 != null && result3.equals(expected3));
    }

    /**
     * findKeysByValue メソッドのテスト
     */
    private static void testFindKeysByValue() {
        System.out.println("\n----- findKeysByValue のテスト -----");

        // テスト用のマップ作成
        HashMap<String, Integer> map = new HashMap<>();
        map.put("りんご", 5);
        map.put("バナナ", 3);
        map.put("オレンジ", 5);
        map.put("ぶどう", 2);
        map.put("メロン", 5);

        // テスト1: 存在する値で検索
        ArrayList<String> result1 = HashMapExercise.findKeysByValue(map, 5);
        HashSet<String> expected1 = new HashSet<>(Arrays.asList("りんご", "オレンジ", "メロン"));
        runTest("findKeysByValue が値5を持つすべてのキーを返すこと",
                result1 != null && new HashSet<>(result1).equals(expected1));

        // テスト2: 一つだけマッチする値で検索
        ArrayList<String> result2 = HashMapExercise.findKeysByValue(map, 2);
        HashSet<String> expected2 = new HashSet<>(Arrays.asList("ぶどう"));
        runTest("findKeysByValue が値2を持つキーを返すこと",
                result2 != null && new HashSet<>(result2).equals(expected2));

        // テスト3: 存在しない値で検索
        ArrayList<String> result3 = HashMapExercise.findKeysByValue(map, 10);
        runTest("findKeysByValue が存在しない値の場合に空のリストを返すこと",
                result3 != null && result3.isEmpty());

        // テスト4: 空のマップで検索
        HashMap<String, Integer> emptyMap = new HashMap<>();
        ArrayList<String> result4 = HashMapExercise.findKeysByValue(emptyMap, 5);
        runTest("findKeysByValue が空のマップの場合に空のリストを返すこと",
                result4 != null && result4.isEmpty());
    }

    /**
     * removeEntriesBelowThreshold メソッドのテスト
     */
    private static void testRemoveEntriesBelowThreshold() {
        System.out.println("\n----- removeEntriesBelowThreshold のテスト -----");

        // テスト1: 閾値以下の要素を削除
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Alice", 85);
        map1.put("Bob", 62);
        map1.put("Charlie", 90);
        map1.put("David", 55);
        map1.put("Eve", 71);

        HashMap<String, Integer> expected1 = new HashMap<>();
        expected1.put("Alice", 85);
        expected1.put("Charlie", 90);
        expected1.put("Eve", 71);

        HashMapExercise.removeEntriesBelowThreshold(map1, 70);
        runTest("removeEntriesBelowThreshold が閾値70未満のエントリーを削除すること",
                map1.equals(expected1));

        // テスト2: すべての要素が閾値以上
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("A", 100);
        map2.put("B", 90);
        map2.put("C", 80);

        HashMap<String, Integer> expected2 = new HashMap<>(map2); // 元のマップのコピー

        HashMapExercise.removeEntriesBelowThreshold(map2, 80);
        runTest("removeEntriesBelowThreshold ですべての要素が閾値以上の場合、何も削除しないこと",
                map2.equals(expected2));

        // テスト3: すべての要素が閾値未満
        HashMap<String, Integer> map3 = new HashMap<>();
        map3.put("X", 30);
        map3.put("Y", 20);
        map3.put("Z", 10);

        HashMap<String, Integer> expected3 = new HashMap<>(); // 空のマップ

        HashMapExercise.removeEntriesBelowThreshold(map3, 50);
        runTest("removeEntriesBelowThreshold ですべての要素が閾値未満の場合、すべて削除すること",
                map3.equals(expected3));
    }

    /**
     * calculateValueSum メソッドのテスト
     */
    private static void testCalculateValueSum() {
        System.out.println("\n----- calculateValueSum のテスト -----");

        // テスト1: 通常のマップ
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("りんご", 5);
        map1.put("バナナ", 3);
        map1.put("オレンジ", 2);

        runTest("calculateValueSum が合計を正しく計算すること",
                HashMapExercise.calculateValueSum(map1) == 10);

        // テスト2: 負の値を含むマップ
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("A", 10);
        map2.put("B", -5);
        map2.put("C", 2);

        runTest("calculateValueSum が負の値を含むマップを正しく処理すること",
                HashMapExercise.calculateValueSum(map2) == 7);

        // テスト3: 空のマップ
        HashMap<String, Integer> map3 = new HashMap<>();

        runTest("calculateValueSum が空のマップを正しく処理すること",
                HashMapExercise.calculateValueSum(map3) == 0);
    }

    /**
     * findKeyWithMaxValue メソッドのテスト
     */
    private static void testFindKeyWithMaxValue() {
        System.out.println("\n----- findKeyWithMaxValue のテスト -----");

        // テスト1: 通常のマップ
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("パソコン", 80000);
        map1.put("スマートフォン", 60000);
        map1.put("タブレット", 40000);

        runTest("findKeyWithMaxValue が最大値を持つキーを返すこと",
                "パソコン".equals(HashMapExercise.findKeyWithMaxValue(map1)));

        // テスト2: 最大値が複数ある場合（いずれか一つを返せばよい）
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("A", 100);
        map2.put("B", 100);
        map2.put("C", 50);

        String result2 = HashMapExercise.findKeyWithMaxValue(map2);
        runTest("findKeyWithMaxValue が最大値が複数ある場合にいずれかを返すこと",
                "A".equals(result2) || "B".equals(result2));

        // テスト3: 空のマップ
        HashMap<String, Integer> map3 = new HashMap<>();

        runTest("findKeyWithMaxValue が空のマップの場合にnullを返すこと",
                HashMapExercise.findKeyWithMaxValue(map3) == null);

        // テスト4: 負の値を含むマップ
        HashMap<String, Integer> map4 = new HashMap<>();
        map4.put("X", -10);
        map4.put("Y", -5);
        map4.put("Z", -20);

        runTest("findKeyWithMaxValue が負の値を含むマップを正しく処理すること",
                "Y".equals(HashMapExercise.findKeyWithMaxValue(map4)));
    }

    // テストヘルパー変数
    private static int totalTests = 0;
    private static int passedTests = 0;

    /**
     * テストを実行し、結果を出力します
     * 
     * @param testName テストの名前
     * @param result   テストの結果（true：成功、false：失敗）
     */
    private static void runTest(String testName, boolean result) {
        totalTests++;
        if (result) {
            passedTests++;
            System.out.println("✅ テスト成功: " + testName);
        } else {
            System.out.println("❌ テスト失敗: " + testName);
        }
    }
}
