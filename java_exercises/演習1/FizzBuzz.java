
/**
 * FizzBuzz プログラム
 * 
 * このプログラムは FizzBuzz のルールを実装し、1から入力された数値までに適用します。
 * 
 * FizzBuzzのルール：
 * - 3の倍数の場合は "Fizz" を出力
 * - 5の倍数の場合は "Buzz" を出力
 * - 3と5の両方の倍数の場合は "FizzBuzz" を出力
 * - それ以外の場合は数値をそのまま出力
 */
public class FizzBuzz {

    /**
     * 数値に FizzBuzz のルールを適用した結果を返します
     * 
     * @param number FizzBuzz を適用する数値
     * @return FizzBuzz のルールを適用した結果（"Fizz", "Buzz", "FizzBuzz", または数値の文字列）
     */
    public static String applyFizzBuzz(int number) {
        // TODO: FizzBuzz のロジックを実装
        // ヒント: 剰余演算子 (%) を使って、数値が3や5で割り切れるかどうかを確認します

        return ""; // 実装したロジックを返すように修正してください
    }

    /**
     * 1から指定された数値までの範囲に FizzBuzz を適用し、結果を出力します
     * 
     * @param endNumber 終了する数値
     */
    public static void printFizzBuzz(int endNumber) {
        // TODO: 1から endNumber までの範囲に FizzBuzz を適用し、結果を出力する
        // ヒント: ループを使って各数値に applyFizzBuzz を適用し、結果を出力します
    }

    /**
     * メインメソッド：ユーザーから入力を受け取り、FizzBuzz を実行します
     */
    public static void main(String[] args) {
        // TODO: Scanner を使ってユーザーから入力を受け取り、FizzBuzz を実行する
        // ヒント: Scanner オブジェクトを作成し、ユーザーに数値の入力を促します
    }
}
