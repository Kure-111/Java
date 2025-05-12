import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * ArrayList演習のテスト
 * 
 * このテストファイルは ArrayListExercise クラスの機能をテストします。
 */
public class ArrayListExerciseTest {

    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("ArrayList演習のテスト");
        System.out.println("===================================");

        testCreateIntegerList();
        testCreateStringList();
        testFilterEvenNumbers();
        testRemoveDuplicates();
        testCalculateSum();

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
     * createIntegerList メソッドのテスト
     */
    private static void testCreateIntegerList() {
        System.out.println("\n----- createIntegerList のテスト -----");

        // テスト1: 5要素のリスト作成
        ArrayList<Integer> expected1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> result1 = ArrayListExercise.createIntegerList(5);
        runTest("createIntegerList(5) が正しいリストを返すこと",
                result1 != null && result1.equals(expected1));

        // テスト2: 1要素のリスト作成
        ArrayList<Integer> expected2 = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> result2 = ArrayListExercise.createIntegerList(1);
        runTest("createIntegerList(1) が正しいリストを返すこと",
                result2 != null && result2.equals(expected2));

        // テスト3: 0要素のリスト作成
        ArrayList<Integer> expected3 = new ArrayList<>();
        ArrayList<Integer> result3 = ArrayListExercise.createIntegerList(0);
        runTest("createIntegerList(0) が空のリストを返すこと",
                result3 != null && result3.equals(expected3));
    }

    /**
     * createStringList メソッドのテスト
     */
    private static void testCreateStringList() {
        System.out.println("\n----- createStringList のテスト -----");

        // テスト1: 通常の配列
        String[] array1 = { "りんご", "バナナ", "オレンジ" };
        ArrayList<String> expected1 = new ArrayList<>(Arrays.asList("りんご", "バナナ", "オレンジ"));
        ArrayList<String> result1 = ArrayListExercise.createStringList(array1);
        runTest("createStringList が正しいリストを返すこと",
                result1 != null && result1.equals(expected1));

        // テスト2: 空の配列
        String[] array2 = {};
        ArrayList<String> expected2 = new ArrayList<>();
        ArrayList<String> result2 = ArrayListExercise.createStringList(array2);
        runTest("createStringList が空の配列を正しく処理すること",
                result2 != null && result2.equals(expected2));

        // テスト3: nullを含む配列
        String[] array3 = { "テスト", null, "データ" };
        ArrayList<String> expected3 = new ArrayList<>(Arrays.asList("テスト", null, "データ"));
        ArrayList<String> result3 = ArrayListExercise.createStringList(array3);
        runTest("createStringList がnullを含む配列を正しく処理すること",
                result3 != null && result3.equals(expected3));
    }

    /**
     * filterEvenNumbers メソッドのテスト
     */
    private static void testFilterEvenNumbers() {
        System.out.println("\n----- filterEvenNumbers のテスト -----");

        // テスト1: 混合リスト
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> expected1 = new ArrayList<>(Arrays.asList(2, 4, 6));
        ArrayList<Integer> result1 = ArrayListExercise.filterEvenNumbers(list1);
        runTest("filterEvenNumbers が偶数のみを正しく抽出すること",
                result1 != null && result1.equals(expected1));

        // テスト2: すべて偶数のリスト
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        ArrayList<Integer> expected2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
        ArrayList<Integer> result2 = ArrayListExercise.filterEvenNumbers(list2);
        runTest("filterEvenNumbers がすべて偶数のリストを正しく処理すること",
                result2 != null && result2.equals(expected2));

        // テスト3: すべて奇数のリスト
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        ArrayList<Integer> expected3 = new ArrayList<>();
        ArrayList<Integer> result3 = ArrayListExercise.filterEvenNumbers(list3);
        runTest("filterEvenNumbers がすべて奇数のリストを正しく処理すること",
                result3 != null && result3.equals(expected3));

        // テスト4: 空のリスト
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> expected4 = new ArrayList<>();
        ArrayList<Integer> result4 = ArrayListExercise.filterEvenNumbers(list4);
        runTest("filterEvenNumbers が空のリストを正しく処理すること",
                result4 != null && result4.equals(expected4));
    }

    /**
     * removeDuplicates メソッドのテスト
     */
    private static void testRemoveDuplicates() {
        System.out.println("\n----- removeDuplicates のテスト -----");

        // テスト1: 重複を含むリスト
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 1, 5));
        ArrayList<Integer> expected1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> result1 = ArrayListExercise.removeDuplicates(list1);
        runTest("removeDuplicates が重複を正しく削除すること",
                result1 != null && hasSameElements(result1, expected1));

        // テスト2: 重複のないリスト
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> expected2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> result2 = ArrayListExercise.removeDuplicates(list2);
        runTest("removeDuplicates が重複のないリストを正しく処理すること",
                result2 != null && hasSameElements(result2, expected2));

        // テスト3: 空のリスト
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> expected3 = new ArrayList<>();
        ArrayList<Integer> result3 = ArrayListExercise.removeDuplicates(list3);
        runTest("removeDuplicates が空のリストを正しく処理すること",
                result3 != null && result3.equals(expected3));
    }

    /**
     * calculateSum メソッドのテスト
     */
    private static void testCalculateSum() {
        System.out.println("\n----- calculateSum のテスト -----");

        // テスト1: 通常のリスト
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        runTest("calculateSum が合計を正しく計算すること",
                ArrayListExercise.calculateSum(list1) == 15);

        // テスト2: 負の数を含むリスト
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(-1, 2, -3, 4));
        runTest("calculateSum が負の数を含むリストを正しく処理すること",
                ArrayListExercise.calculateSum(list2) == 2);

        // テスト3: 空のリスト
        ArrayList<Integer> list3 = new ArrayList<>();
        runTest("calculateSum が空のリストを正しく処理すること",
                ArrayListExercise.calculateSum(list3) == 0);
    }

    /**
     * 2つのArrayListが同じ要素を含むかチェック（順序は関係なし）
     */
    private static boolean hasSameElements(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1 == null || list2 == null || list1.size() != list2.size()) {
            return false;
        }

        HashSet<Integer> set1 = new HashSet<>(list1);
        HashSet<Integer> set2 = new HashSet<>(list2);

        return set1.equals(set2);
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
