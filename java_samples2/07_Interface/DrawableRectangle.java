/**
 * インターフェース実装の例（描画可能な長方形）
 */
public class DrawableRectangle implements Drawable {
    private double width;
    private double height;

    // コンストラクタ
    public DrawableRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Drawableインターフェースのメソッドを実装
    @Override
    public void draw() {
        System.out.println("□を描画します");
    }

    @Override
    public String getType() {
        return "長方形";
    }

    // 幅の取得メソッド
    public double getWidth() {
        return width;
    }

    // 高さの取得メソッド
    public double getHeight() {
        return height;
    }
}
