/**
 * 集約（Aggregation）の例で使用する学生クラス
 */
public class UniversityStudent {
    private String name;
    private int id;

    // コンストラクタ
    public UniversityStudent(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // getter - 名前
    public String getName() {
        return name;
    }

    // setter - 名前
    public void setName(String name) {
        this.name = name;
    }

    // getter - ID
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "学生 [ID: " + id + ", 名前: " + name + "]";
    }
}
