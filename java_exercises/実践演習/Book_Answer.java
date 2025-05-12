public class Book_Answer extends LibraryItem implements Borrowable {
    // フィールド
    private String author;
    private boolean borrowed;

    // コンストラクタ
    public Book_Answer(String id, String title, int year, String author) {
        // 親クラスのコンストラクタを呼び出し
        super(id, title, year);
        this.author = author;
        this.borrowed = false; // 初期状態は貸出中でない
    }

    // 著者を取得するメソッド
    public String getAuthor() {
        return author;
    }

    // Borrowableインターフェースのメソッドを実装

    // 本を借りるメソッド
    @Override
    public boolean borrow() {
        // もし貸出中でなければ、貸出状態をtrueに設定して、trueを返す
        if (!borrowed) {
            borrowed = true;
            return true;
        }
        // 既に貸出中であれば、falseを返す
        return false;
    }

    // 本を返却するメソッド
    @Override
    public boolean returnItem() {
        // もし貸出中であれば、貸出状態をfalseに設定して、trueを返す
        if (borrowed) {
            borrowed = false;
            return true;
        }
        // 貸出中でなければ、falseを返す
        return false;
    }

    // 貸出状態を確認するメソッド
    @Override
    public boolean isBorrowed() {
        return borrowed;
    }

    // 親クラスのgetInfoメソッドをオーバーライド
    @Override
    public String getInfo() {
        // 親クラスのgetInfo()を呼び出し、著者と貸出状態の情報を追加して返す
        String baseInfo = super.getInfo();
        String status = borrowed ? "貸出中" : "貸出可能";
        return baseInfo + ", 著者: " + author + ", 状態: " + status;
    }
}