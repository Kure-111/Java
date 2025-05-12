/**
 * 継承の例として使用する子クラス（Dog）
 */
public class Dog extends Animal {
    // 子クラス独自のフィールド
    private String breed;

    // 子クラスのコンストラクタ
    public Dog(String name, String breed) {
        super(name); // 親クラスのコンストラクタを呼び出す
        this.breed = breed;
    }

    // 犬独自のメソッド
    public void bark() {
        System.out.println(name + "が吠えています: ワンワン！");
    }

    // 犬の情報を表示するメソッド
    public void showInfo() {
        System.out.println("名前: " + name);
        System.out.println("犬種: " + breed);
        eat(); // 親クラスのメソッドを呼び出し
        bark(); // 子クラスのメソッドを呼び出し
    }
}
