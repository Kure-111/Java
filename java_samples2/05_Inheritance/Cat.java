/**
 * 継承の例として使用する子クラス（Cat）- メソッドオーバーライドの例
 */
public class Cat extends Animal {
    // コンストラクタ
    public Cat(String name) {
        super(name); // 親クラスのコンストラクタ呼び出し
    }

    // eat()メソッドをオーバーライド - 親クラスの動作を変更
    @Override
    public void eat() {
        System.out.println(name + "が優雅に食事をしています");
    }

    // 猫独自のメソッド
    public void meow() {
        System.out.println(name + "「ニャー」");
    }
}
