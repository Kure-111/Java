/**
 * ポリモーフィズムの例として使用する子クラス（Circle）
 */
public class Circle extends Shape {
    private double radius;

    // コンストラクタ
    public Circle(double radius) {
        this.radius = radius;
    }

    // Shape.drawメソッドをオーバーライド
    @Override
    public void draw() {
        System.out.println("円を描画します");
    }

    // Shape.getAreaメソッドをオーバーライド
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
