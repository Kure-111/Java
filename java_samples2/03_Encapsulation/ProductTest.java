/**
 * Productクラスを使ったカプセル化のテスト例
 */
public class ProductTest {
    public static void main(String[] args) {
        // 商品オブジェクトの作成
        Product laptop = new Product("ノートパソコン", 80000, 10);

        // 商品情報の表示
        System.out.println("---- 商品情報 ----");
        laptop.displayInfo();

        // 商品の販売
        System.out.println("\n---- 商品販売テスト ----");
        laptop.sell(3);

        // 更新された商品情報
        System.out.println("\n---- 販売後の商品情報 ----");
        laptop.displayInfo();

        // 商品の補充
        System.out.println("\n---- 商品補充テスト ----");
        laptop.restock(5);

        // 更新された商品情報
        System.out.println("\n---- 補充後の商品情報 ----");
        laptop.displayInfo();

        // 無効な操作のテスト
        System.out.println("\n---- 無効な操作テスト ----");
        laptop.setPrice(-1000); // エラーメッセージが表示される
        laptop.sell(15); // 在庫不足のエラーメッセージが表示される
    }
}