/**
 * Javaの様々な出力方法を示すプログラム
 */
public class OutputMethods {
    public static void main(String[] args) {
        // 1. println() - 出力後に改行
        System.out.println("Hello, World!");
        System.out.println("This is a new line.");
        
        // 2. print() - 改行なしで出力
        System.out.print("Hello, ");
        System.out.print("World! ");
        System.out.println("(No line break between Hello and World)");
        
        // 3. printf() - 書式指定付きの出力
        String name = "山田太郎";
        int age = 20;
        double height = 175.5;
        System.out.printf("名前: %s, 年齢: %d歳, 身長: %.1fcm\n", name, age, height);
        
        // 書式指定子の例
        System.out.printf("整数: %d, 小数: %.2f, 文字: %c, 文字列: %s, 真偽値: %b\n", 
                           42, 3.14159, 'A', "Hello", true);
    }
}
