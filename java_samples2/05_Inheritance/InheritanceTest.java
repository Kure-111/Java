/**
 * 継承の基本とポリモーフィズムを示すテストクラス
 */
public class InheritanceTest {
    public static void main(String[] args) {
        // 親クラスのインスタンス作成
        Animal animal = new Animal("動物");
        animal.eat();
        animal.sleep();

        System.out.println("----------");

        // 子クラス（Dog）のインスタンス作成
        Dog dog = new Dog("ポチ", "柴犬");
        dog.eat(); // 親クラスから継承したメソッド
        dog.sleep(); // 親クラスから継承したメソッド
        dog.bark(); // 子クラス独自のメソッド

        System.out.println("----------");

        dog.showInfo(); // 親クラスメソッドと子クラスメソッドを組み合わせたメソッド

        System.out.println("----------");

        // 子クラス（Cat）のインスタンス作成
        Cat cat = new Cat("ミケ");
        cat.eat(); // オーバーライドしたメソッド
        cat.sleep(); // 親クラスから継承したメソッド
        cat.meow(); // 子クラス独自のメソッド

        System.out.println("----------");

        // ポリモーフィズムの例（親クラス型の変数に子クラスのインスタンスを代入）
        Animal dogAnimal = dog;
        Animal catAnimal = cat;

        // 実際のオブジェクトの型に基づいてメソッドが呼び出される
        dogAnimal.eat(); // Dogのeatメソッド（Animal型だがDogオブジェクト）
        catAnimal.eat(); // Catのeatメソッド（Animal型だがCatオブジェクト）
    }
}
