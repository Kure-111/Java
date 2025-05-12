/**
 * for文の基本と応用を示すプログラム
 */
public class ForLoopExample {
    public static void main(String[] args) {
        // 基本的なfor文
        System.out.println("===== 基本的なfor文 =====");
        for (int i = 1; i <= 5; i++) {
            System.out.println("カウント: " + i);
        }
        
        // 合計を計算するfor文
        System.out.println("\n===== 合計を計算するfor文 =====");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;  // sum = sum + i と同じ
        }
        System.out.println("1から10までの合計: " + sum);
        
        // 偶数のみを処理するfor文
        System.out.println("\n===== 偶数のみを処理するfor文 =====");
        System.out.println("1から10までの偶数:");
        for (int i = 2; i <= 10; i += 2) {  // 2から始めて2ずつ増やす
            System.out.println(i);
        }
        
        // 奇数のみを処理するfor文
        System.out.println("\n===== 奇数のみを処理するfor文 =====");
        System.out.println("1から10までの奇数:");
        for (int i = 1; i <= 10; i += 2) {  // 1から始めて2ずつ増やす
            System.out.println(i);
        }
        
        // カウントダウンのfor文
        System.out.println("\n===== カウントダウンのfor文 =====");
        for (int i = 5; i >= 1; i--) {  // 5から始めて1ずつ減らす
            System.out.println("カウントダウン: " + i);
        }
        System.out.println("スタート！");
        
        // 配列を処理するfor文
        System.out.println("\n===== 配列を処理するfor文 =====");
        String[] fruits = {"りんご", "バナナ", "オレンジ", "ぶどう", "メロン"};
        System.out.println("果物リスト:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println((i + 1) + ". " + fruits[i]);
        }
    }
}
