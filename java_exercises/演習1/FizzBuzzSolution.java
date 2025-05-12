
import java.util.Scanner;

/**
 * FizzBuzz プログラム - 解答例
 * 
 * このファイルは参考用の解答例です。
 * まずは自分自身で実装を試みることをお勧めします。
 */
public class FizzBuzzSolution {

    /**
     * 数値に FizzBuzz のルールを適用した結果を返します
     * 
     * @param number FizzBuzz を適用する数値
     * @return FizzBuzz のルールを適用した結果
     */
    public static String applyFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }

    /**
     * 1から指定された数値までの範囲に FizzBuzz を適用し、結果を出力します
     * 
     * @param endNumber 終了する数値
     */
    public static void printFizzBuzz(int endNumber) {
        for (int i = 1; i <= endNumber; i++) {
            System.out.println(applyFizzBuzz(i));
        }
    }

    /**
     * メインメソッド：ユーザーから入力を受け取り、FizzBuzz を実行します
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("数値を入力してください: ");
        int number = scanner.nextInt();

        System.out.println("1 から " + number + " までの FizzBuzz:");
        printFizzBuzz(number);

        scanner.close();
    }
}
