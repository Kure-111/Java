/**
 * インターフェースの使用例とポリモーフィズムを示すテストクラス
 */
public class InterfaceTest {
    public static void main(String[] args) {
        // インターフェースを実装したオブジェクトの作成
        DrawableCircle circle = new DrawableCircle(5.0);
        DrawableRectangle rectangle = new DrawableRectangle(4.0, 6.0);

        // メソッドの直接呼び出し
        System.out.println("--- 直接メソッド呼び出し ---");
        System.out.println("円の種類: " + circle.getType());
        circle.draw();

        System.out.println("長方形の種類: " + rectangle.getType());
        rectangle.draw();

        System.out.println("\n--- インターフェースによるポリモーフィズム ---");

        // インターフェース型の配列
        Drawable[] drawables = { circle, rectangle };

        // 統一されたインターフェースを通じて処理
        for (Drawable d : drawables) {
            System.out.println(d.getType() + "を描画します");
            d.draw();
        }

        // インターフェースを引数にとるメソッドの例
        System.out.println("\n--- インターフェースを引数に取るメソッド ---");
        processDrawable(circle);
        processDrawable(rectangle);
    }

    // Drawableインターフェースを引数にとるメソッド
    public static void processDrawable(Drawable drawable) {
        System.out.println("処理対象: " + drawable.getType());
        drawable.draw();
    }
}