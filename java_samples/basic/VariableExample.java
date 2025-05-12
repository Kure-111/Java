/**
 * 変数の基本的な使い方を示すプログラム
 */
public class VariableExample {
    public static void main(String[] args) {
        // 変数の宣言と初期化
        int age = 20;
        double height = 175.5;
        char grade = 'A';
        boolean isStudent = true;
        
        // 変数の値を表示
        System.out.println("年齢: " + age + "歳");
        System.out.println("身長: " + height + "cm");
        System.out.println("成績: " + grade);
        System.out.println("学生ですか？: " + isStudent);
        
        // 変数の値を変更
        age = 21;
        height = 176.2;
        
        // 変更後の値を表示
        System.out.println("\n=== 1年後 ===");
        System.out.println("年齢: " + age + "歳");
        System.out.println("身長: " + height + "cm");
        
        // 変数を使った計算
        int birthYear = 2025 - age;
        System.out.println("生まれ年（おおよそ）: " + birthYear + "年");
        
        // 様々なデータ型の例
        byte small = 127;                      // 8ビット整数
        short medium = 32767;                  // 16ビット整数
        long large = 9223372036854775807L;     // 64ビット整数（Lを付ける）
        float price = 19.99f;                  // 32ビット浮動小数点（fを付ける）
        
        System.out.println("\n=== 様々なデータ型 ===");
        System.out.println("byte型: " + small);
        System.out.println("short型: " + medium);
        System.out.println("long型: " + large);
        System.out.println("float型: " + price);
    }
}
