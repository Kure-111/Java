/**
 * 配列の基本的な使い方を示す例
 */
public class ArrayExample {
    public static void main(String[] args) {
        // 配列の宣言と初期化
        int[] scores = {85, 90, 75, 95, 80};
        String[] names = {"田中", "鈴木", "佐藤", "高橋", "渡辺"};
        
        // 要素へのアクセスと変更
        System.out.println("1番目の点数: " + scores[0]);  // 85
        scores[1] = 92;
        System.out.println("更新後の2番目の点数: " + scores[1]);  // 92
        
        // 配列の繰り返し処理（for文）
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "番目の学生の点数: " + scores[i]);
        }
        
        // 配列の繰り返し処理（拡張for文）
        for (int score : scores) {
            System.out.println("点数: " + score);
        }
        
        // 多次元配列
        int[][] multiplicationTable = {
            {1, 2, 3},  // 1の段
            {2, 4, 6},  // 2の段
            {3, 6, 9}   // 3の段
        };
        
        // 多次元配列の処理
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                System.out.print(multiplicationTable[i][j] + " ");
            }
            System.out.println();
        }
    }
}
