/**
 * Calculatorクラスの使い方を示すプログラム
 */
public class CalculatorTest {
    public static void main(String[] args) {
        // Calculatorオブジェクトの作成
        Calculator calc = new Calculator();
        
        // 各メソッドの呼び出しと結果の表示
        int sum = calc.add(10, 5);
        calc.showResult("足し算", sum);
        
        int difference = calc.subtract(10, 5);
        calc.showResult("引き算", difference);
        
        int product = calc.multiply(10, 5);
        calc.showResult("掛け算", product);
        
        double quotient = calc.divide(10, 5);
        calc.showResult("割り算", quotient);
        
        // ゼロで割る場合
        calc.divide(10, 0);
        
        // 円の面積を計算
        double radius = 5.0;
        double area = calc.calculateCircleArea(radius);
        System.out.println("半径" + radius + "の円の面積: " + area);
    }
}
