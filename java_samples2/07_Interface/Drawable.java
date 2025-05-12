/**
 * インターフェースの例（描画可能オブジェクト）
 */
public interface Drawable {
    // 描画するメソッド（抽象メソッド - 実装なし）
    void draw();

    // 図形のタイプを取得するメソッド（抽象メソッド - 実装なし）
    String getType();
}
