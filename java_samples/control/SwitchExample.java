/**
 * switch文の例を示すプログラム
 */
public class SwitchExample {
    public static void main(String[] args) {
        // 基本的なswitch文
        int day = 3;
        String dayName;

        System.out.println("===== 基本的なswitch文 =====");
        switch (day) {
            case 1:
                dayName = "月曜日";
                break;
            case 2:
                dayName = "火曜日";
                break;
            case 3:
                dayName = "水曜日";
                break;
            case 4:
                dayName = "木曜日";
                break;
            case 5:
                dayName = "金曜日";
                break;
            case 6:
                dayName = "土曜日";
                break;
            case 7:
                dayName = "日曜日";
                break;
            default:
                dayName = "不正な曜日";
        }

        System.out.println("今日は" + dayName + "です");
        
        // フォールスルーを利用したswitch文
        int month = 4;
        String season;

        System.out.println("\n===== フォールスルーの例 =====");
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "冬";
                break;
            case 3:
            case 4:
            case 5:
                season = "春";
                break;
            case 6:
            case 7:
            case 8:
                season = "夏";
                break;
            case 9:
            case 10:
            case 11:
                season = "秋";
                break;
            default:
                season = "不明";
        }

        System.out.println(month + "月は" + season + "です");
        
        // 文字列を使ったswitch文（Java 7以降）
        String fruit = "りんご";
        
        System.out.println("\n===== 文字列を使ったswitch文 =====");
        switch (fruit) {
            case "りんご":
                System.out.println("りんごは赤いです。");
                break;
            case "バナナ":
                System.out.println("バナナは黄色いです。");
                break;
            case "ぶどう":
                System.out.println("ぶどうは紫です。");
                break;
            default:
                System.out.println("未知の果物です。");
        }
    }
}
