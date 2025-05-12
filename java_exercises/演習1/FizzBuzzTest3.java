
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * FizzBuzz のテスト3: メインメソッドのテスト
 * 
 * このテストファイルは FizzBuzz クラスのメインメソッド（ユーザー入力処理）をテストします。
 */
public class FizzBuzzTest3 {

    public static void main(String[] args) {
        System.out.println("===============================");
        System.out.println("テスト3: メインメソッドのテスト");
        System.out.println("===============================");

        // テスト3: main メソッドのテスト
        // 標準入出力をキャプチャ
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;

        try {
            // ユーザー入力をシミュレート（数値「5」を入力）
            ByteArrayInputStream inContent = new ByteArrayInputStream("5\n".getBytes());
            System.setIn(inContent);
            System.setOut(new PrintStream(outContent));

            // main メソッドを実行
            FizzBuzz.main(new String[0]);

            // 出力を確認（入力プロンプトも含まれる）
            String output = outContent.toString();

            System.setOut(originalOut);
            System.setIn(originalIn);

            System.out.println("テスト入力: 5");
            System.out.println("プログラムの出力（プロンプトと結果を含む）:");
            System.out.println(output);

            // 出力に "1", "2", "Fizz", "4", "Buzz" が含まれているか確認
            boolean containsExpectedOutput = output.contains("1") &&
                    output.contains("2") &&
                    output.contains("Fizz") &&
                    output.contains("4") &&
                    output.contains("Buzz");

            runTest("main メソッドが正しく動作し、FizzBuzz の結果を出力すること", containsExpectedOutput);

        } catch (Exception e) {
            System.setOut(originalOut);
            System.setIn(originalIn);
            System.out.println("❌ テスト失敗: 例外が発生しました: " + e.getMessage());
            e.printStackTrace();
        }

        // メイン実行のための説明
        System.out.println("\n手動テスト方法:");
        System.out.println("FizzBuzz クラスを直接実行し、プロンプトが表示されたら数値（例: 20）を入力します。");
        System.out.println("1 から入力した数値までの FizzBuzz 結果が表示されるはずです。");

        // 最終結果の出力
        System.out.println("\n--- テスト結果の概要 ---");
        System.out.println("合計テスト数: " + totalTests);
        System.out.println("成功: " + passedTests);
        System.out.println("失敗: " + (totalTests - passedTests));

        if (passedTests == totalTests) {
            System.out.println("\n🎉 おめでとうございます！すべてのテストに合格しました！");
            System.out.println("FizzBuzz の課題を完了しました。素晴らしい！");
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
