import java.util.Scanner;

/**
 * Scannerクラスを使った入力の例を示すプログラム
 */
public class ScannerExample {
    public static void main(String[] args) {
        // Scannerオブジェクトの作成
        Scanner scanner = new Scanner(System.in);
        
        // 文字列の入力
        System.out.print("あなたの名前を入力してください: ");
        String name = scanner.nextLine();  // 1行読み込み
        
        // 整数の入力
        System.out.print("あなたの年齢を入力してください: ");
        int age = scanner.nextInt();  // 整数を読み込み
        
        // 入力バッファをクリア
        scanner.nextLine();
        
        // 小数の入力
        System.out.print("あなたの身長(cm)を入力してください: ");
        double height = scanner.nextDouble();  // 小数を読み込み
        
        // 結果の表示
        System.out.println("\n----- 入力情報 -----");
        System.out.println("名前: " + name);
        System.out.println("年齢: " + age + "歳");
        System.out.println("身長: " + height + "cm");
        
        // 文字列操作と組み合わせた例
        System.out.println("\n----- 文字列操作の例 -----");
        System.out.println("名前の長さ: " + name.length() + "文字");
        
        if (name.equals("山田太郎")) {
            System.out.println("あなたは山田太郎さんですね！");
        }
        
        if (name.contains("山田")) {
            System.out.println("「山田」を含む名前ですね！");
        }
        
        // 好きな食べ物を入力（nextLineの使用例）
        System.out.print("\nあなたの好きな食べ物を入力してください: ");
        String food = scanner.next();  // 次の単語を読み込み
        
        System.out.println(name + "さんの好きな食べ物は" + food + "ですね！");
        
        // Scannerを閉じる
        scanner.close();
    }
}
