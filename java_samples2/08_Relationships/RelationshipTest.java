/**
 * クラス間の関連（集約と構成）を示すテストクラス
 */
public class RelationshipTest {
    public static void main(String[] args) {
        System.out.println("==== 集約（Aggregation）の例 ====");

        // 学生オブジェクトを作成（大学に所属していない）
        UniversityStudent student1 = new UniversityStudent("田中太郎", 1001);
        UniversityStudent student2 = new UniversityStudent("鈴木花子", 1002);

        // 大学オブジェクトを作成
        University university = new University("サンプル");

        // 学生を大学に登録（集約）
        university.addStudent(student1);
        university.addStudent(student2);

        // 大学の学生一覧を表示
        university.printStudentInfo();

        // 学生情報を変更
        student1.setName("田中一郎"); // 学生オブジェクトは独立して存在

        // 変更後の大学の学生一覧
        System.out.println("\n学生名変更後:");
        university.printStudentInfo();

        // 学生を大学から削除
        university.removeStudent(student1);

        // 削除後の大学の学生一覧
        System.out.println("\n学生削除後:");
        university.printStudentInfo();

        // 大学オブジェクトが削除されても学生オブジェクトは存在する
        System.out.println("\n学生1は大学から削除されても存在します: " + student1);

        System.out.println("\n==== 構成（Composition）の例 ====");

        // 車オブジェクトを作成（エンジンは内部で生成される）
        Car car = new Car("スポーツカー", "V型6気筒", 300);

        // 車を操作（内部のエンジンも操作される）
        car.start();
        car.drive();
        car.stop();

        // 車オブジェクトが削除されると、そのエンジンオブジェクトも削除される
        System.out.println("\n車オブジェクトが削除されると、エンジンオブジェクトも削除されます。");
    }
}
