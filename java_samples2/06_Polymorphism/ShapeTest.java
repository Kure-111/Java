/**
 * 継承を使ったポリモーフィズムの例を示すテストクラス
 */
public class ShapeTest {
    public static void main(String[] args) {
        // 各図形のオブジェクトを作成
        Shape shape = new Shape();
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // 各クラスのdrawメソッドを直接呼び出す
        shape.draw(); // 図形を描画します
        circle.draw(); // 円を描画します
        rectangle.draw(); // 長方形を描画します

        // 各クラスのgetAreaメソッドを直接呼び出す
        System.out.println("基本図形の面積: " + shape.getArea());
        System.out.println("円の面積: " + circle.getArea());
        System.out.println("長方形の面積: " + rectangle.getArea());

        System.out.println("----------");

        // ポリモーフィズムを使用（親クラス型の配列に子クラスオブジェクトを格納）
        Shape[] shapes = new Shape[3];
        shapes[0] = shape; // 基本的な図形
        shapes[1] = circle; // 円（Shape型の変数に代入）
        shapes[2] = rectangle; // 長方形（Shape型の変数に代入）

        // 配列をループして各図形を描画し、面積を計算
        for (Shape s : shapes) {
            s.draw(); // 各図形のdrawメソッドが呼ばれる
            System.out.println("面積: " + s.getArea()); // 各図形のgetAreaメソッドが呼ばれる
            System.out.println();
        }
    }
}