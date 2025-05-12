/**
 * ネストしたループの例を示すプログラム
 */
public class NestedLoopExample {
    public static void main(String[] args) {
        // 九九の表
        System.out.println("===== 九九の表 =====");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%2d x %2d = %2d  ", i, j, i * j);
            }
            System.out.println();  // 行の終わりに改行
        }
        
        // 長方形のパターン
        System.out.println("\n===== 長方形のパターン =====");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 10; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // 三角形のパターン
        System.out.println("\n===== 三角形のパターン =====");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // 逆三角形のパターン
        System.out.println("\n===== 逆三角形のパターン =====");
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        // 二次元配列の処理
        System.out.println("\n===== 二次元配列の処理 =====");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
