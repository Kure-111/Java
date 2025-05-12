/**
 * 配列の基本演習
 * 
 * この演習では配列の基本的な操作を学びます：
 * - 配列の宣言と初期化
 * - 配列の要素へのアクセスと変更
 * - 配列の検索と集計
 */
public class ArrayExercise {

    /**
     * 整数配列を生成して返します
     * 
     * @param size         配列のサイズ
     * @param initialValue 配列の要素の初期値
     * @return 指定されたサイズと初期値で初期化された整数配列
     */
    public static int[] createArray(int size, int initialValue) {
        // TODO: 以下のステップを実装してください
        // 1. 指定されたサイズの整数配列を宣言する (int[] arrayという名前を使ってください)
        // 2. ループを使って配列のすべての要素を initialValue で初期化する
        // 3. 配列を返す

        return null; // この行を適切に修正してください
    }

    /**
     * 配列の要素をすべて2倍にします
     * 
     * @param array 整数配列
     */
    public static void doubleArrayValues(int[] array) {
        // TODO: 配列の各要素の値を2倍にするコードを実装してください
    }

    /**
     * 配列内の偶数の個数を数えます
     * 
     * @param array 整数配列
     * @return 配列内の偶数の個数
     */
    public static int countEvenNumbers(int[] array) {
        // TODO: 配列内の偶数の個数を数えるコードを実装してください

        return 0; // この行を適切に修正してください
    }

    /**
     * 配列内の要素の合計を計算します
     * 
     * @param array 整数配列
     * @return 配列要素の合計
     */
    public static int calculateSum(int[] array) {
        // TODO: 配列内の要素の合計を計算するコードを実装してください

        return 0; // この行を適切に修正してください
    }

    /**
     * 配列内の最大値とその位置（インデックス）を見つけます
     * 
     * @param array 整数配列
     * @return 最大値とそのインデックスを含む整数配列 [最大値, インデックス]
     */
    public static int[] findMax(int[] array) {
        // TODO: 以下のステップを実装してください
        // 1. 結果を格納するための2要素の整数配列を宣言する (int[] resultという名前を使ってください)
        // 2. 配列内の最大値とそのインデックスを見つける
        // 3. 結果配列に最大値とそのインデックスを設定する
        // 4. 結果配列を返す

        return null; // この行を適切に修正してください
    }

    /**
     * テスト用メインメソッド
     */
    public static void main(String[] args) {
        // サンプル配列
        int[] array1 = createArray(5, 10);
        System.out.println("配列1の作成 (サイズ5, 初期値10):");
        printArray(array1);

        System.out.println("\n各要素を2倍にした後:");
        doubleArrayValues(array1);
        printArray(array1);

        int[] array2 = { 3, 8, 2, 10, 5, 1, 7, 4 };
        System.out.println("\n配列2:");
        printArray(array2);

        int evenCount = countEvenNumbers(array2);
        System.out.println("偶数の個数: " + evenCount);

        int sum = calculateSum(array2);
        System.out.println("合計: " + sum);

        int[] maxInfo = findMax(array2);
        if (maxInfo != null) {
            System.out.println("最大値: " + maxInfo[0] + ", インデックス: " + maxInfo[1]);
        }
    }

    /**
     * 配列の内容を出力するヘルパーメソッド
     */
    private static void printArray(int[] array) {
        if (array == null) {
            System.out.println("配列はnullです");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
