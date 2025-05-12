/**
 * ポリモーフィズムの例として使用する子クラス（Rectangle）
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    // コンストラクタ
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Shape.drawメソッドをオーバーライド
    @Override
    public void draw() {
        System.out.println("長方形を描画します");
    }

    // Shape.getAreaメソッドをオーバーライド
    @Override
    public double getArea() {
        return width * height;
    }
}
