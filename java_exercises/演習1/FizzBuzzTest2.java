
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * FizzBuzz のテスト2: 出力メソッドのテスト
 * 
 * このテストファイルは FizzBuzz クラスの出力機能をテストします。
 */
public class FizzBuzzTest2 {

    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println("テスト2: 出力メソッドのテスト");
        System.out.println("===============================");

        // テスト2: printFizzBuzz メソッドのテスト
        // 標準出力をキャプチャ
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // テスト1: printFizzBuzz(5) のテスト
        FizzBuzz.printFizzBuzz(5);

        // 標準出力を元に戻す
        System.setOut(originalOut);

        // 期待される出力
        String expected = "1\n2\nFizz\n4\nBuzz\n";
        String actual = outContent.toString();

        System.out.println("printFizzBuzz(5) の期待される出力:");
        System.out.println(expected);
        System.out.println("printFizzBuzz(5) の実際の出力:");
        System.out.println(actual);

        runTest("printFizzBuzz(5) が正しい出力を生成すること", actual.equals(expected));

        // テスト2: printFizzBuzz(15) のテスト
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        FizzBuzz.printFizzBuzz(15);

        System.setOut(originalOut);

        // 期待される出力（最初の5行と最後の3行のみ表示）
        String expected2 = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n";
        String actual2 = outContent.toString();

        System.out.println("\nprintFizzBuzz(15) の期待される出力（最初の5行と最後の3行のみ表示）:");
        String[] lines = expected2.split("\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(lines[i]);
        }
        System.out.println("...");
        for (int i = 12; i < 15; i++) {
            System.out.println(lines[i]);
        }

        runTest("printFizzBuzz(15) が正しい出力を生成すること", actual2.equals(expected2));

        // 最終結果の出力
        System.out.println("\n--- テスト結果の概要 ---");
        System.out.println("合計テスト数: " + totalTests);
        System.out.println("成功: " + passedTests);
        System.out.println("失敗: " + (totalTests - passedTests));

        if (passedTests == totalTests) {
            System.out.println("\n🎉 おめでとうございます！すべてのテストに合格しました！");
            System.out.println("次は FizzBuzzTest3.java を実行して、最後のテストに挑戦してください。");
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