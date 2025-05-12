/**
 * if文の例を示すプログラム
 */
public class IfElseExample {
    public static void main(String[] args) {
        // 単純なif文
        int age = 20;
        
        System.out.println("===== 単純なif文 =====");
        if (age >= 20) {
            System.out.println("成人です");
        }
        
        // if-else文
        age = 18;
        
        System.out.println("\n===== if-else文 =====");
        if (age >= 20) {
            System.out.println("成人です");
        } else {
            System.out.println("未成年です");
        }
        
        // if-else if-else文
        int score = 85;
        
        System.out.println("\n===== if-else if-else文 =====");
        if (score >= 90) {
            System.out.println("成績：A");
        } else if (score >= 80) {
            System.out.println("成績：B");
        } else if (score >= 70) {
            System.out.println("成績：C");
        } else if (score >= 60) {
            System.out.println("成績：D");
        } else {
            System.out.println("成績：F");
        }
        
        // 論理演算子を使用した条件
        int temperature = 28;
        boolean isRaining = false;
        
        System.out.println("\n===== 論理演算子 =====");
        
        // 論理AND (&&)
        if (temperature > 25 && !isRaining) {
            System.out.println("暑くて晴れた日です。水分をとりましょう。");
        }
        
        // 論理OR (||)
        if (temperature > 30 || isRaining) {
            System.out.println("外出に注意が必要です。");
        } else {
            System.out.println("過ごしやすい天気です。");
        }
        
        // 論理NOT (!)
        if (!isRaining) {
            System.out.println("傘は必要ありません。");
        }
        
        // 複雑な条件
        int time = 14;
        boolean isWeekend = true;
        
        if ((time >= 9 && time <= 17) || isWeekend) {
            System.out.println("遊びに行ける時間です。");
        } else {
            System.out.println("仕事や学校の時間です。");
        }
    }
}