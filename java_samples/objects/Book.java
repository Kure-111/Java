/**
 * 本を表すクラス
 */
public class Book {
    // フィールド（データ）
    private String title; // タイトル
    private String author; // 著者
    private int pages; // ページ数

    // デフォルトコンストラクタ
    public Book() {
        title = "不明";
        author = "不明";
        pages = 0;
    }

    // パラメータ付きコンストラクタ（2つのパラメータ）
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

    // パラメータ付きコンストラクタ（3つのパラメータ）
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // 情報表示メソッド
    public void showInfo() {
        System.out.println("タイトル: " + title);
        System.out.println("著者: " + author);
        System.out.println("ページ数: " + pages);
    }

    // ゲッターメソッド
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    // セッターメソッド
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
