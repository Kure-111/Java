/**
 * breakとcontinue文の例を示すプログラム
 */
public class BreakContinueExample {
    public static void main(String[] args) {
        // break文の例
        System.out.println("===== break文の例 =====");
        for (int i = 1; i <= 10; i++) {
            System.out.println("現在の数: " + i);
            if (i == 5) {
                System.out.println("5になったのでループを終了します");
                break;  // ループを終了
            }
        }
        System.out.println("ループ終了後の処理");
        
        // continue文の例
        System.out.println("\n===== continue文の例 =====");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {  // iが奇数の場合
                continue;  // 次の周回に進む
            }
            System.out.println("偶数: " + i);
        }
        
        // while文でのbreak
        System.out.println("\n===== whileでのbreak =====");
        int count = 1;
        while (true) {  // 無限ループ
            System.out.println("カウント: " + count);
            if (count >= 5) {
                System.out.println("5に達したので終了します");
                break;  // 無限ループを終了
            }
            count++;
        }
        
        // while文でのcontinue
        System.out.println("\n===== whileでのcontinue =====");
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 3 != 0) {  // 3の倍数でない場合
                continue;  // 次の周回に進む
            }
            System.out.println("3の倍数: " + i);
        }
        
        // ネストしたループでのbreak
        System.out.println("\n===== ネストしたループでのbreak =====");
        outerLoop: for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.println("行: " + row + ", 列: " + col);
                if (row == 2 && col == 2) {
                    System.out.println("特定の条件を満たしたのでループを終了します");
                    break outerLoop;  // 外側のループを含めて終了
                }
            }
        }
    }
}
