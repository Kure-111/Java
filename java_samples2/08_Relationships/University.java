import java.util.ArrayList;

/**
 * 集約（Aggregation）の例 - 大学クラス
 * 大学は学生を持つ（大学が無くなっても学生は存在可能）
 */
public class University {
    private String name;
    private ArrayList<UniversityStudent> students; // 学生の集約

    // コンストラクタ
    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // 学生を追加
    public void addStudent(UniversityStudent student) {
        students.add(student);
    }

    // 学生を削除
    public void removeStudent(UniversityStudent student) {
        students.remove(student);
    }

    // 学生一覧を表示
    public void printStudentInfo() {
        System.out.println(name + "大学の学生一覧：");
        if (students.isEmpty()) {
            System.out.println("  登録されている学生はいません。");
        } else {
            for (UniversityStudent student : students) {
                System.out.println("  ID: " + student.getId() + ", 名前: " + student.getName());
            }
        }
    }

    // 大学名を取得
    public String getName() {
        return name;
    }
}