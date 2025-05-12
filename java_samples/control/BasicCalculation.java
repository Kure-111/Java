/**
 * 基本的な演算の例を示すプログラム
 */
public class BasicCalculation {
    public static void main(String[] args) {
        // 変数の宣言と初期化
        int a = 10;
        int b = 3;
        
        // 基本的な算術演算
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        
        System.out.println("===== 基本的な算術演算 =====");
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + difference);
        System.out.println(a + " * " + b + " = " + product);
        System.out.println(a + " / " + b + " = " + quotient);
        System.out.println(a + " % " + b + " = " + remainder);
        
        // 小数点の計算
        double x = 10.0;
        double y = 3.0;
        double result = x / y;
        System.out.println("\n===== 小数点の計算 =====");
        System.out.println(x + " / " + y + " = " + result);
        
        // 複合代入演算子
        int c = 5;
        System.out.println("\n===== 複合代入演算子 =====");
        System.out.println("最初のc: " + c);
        
        c += 3; // c = c + 3と同じ
        System.out.println("c += 3の後: " + c);
        
        c -= 2; // c = c - 2と同じ
        System.out.println("c -= 2の後: " + c);
        
        c *= 4; // c = c * 4と同じ
        System.out.println("c *= 4の後: " + c);
        
        c /= 3; // c = c / 3と同じ
        System.out.println("c /= 3の後: " + c);
        
        // インクリメント/デクリメント演算子
        int i = 5;
        System.out.println("\n===== インクリメント/デクリメント =====");
        System.out.println("i: " + i);
        
        i++; // iを1増加（後置）
        System.out.println("i++後: " + i);
        
        ++i; // iを1増加（前置）
        System.out.println("++i後: " + i);
        
        i--; // iを1減少（後置）
        System.out.println("i--後: " + i);
        
        --i; // iを1減少（前置）
        System.out.println("--i後: " + i);
    }
}
