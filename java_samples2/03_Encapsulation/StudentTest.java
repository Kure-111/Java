/**
 * Studentクラスを使ったカプセル化のテスト例
 */
public class StudentTest {
    public static void main(String[] args) {
        // 学生のインスタンスを作成
        Student student = new Student("田中太郎", 19, 3.5);

        // 学生情報の表示
        System.out.println("---- 学生情報 ----");
        student.printInfo();

        // getterを使ってデータを取得
        System.out.println("\n---- getterの使用例 ----");
        System.out.println("名前: " + student.getName());
        System.out.println("年齢: " + student.getAge());
        System.out.println("GPA: " + student.getGpa());

        // setterを使ってデータを変更
        System.out.println("\n---- setterの使用例 ----");
        student.setName("田中次郎");
        student.setAge(20);
        student.setGpa(3.8);

        // 変更後の情報を表示
        System.out.println("---- 変更後の学生情報 ----");
        student.printInfo();

        // 無効なデータでsetterを呼び出し
        System.out.println("\n---- 無効値テスト ----");
        student.setAge(-5); // 無効な年齢
        student.setGpa(5.0); // 無効なGPA

        // 無効なデータで変更されていないことを確認
        System.out.println("---- 無効値入力後の学生情報 ----");
        student.printInfo();
    }
}
