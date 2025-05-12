import java.util.ArrayList;
import java.util.HashMap;

public class Library_Answer {
    // フィールド
    private ArrayList<LibraryItem> items;
    private HashMap<String, LibraryItem> itemMap;

    // コンストラクタ
    public Library_Answer() {
        items = new ArrayList<>();
        itemMap = new HashMap<>();
    }

    // 新しい資料を図書館に追加するメソッド
    public void addItem(LibraryItem item) {
        items.add(item);
        itemMap.put(item.getId(), item);
    }

    // IDで資料を検索するメソッド
    public LibraryItem findItemById(String id) {
        return itemMap.get(id);
    }

    // タイトルに特定のキーワードを含む資料を検索するメソッド
    public ArrayList<LibraryItem> findItemsByTitle(String keyword) {
        ArrayList<LibraryItem> result = new ArrayList<>();

        for (LibraryItem item : items) {
            if (item.getTitle().contains(keyword)) {
                result.add(item);
            }
        }

        return result;
    }

    // 貸出可能な資料のリストを取得するメソッド
    public ArrayList<LibraryItem> getAvailableItems() {
        ArrayList<LibraryItem> availableItems = new ArrayList<>();

        for (LibraryItem item : items) {
            if (item instanceof Borrowable) {
                Borrowable borrowable = (Borrowable) item;
                if (!borrowable.isBorrowed()) {
                    availableItems.add(item);
                }
            }
        }

        return availableItems;
    }

    // 資料を借りるメソッド
    public boolean borrowItem(String id) {
        LibraryItem item = findItemById(id);

        if (item != null && item instanceof Borrowable) {
            Borrowable borrowable = (Borrowable) item;
            return borrowable.borrow();
        }

        return false;
    }

    // 資料を返却するメソッド
    public boolean returnItem(String id) {
        LibraryItem item = findItemById(id);

        if (item != null && item instanceof Borrowable) {
            Borrowable borrowable = (Borrowable) item;
            return borrowable.returnItem();
        }

        return false;
    }

    // 図書館の資料数を返すメソッド
    public int getTotalItems() {
        return items.size();
    }

    // すべての資料の情報を表示するメソッド
    public void displayAllItems() {
        System.out.println("=== 図書館の全資料 (" + getTotalItems() + "点) ===");
        for (LibraryItem item : items) {
            System.out.println(item.getInfo());
        }
        System.out.println("====================");
    }
}
