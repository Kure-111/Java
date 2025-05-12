
/**
 * FizzBuzz のテスト1: 基本的な FizzBuzz 機能のテスト
 * 
 * このテストファイルは FizzBuzz クラスの基本機能をテストします。
 */
public class FizzBuzzTest1 {

    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println("テスト1: 基本的な FizzBuzz のテスト");
        System.out.println("===============================");

        // テスト1: FizzBuzz のロジックのテスト
        runTest("applyFizzBuzz(1) が \"1\" を返すこと", FizzBuzz.applyFizzBuzz(1).equals("1"));
        runTest("applyFizzBuzz(2) が \"2\" を返すこと", FizzBuzz.applyFizzBuzz(2).equals("2"));
        runTest("applyFizzBuzz(3) が \"Fizz\" を返すこと", FizzBuzz.applyFizzBuzz(3).equals("Fizz"));
        runTest("applyFizzBuzz(5) が \"Buzz\" を返すこと", FizzBuzz.applyFizzBuzz(5).equals("Buzz"));
        runTest("applyFizzBuzz(6) が \"Fizz\" を返すこと (3の倍数)", FizzBuzz.applyFizzBuzz(6).equals("Fizz"));
        runTest("applyFizzBuzz(10) が \"Buzz\" を返すこと (5の倍数)", FizzBuzz.applyFizzBuzz(10).equals("Buzz"));
        runTest("applyFizzBuzz(15) が \"FizzBuzz\" を返すこと (3と5の倍数)", FizzBuzz.applyFizzBuzz(15).equals("FizzBuzz"));
        runTest("applyFizzBuzz(30) が \"FizzBuzz\" を返すこと (3と5の倍数)", FizzBuzz.applyFizzBuzz(30).equals("FizzBuzz"));

        // 最終結果の出力
        System.out.println("\n--- テスト結果の概要 ---");
        System.out.println("合計テスト数: " + totalTests);
        System.out.println("成功: " + passedTests);
        System.out.println("失敗: " + (totalTests - passedTests));

        if (passedTests == totalTests) {
            System.out.println("\n🎉 おめでとうございます！すべてのテストに合格しました！");
            System.out.println("次は FizzBuzzTest2.java を実行して、さらなるテストに挑戦してください。");
        } else {
            System.out.println("\n💡 すべてのテストに合格していません。失敗したテストを確認して修正してください。");
        }
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