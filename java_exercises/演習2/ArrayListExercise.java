import java.util.ArrayList;

/**
 * ArrayList の基本演習
 * 
 * この演習では、ArrayList の基本的な操作を学びます：
 * - ArrayListの宣言と初期化
 * - 要素の追加、取得、削除
 * - リストの操作と検索
 */
public class ArrayListExercise {

    /**
     * 整数を格納するArrayListを作成し、指定された数の要素を追加します
     * 
     * @param count 追加する要素の数
     * @return 整数を格納したArrayList
     */
    public static ArrayList<Integer> createIntegerList(int count) {
        // TODO: 以下のステップを実装してください
        // 1. Integer型のArrayListを宣言して初期化する (ArrayList<Integer> listという名前を使ってください)
        // 2. 1からcountまでの整数をリストに追加する
        // 3. リストを返す

        return null; // この行を適切に修正してください
    }

    /**
     * 文字列を格納するArrayListを作成し、指定された文字列を追加します
     * 
     * @param strings 追加する文字列の配列
     * @return 文字列を格納したArrayList
     */
    public static ArrayList<String> createStringList(String[] strings) {
        // TODO: 以下のステップを実装してください
        // 1. String型のArrayListを宣言して初期化する (ArrayList<String> listという名前を使ってください)
        // 2. 引数で渡された文字列配列の各要素をリストに追加する
        // 3. リストを返す

        return null; // この行を適切に修正してください
    }

    /**
     * ArrayListから偶数の要素のみを抽出した新しいArrayListを返します
     * 
     * @param numbers 整数のArrayList
     * @return 偶数のみを含む新しいArrayList
     */
    public static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> numbers) {
        // TODO: 以下のステップを実装してください
        // 1. 結果を格納するための新しいArrayListを宣言して初期化する
        // 2. 引数で渡されたArrayListの各要素をチェックし、偶数だけを新しいリストに追加する
        // 3. 新しいリストを返す

        return null; // この行を適切に修正してください
    }

    /**
     * ArrayListから重複を削除します
     * 
     * @param list 整数のArrayList
     * @return 重複のない新しいArrayList
     */
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        // TODO: 以下のステップを実装してください
        // 1. 結果を格納するための新しいArrayListを宣言して初期化する
        // 2. 引数で渡されたArrayListの各要素をチェックし、
        // 新しいリストにまだ存在しない場合のみ追加する
        // 3. 新しいリストを返す

        return null; // この行を適切に修正してください
    }

    /**
     * ArrayListの要素の合計を計算します
     * 
     * @param numbers 整数のArrayList
     * @return 要素の合計
     */
    public static int calculateSum(ArrayList<Integer> numbers) {
        // TODO: ArrayListの要素の合計を計算するコードを実装してください

        return 0; // この行を適切に修正してください
    }

    /**
     * テスト用メインメソッド
     */
    public static void main(String[] args) {
        // createIntegerListのテスト
        ArrayList<Integer> intList = createIntegerList(5);
        System.out.println("整数リスト (1-5): " + intList);

        // createStringListのテスト
        String[] fruits = { "りんご", "バナナ", "オレンジ", "ぶどう" };
        ArrayList<String> stringList = createStringList(fruits);
        System.out.println("文字列リスト: " + stringList);

        // filterEvenNumbersのテスト
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println("元のリスト: " + numbers);
        ArrayList<Integer> evenNumbers = filterEvenNumbers(numbers);
        System.out.println("偶数のみ: " + evenNumbers);

        // removeDuplicatesのテスト
        ArrayList<Integer> duplicateList = new ArrayList<>();
        duplicateList.add(1);
        duplicateList.add(2);
        duplicateList.add(2);
        duplicateList.add(3);
        duplicateList.add(1);
        duplicateList.add(4);
        System.out.println("重複を含むリスト: " + duplicateList);
        ArrayList<Integer> uniqueList = removeDuplicates(duplicateList);
        System.out.println("重複を削除したリスト: " + uniqueList);

        // calculateSumのテスト
        int sum = calculateSum(numbers);
        System.out.println("合計: " + sum);
    }
}