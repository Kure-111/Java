public class LibraryItem {
    // フィールド
    protected String id;
    protected String title;
    protected int year;

    // コンストラクタ
    public LibraryItem(String id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    // IDを取得するメソッド
    public String getId() {
        return id;
    }

    // タイトルを取得するメソッド
    public String getTitle() {
        return title;
    }

    // 発行年を取得するメソッド
    public int getYear() {
        return year;
    }

    // 資料の基本情報を文字列で返すメソッド
    public String getInfo() {
        return "ID: " + id + ", タイトル: " + title + ", 発行年: " + year;
    }
}
