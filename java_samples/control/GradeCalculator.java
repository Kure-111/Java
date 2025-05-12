import java.util.Scanner;

/**
 * 成績計算プログラム - 条件分岐の実践例
 */
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 点数の入力
        System.out.print("テストの点数を入力してください（0-100）: ");
        int score = scanner.nextInt();
        
        // 点数の範囲チェック
        if (score < 0 || score > 100) {
            System.out.println("エラー: 点数は0から100の範囲で入力してください。");
        } else {
            // 成績判定
            String grade;
            
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            
            // 結果の表示
            System.out.println("点数: " + score);
            System.out.println("成績: " + grade);
            
            // 合格/不合格の判定
            if (score >= 60) {
                System.out.println("合格です！おめでとうございます。");
            } else {
                System.out.println("不合格です。もう少し頑張りましょう。");
                
                // 追加情報
                int pointsNeeded = 60 - score;
                System.out.println("合格まであと" + pointsNeeded + "点必要です。");
            }
            
            // コメント
            switch (grade) {
                case "A":
                    System.out.println("素晴らしい成績です！");
                    break;
                case "B":
                    System.out.println("よくできました！");
                    break;
                case "C":
                    System.out.println("まずまずの成績です。");
                    break;
                case "D":
                    System.out.println("合格ラインですが、もう少し頑張りましょう。");
                    break;
                case "F":
                    System.out.println("次回に向けて復習しましょう。");
                    break;
            }
        }
        
        scanner.close();
    }
}