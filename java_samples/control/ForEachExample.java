/**
 * 拡張for文の例を示すプログラム
 */
public class ForEachExample {
    public static void main(String[] args) {
        // 文字列の配列
        String[] fruits = {"りんご", "バナナ", "オレンジ", "ぶどう", "メロン"};
        
        // 通常のfor文で配列を処理
        System.out.println("===== 通常のfor文 =====");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("果物: " + fruits[i]);
        }
        
        // 拡張for文で配列を処理
        System.out.println("\n===== 拡張for文 =====");
        for (String fruit : fruits) {
            System.out.println("果物: " + fruit);
        }
        
        // 整数の配列と拡張for文
        System.out.println("\n===== 整数配列と拡張for文 =====");
        int[] numbers = {10, 20, 30, 40, 50};
        int total = 0;
        
        for (int number : numbers) {
            total += number;
            System.out.println("数値: " + number + ", 現在の合計: " + total);
        }
        
        System.out.println("最終合計: " + total);
        
        // 拡張for文の制限（インデックスが使えない）
        System.out.println("\n===== 拡張for文の制限 =====");
        System.out.println("通常のfor文では、インデックスを利用できます:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("インデックス " + i + ": " + fruits[i]);
        }
        
        System.out.println("\n拡張for文では、インデックスを直接扱えません:");
        int index = 0;
        for (String fruit : fruits) {
            System.out.println("インデックス " + index + ": " + fruit);
            index++;
        }
    }
}
