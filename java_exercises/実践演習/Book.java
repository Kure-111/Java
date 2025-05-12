public class Book {
    // TODO: LibraryItemを継承し、Borrowableインターフェースを実装するよう修正してください

    // フィールド
    private String id;
    private String title;
    private int year;
    private String author;
    private boolean borrowed;

    // TODO: コンストラクタを作成してください
    // LibraryItemのコンストラクタを呼び出し、authorフィールドを初期化する
    // borrowedの初期値はfalseにする

    // 著者を取得するメソッド
    public String getAuthor() {
        return author;
    }

    // IDを取得するメソッド
    public String getId() {
        return id;
    }

    // タイトルを取得するメソッド
    public String getTitle() {
        return title;
    }

    // TODO: Borrowableインターフェースのメソッドを実装してください

    // TODO: LibraryItemのgetInfoメソッドをオーバーライドしてください
}
