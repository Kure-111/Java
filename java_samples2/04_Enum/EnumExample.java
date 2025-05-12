/**
 * 列挙型（enum）の基本的な使い方を示す例
 */
public class EnumExample {
    // 曜日を表すenum
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    // 季節を表すenum
    public enum Season {
        SPRING, SUMMER, AUTUMN, WINTER
    }

    public static void main(String[] args) {
        // enumの値を変数に代入
        Day today = Day.WEDNESDAY;

        // switch文でenumを使用
        switch (today) {
            case MONDAY:
                System.out.println("週の始まりです");
                break;
            case FRIDAY:
                System.out.println("週末が近いです");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("週末です");
                break;
            default:
                System.out.println("平日です");
                break;
        }

        // valueOf()メソッド - 文字列からenum値を取得
        Day day = Day.valueOf("MONDAY");
        System.out.println("文字列から取得した曜日: " + day);

        // values()メソッド - すべてのenum値を配列として取得
        System.out.println("\n全ての曜日:");
        for (Day d : Day.values()) {
            System.out.println(d);
        }

        // ordinal()メソッド - enum値の序数を取得
        System.out.println("\n" + day + "の位置: " + day.ordinal());

        // 季節の例
        Season currentSeason = Season.SUMMER;
        System.out.println("\n現在の季節: " + currentSeason);
    }
}