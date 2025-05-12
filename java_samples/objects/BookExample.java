
/**
 * Bookクラスの使い方を示すプログラム
 */
public class BookExample {
    public static void main(String[] args) {
        // Bookオブジェクトの作成（インスタンス化）
        Book myBook = new Book("Java入門", "山田太郎");

        // オブジェクトのメソッドを呼び出し
        System.out.println("===== 1冊目の本 =====");
        myBook.showInfo();

        // 別のBookオブジェクトを作成
        Book anotherBook = new Book("Python入門", "鈴木次郎", 320);
        System.out.println("\n===== 2冊目の本 =====");
        anotherBook.showInfo();

        // デフォルトコンストラクタを使用
        Book unknownBook = new Book();
        System.out.println("\n===== 不明な本 =====");
        unknownBook.showInfo();

        // ゲッターメソッドを使用
        System.out.println("\n===== ゲッターの使用 =====");
        System.out.println("1冊目の本のタイトル: " + myBook.getTitle());
        System.out.println("2冊目の本の著者: " + anotherBook.getAuthor());
        System.out.println("2冊目の本のページ数: " + anotherBook.getPages());

        // セッターメソッドを使用
        System.out.println("\n===== セッターの使用 =====");
        myBook.setTitle("改訂版Java入門");
        myBook.setPages(450);
        System.out.println("変更後の1冊目の本:");
        myBook.showInfo();
    }
}