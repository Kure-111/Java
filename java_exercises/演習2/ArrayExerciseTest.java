import java.util.Arrays;

/**
 * 配列演習のテスト
 * 
 * このテストファイルは ArrayExercise クラスの機能をテストします。
 */
public class ArrayExerciseTest {

    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("配列演習のテスト");
        System.out.println("===================================");

        testCreateArray();
        testDoubleArrayValues();
        testCountEvenNumbers();
        testCalculateSum();
        testFindMax();

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
     * createArray メソッドのテスト
     */
    private static void testCreateArray() {
        System.out.println("\n----- createArray のテスト -----");

        // テスト1: サイズ5, 初期値10の配列作成
        int[] expected1 = { 10, 10, 10, 10, 10 };
        int[] result1 = ArrayExercise.createArray(5, 10);
        runTest("createArray(5, 10) が正しい配列を返すこと",
                result1 != null && Arrays.equals(result1, expected1));

        // テスト2: サイズ3, 初期値0の配列作成
        int[] expected2 = { 0, 0, 0 };
        int[] result2 = ArrayExercise.createArray(3, 0);
        runTest("createArray(3, 0) が正しい配列を返すこと",
                result2 != null && Arrays.equals(result2, expected2));

        // テスト3: サイズ0の配列作成
        int[] expected3 = {};
        int[] result3 = ArrayExercise.createArray(0, 42);
        runTest("createArray(0, 42) が空の配列を返すこと",
                result3 != null && Arrays.equals(result3, expected3));
    }

    /**
     * doubleArrayValues メソッドのテスト
     */
    private static void testDoubleArrayValues() {
        System.out.println("\n----- doubleArrayValues のテスト -----");

        // テスト1: 通常の配列
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] expected1 = { 2, 4, 6, 8, 10 };
        ArrayExercise.doubleArrayValues(array1);
        runTest("doubleArrayValues が各要素を2倍にすること",
                Arrays.equals(array1, expected1));

        // テスト2: 0を含む配列
        int[] array2 = { 0, 10, 0, 5 };
        int[] expected2 = { 0, 20, 0, 10 };
        ArrayExercise.doubleArrayValues(array2);
        runTest("doubleArrayValues が0を含む配列を正しく処理すること",
                Arrays.equals(array2, expected2));

        // テスト3: 空の配列
        int[] array3 = {};
        int[] expected3 = {};
        ArrayExercise.doubleArrayValues(array3);
        runTest("doubleArrayValues が空の配列を正しく処理すること",
                Arrays.equals(array3, expected3));
    }

    /**
     * countEvenNumbers メソッドのテスト
     */
    private static void testCountEvenNumbers() {
        System.out.println("\n----- countEvenNumbers のテスト -----");

        // テスト1: 偶数と奇数が混在する配列
        int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        runTest("countEvenNumbers が偶数の個数を正しく数えること",
                ArrayExercise.countEvenNumbers(array1) == 4);

        // テスト2: すべて偶数の配列
        int[] array2 = { 2, 4, 6, 8, 10 };
        runTest("countEvenNumbers がすべて偶数の配列を正しく処理すること",
                ArrayExercise.countEvenNumbers(array2) == 5);

        // テスト3: すべて奇数の配列
        int[] array3 = { 1, 3, 5, 7, 9 };
        runTest("countEvenNumbers がすべて奇数の配列を正しく処理すること",
                ArrayExercise.countEvenNumbers(array3) == 0);

        // テスト4: 空の配列
        int[] array4 = {};
        runTest("countEvenNumbers が空の配列を正しく処理すること",
                ArrayExercise.countEvenNumbers(array4) == 0);
    }

    /**
     * calculateSum メソッドのテスト
     */
    private static void testCalculateSum() {
        System.out.println("\n----- calculateSum のテスト -----");

        // テスト1: 通常の配列
        int[] array1 = { 1, 2, 3, 4, 5 };
        runTest("calculateSum が合計を正しく計算すること",
                ArrayExercise.calculateSum(array1) == 15);

        // テスト2: 負の数を含む配列
        int[] array2 = { -1, 2, -3, 4 };
        runTest("calculateSum が負の数を含む配列を正しく処理すること",
                ArrayExercise.calculateSum(array2) == 2);

        // テスト3: 空の配列
        int[] array3 = {};
        runTest("calculateSum が空の配列を正しく処理すること",
                ArrayExercise.calculateSum(array3) == 0);
    }

    /**
     * findMax メソッドのテスト
     */
    private static void testFindMax() {
        System.out.println("\n----- findMax のテスト -----");

        // テスト1: 通常の配列
        int[] array1 = { 5, 8, 2, 10, 3, 1, 7 };
        int[] expected1 = { 10, 3 }; // 最大値とそのインデックス
        int[] result1 = ArrayExercise.findMax(array1);
        runTest("findMax が最大値とインデックスを正しく見つけること",
                result1 != null && Arrays.equals(result1, expected1));

        // テスト2: 最大値が複数ある場合（最初に見つかったものを返すべき）
        int[] array2 = { 3, 8, 2, 8, 5 };
        int[] expected2 = { 8, 1 }; // 最初に見つかった8のインデックスは1
        int[] result2 = ArrayExercise.findMax(array2);
        runTest("findMax が複数の最大値がある場合に最初のものを返すこと",
                result2 != null && Arrays.equals(result2, expected2));

        // テスト3: 1要素の配列
        int[] array3 = { 42 };
        int[] expected3 = { 42, 0 };
        int[] result3 = ArrayExercise.findMax(array3);
        runTest("findMax が1要素の配列を正しく処理すること",
                result3 != null && Arrays.equals(result3, expected3));

        // テスト4: 負の数を含む配列
        int[] array4 = { -5, -2, -10, -1 };
        int[] expected4 = { -1, 3 };
        int[] result4 = ArrayExercise.findMax(array4);
        runTest("findMax が負の数を含む配列を正しく処理すること",
                result4 != null && Arrays.equals(result4, expected4));
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
