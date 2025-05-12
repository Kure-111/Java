/**
 * カプセル化を示す商品クラスの例
 */
public class Product {
    private String name;
    private double price;
    private int stock;

    // コンストラクタ
    public Product(String name, double price, int stock) {
        this.name = name;
        setPrice(price);
        setStock(stock);
    }

    // getter - 商品名
    public String getName() {
        return name;
    }

    // setter - 商品名
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    // getter - 価格
    public double getPrice() {
        return price;
    }

    // setter - 価格（検証付き）
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("価格はマイナスにできません");
        }
    }

    // getter - 在庫数
    public int getStock() {
        return stock;
    }

    // setter - 在庫数（検証付き）
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("在庫数はマイナスにできません");
        }
    }

    // 商品の合計価値を計算（計算プロパティの例）
    public double getTotalValue() {
        return price * stock;
    }

    // 在庫を減らす操作
    public boolean sell(int quantity) {
        if (quantity <= 0) {
            System.out.println("販売数は正の数である必要があります");
            return false;
        }

        if (quantity > stock) {
            System.out.println("在庫が足りません");
            return false;
        }

        stock -= quantity;
        System.out.println(name + "を" + quantity + "個販売しました。残り: " + stock);
        return true;
    }

    // 在庫を増やす操作
    public void restock(int quantity) {
        if (quantity > 0) {
            stock += quantity;
            System.out.println(name + "を" + quantity + "個補充しました。現在: " + stock);
        } else {
            System.out.println("補充数は正の数である必要があります");
        }
    }

    // 商品情報を表示
    public void displayInfo() {
        System.out.println("商品名: " + name);
        System.out.println("価格: " + price + "円");
        System.out.println("在庫: " + stock);
        System.out.println("総価値: " + getTotalValue() + "円");
    }
}
