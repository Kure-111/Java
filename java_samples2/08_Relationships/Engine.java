/**
 * 構成（Composition）の例で使用するエンジンクラス
 */
public class Engine {
    private String type;
    private int horsePower;

    // コンストラクタ
    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    // エンジンを始動
    public void start() {
        System.out.println(type + "エンジン（" + horsePower + "馬力）が始動しました");
    }

    // エンジンを停止
    public void stop() {
        System.out.println(type + "エンジンが停止しました");
    }
}
