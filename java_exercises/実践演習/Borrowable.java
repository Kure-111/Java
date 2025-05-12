public interface Borrowable {
    // 資料を借りるメソッド
    boolean borrow();

    // 資料を返却するメソッド
    boolean returnItem();

    // 現在借りられているかどうかを確認するメソッド
    boolean isBorrowed();
}