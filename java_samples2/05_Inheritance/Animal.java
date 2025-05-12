/**
 * 継承の例として使用する親クラス（Animal）
 */
public class Animal {
    // protected修飾子 - サブクラスからアクセス可能
    protected String name;

    // コンストラクタ
    public Animal(String name) {
        this.name = name;
    }

    // 動物の基本的な行動
    public void eat() {
        System.out.println(name + "が食事をしています");
    }

    public void sleep() {
        System.out.println(name + "が眠っています");
    }
}