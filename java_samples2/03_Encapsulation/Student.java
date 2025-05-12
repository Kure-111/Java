/**
 * カプセル化を示す生徒クラスの例
 */
public class Student {
    // privateフィールド - クラス外からの直接アクセスを禁止
    private String name;
    private int age;
    private double gpa;

    // コンストラクタ
    public Student(String name, int age, double gpa) {
        this.name = name;
        setAge(age); // 検証を含むsetterを使用
        setGpa(gpa); // 検証を含むsetterを使用
    }

    // getter - nameフィールドの値を取得するメソッド
    public String getName() {
        return name;
    }

    // setter - nameフィールドの値を設定するメソッド
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("無効な名前です");
        }
    }

    // getter - ageフィールドの値を取得するメソッド
    public int getAge() {
        return age;
    }

    // setter - ageフィールドの値を設定するメソッド（データ検証を含む）
    public void setAge(int age) {
        if (age > 0 && age < 120) { // 妥当な年齢かチェック
            this.age = age;
        } else {
            System.out.println("無効な年齢です");
        }
    }

    // getter - gpaフィールドの値を取得するメソッド
    public double getGpa() {
        return gpa;
    }

    // setter - gpaフィールドの値を設定するメソッド（データ検証を含む）
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) { // GPAの範囲をチェック
            this.gpa = gpa;
        } else {
            System.out.println("無効なGPAです");
        }
    }

    // 学生情報を表示するメソッド
    public void printInfo() {
        System.out.println("名前: " + name);
        System.out.println("年齢: " + age);
        System.out.println("GPA: " + gpa);
    }
}