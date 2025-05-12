import java.util.ArrayList;

public class Library {
    // TODO: フィールドを宣言してください
    // すべての資料を保存するArrayList
    // IDから資料をすぐに検索できるようにするためのHashMap

    // TODO: コンストラクタを作成し、フィールドを初期化してください

    // TODO: 新しい資料を図書館に追加するメソッドを実装してください
    public void addItem(LibraryItem item) {
        // ArrayListとHashMapに資料を追加
    }

    // TODO: IDで資料を検索するメソッドを実装してください
    public LibraryItem findItemById(String id) {
        // HashMapを使って資料を検索し、結果を返す
        return null; // 仮の戻り値
    }

    // TODO: タイトルに特定のキーワードを含む資料を検索するメソッドを実装してください
    public ArrayList<LibraryItem> findItemsByTitle(String keyword) {
        // すべての資料を確認し、タイトルにキーワードを含むものをresultに追加
        return new ArrayList<>(); // 仮の戻り値
    }

    // TODO: 貸出可能な資料のリストを取得するメソッドを実装してください
    public ArrayList<LibraryItem> getAvailableItems() {
        // すべての資料を確認し、貸出可能なもののみavailableItemsに追加
        return new ArrayList<>(); // 仮の戻り値
    }

    // TODO: 資料を借りるメソッドを実装してください
    public boolean borrowItem(String id) {
        // IDで資料を検索し、見つかった場合は借りる
        return false; // 仮の戻り値
    }

    // TODO: 資料を返却するメソッドを実装してください
    public boolean returnItem(String id) {
        // IDで資料を検索し、見つかった場合は返却する
        return false; // 仮の戻り値
    }

    // TODO: 図書館の資料数を返すメソッドを実装してください
    public int getTotalItems() {
        // 登録されている資料の総数を返す
        return 0; // 仮の戻り値
    }

    // TODO: すべての資料の情報を表示するメソッドを実装してください
    public void displayAllItems() {
        // すべての資料の情報を表示
    }
}
