/**
 * ポリモーフィズムの例として使用する親クラス（Shape）
 */
public class Shape {
    // 図形を描画するメソッド
    public void draw() {
        System.out.println("図形を描画します");
    }

    // 図形の面積を返すメソッド
    public double getArea() {
        return 0.0; // 基本実装
    }
}
