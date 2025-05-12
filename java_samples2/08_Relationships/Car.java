/**
 * 構成（Composition）の例 - 車クラス
 * 車はエンジンを持ち、車が無くなるとエンジンも無くなる
 */
public class Car {
    private String model;
    private Engine engine; // エンジンは車の構成要素

    // コンストラクタ - エンジンを内部で生成
    public Car(String model, String engineType, int horsePower) {
        this.model = model;
        this.engine = new Engine(engineType, horsePower); // カー内部でエンジンを作成
    }

    // 車を始動
    public void start() {
        System.out.println(model + "を始動します");
        engine.start(); // エンジンの始動メソッドを呼び出し
    }

    // 車を運転
    public void drive() {
        System.out.println(model + "を運転中...");
    }

    // 車を停止
    public void stop() {
        System.out.println(model + "を停止します");
        engine.stop(); // エンジンの停止メソッドを呼び出し
    }
}
