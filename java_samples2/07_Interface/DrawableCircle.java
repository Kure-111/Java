/**
 * インターフェース実装の例（描画可能な円）
 */
public class DrawableCircle implements Drawable {
    private double radius;

    // コンストラクタ
    public DrawableCircle(double radius) {
        this.radius = radius;
    }

    // Drawableインターフェースのメソッドを実装
    @Override
    public void draw() {
        System.out.println("○を描画します");
    }

    @Override
    public String getType() {
        return "円";
    }

    // 半径の取得メソッド
    public double getRadius() {
        return radius;
    }
}