import java.util.ArrayList;

/**
 * ArrayListの基本的な使い方を示す例
 */
public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayListの宣言と初期化
        ArrayList<String> fruits = new ArrayList<>();

        // 要素の追加
        fruits.add("りんご");
        fruits.add("バナナ");
        fruits.add("オレンジ");
        fruits.add("ぶどう");

        // 要素の表示
        System.out.println("果物リスト: " + fruits);

        // 特定の要素の取得
        System.out.println("2番目の果物: " + fruits.get(1));

        // 要素の検索
        int index = fruits.indexOf("オレンジ");
        System.out.println("オレンジのインデックス: " + index);

        // 要素の置き換え
        fruits.set(0, "青りんご");
        System.out.println("置き換え後: " + fruits);

        // 要素の削除
        fruits.remove(1);
        System.out.println("削除後: " + fruits);

        // すべての要素を処理（拡張for文）
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // リストのサイズを取得
        System.out.println("リストのサイズ: " + fruits.size());
    }
}