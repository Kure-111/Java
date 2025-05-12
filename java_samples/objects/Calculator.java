/**
 * 計算機能を提供するクラス
 */
public class Calculator {
    // 2つの数の合計を返すメソッド
    public int add(int a, int b) {
        return a + b;
    }

    // 2つの数の差を返すメソッド
    public int subtract(int a, int b) {
        return a - b;
    }

    // 2つの数の積を返すメソッド
    public int multiply(int a, int b) {
        return a * b;
    }

    // 2つの数の商を返すメソッド
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("エラー: ゼロで割ることはできません");
            return 0;
        }
        return a / b;
    }

    // 円の面積を計算するメソッド
    public double calculateCircleArea(double radius) {
        return 3.14 * radius * radius;
    }

    // 結果を表示するメソッド（戻り値なし）
    public void showResult(String operation, double result) {
        System.out.println(operation + "の結果: " + result);
    }
}
