/**
 * 型変換（キャスト）の例を示すプログラム
 */
public class TypeCastExample {
    public static void main(String[] args) {
        // 自動型変換（暗黙的キャスト）
        int intValue = 100;
        long longValue = intValue;     // intからlongへの自動変換
        double doubleValue = intValue; // intからdoubleへの自動変換

        System.out.println("===== 自動型変換 =====");
        System.out.println("int値: " + intValue);      // 100
        System.out.println("long値: " + longValue);    // 100
        System.out.println("double値: " + doubleValue);  // 100.0
        
        // 明示的キャスト
        double piValue = 3.14159;
        int intPi = (int) piValue;  // doubleからintへの明示的キャスト

        System.out.println("\n===== 明示的キャスト =====");
        System.out.println("元のdouble値: " + piValue);  // 3.14159
        System.out.println("変換後のint値: " + intPi);   // 3（小数部分は切り捨て）
        
        // キャスト時の注意点（オーバーフロー）
        long bigValue = 2147483648L;  // intの最大値を超える値
        int overflowValue = (int) bigValue;  // 明示的キャスト

        System.out.println("\n===== オーバーフローの例 =====");
        System.out.println("元のlong値: " + bigValue);        // 2147483648
        System.out.println("変換後のint値: " + overflowValue); // -2147483648（オーバーフロー）
        
        // 文字列と数値の変換
        String strNumber = "123";
        int parsedInt = Integer.parseInt(strNumber);
        double parsedDouble = Double.parseDouble("45.67");

        System.out.println("\n===== 文字列から数値への変換 =====");
        System.out.println("文字列: \"" + strNumber + "\"");
        System.out.println("変換後のint値: " + parsedInt);           // 123
        System.out.println("変換後のdouble値: " + parsedDouble);     // 45.67
        
        // 数値から文字列への変換
        int number = 456;
        String str1 = "" + number;              // 文字列連結を使用
        String str2 = String.valueOf(number);   // String.valueOf()メソッドを使用
        
        System.out.println("\n===== 数値から文字列への変換 =====");
        System.out.println("元の数値: " + number);
        System.out.println("文字列連結による変換: " + str1);
        System.out.println("String.valueOf()による変換: " + str2);
    }
}
