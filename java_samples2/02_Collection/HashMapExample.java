import java.util.HashMap;

/**
 * HashMapの基本的な使い方を示す例
 */
public class HashMapExample {
    public static void main(String[] args) {
        // HashMapの宣言と初期化
        HashMap<String, Integer> studentScores = new HashMap<>();

        // 要素の追加
        studentScores.put("田中", 85);
        studentScores.put("鈴木", 92);
        studentScores.put("佐藤", 78);
        studentScores.put("高橋", 95);

        // 要素の表示
        System.out.println("学生の点数: " + studentScores);

        // 値の取得
        System.out.println("田中さんの点数: " + studentScores.get("田中"));

        // 値の更新
        studentScores.put("佐藤", 82);
        System.out.println("佐藤さんの更新後の点数: " + studentScores.get("佐藤"));

        // キーの存在確認
        if (studentScores.containsKey("鈴木")) {
            System.out.println("鈴木さんは登録されています");
        }

        // すべてのキーを取得して処理
        for (String name : studentScores.keySet()) {
            System.out.println(name + "さん: " + studentScores.get(name) + "点");
        }

    }
}