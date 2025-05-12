# 研修資料のファイル構成

研修で使用する Java ファイルは以下のディレクトリ構成にまとめることをお勧めします。これにより、コンセプトごとに整理され、学習が容易になります。

```
java_samples2/
│
├── 01_Arrays/
│   └── ArrayExample.java           # 配列の基本操作
│
├── 02_Collections/
│   ├── ArrayListExample.java       # ArrayListの基本操作
│   └── HashMapExample.java         # HashMapの基本操作
│
├── 03_Encapsulation/
│   ├── Student.java                # 学生クラス（カプセル化の例）
│   ├── StudentTest.java            # Studentクラスのテスト
│   ├── Product.java                # 商品クラス（カプセル化の例）
│   └── ProductTest.java            # Productクラスのテスト
│
├── 04_Enum/
│   └── EnumExample.java            # 列挙型の基本
│
├── 05_Inheritance/
│   ├── Animal.java                 # 親クラス
│   ├── Dog.java                    # 子クラス（親メソッド利用）
│   ├── Cat.java                    # 子クラス（メソッドオーバーライド）
│   └── InheritanceTest.java        # 継承のテスト
│
├── 06_Polymorphism/
│   ├── Shape.java                  # 形状の親クラス
│   ├── Circle.java                 # 円クラス
│   ├── Rectangle.java              # 長方形クラス
│   └── ShapeTest.java              # ポリモーフィズムのテスト
│
├── 07_Interface/
│   ├── Drawable.java               # 描画インターフェース
│   ├── DrawableCircle.java         # インターフェース実装（円）
│   ├── DrawableRectangle.java      # インターフェース実装（長方形）
│   └── InterfaceTest.java          # インターフェースのテスト
│
└── 08_Relationships/
    ├── UniversityStudent.java      # 学生クラス（集約）
    ├── University.java             # 大学クラス（集約）
    ├── Engine.java                 # エンジンクラス（構成）
    ├── Car.java                    # 車クラス（構成）
    └── RelationshipTest.java       # 関連のテスト
```

## コンパイルと実行手順

テストクラスをコンパイルして実行するには、以下のコマンドを使用します：

```bash
# 例：継承のテストをコンパイルして実行する場合
cd 05_Inheritance
javac *.java
java InheritanceTest
```

各ディレクトリのテストクラスを実行することで、対応する概念がどのように機能するかを確認できます。

## 学習順序

1. 配列（01_Arrays）
2. コレクション（02_Collections）
3. カプセル化（03_Encapsulation）
4. 列挙型（04_Enum）
5. 継承（05_Inheritance）
6. ポリモーフィズム（06_Polymorphism）
7. インターフェース（07_Interface）
8. オブジェクト間の関連（08_Relationships）

この順序でファイルを学習することで、オブジェクト指向プログラミングの基本概念から応用的な概念まで段階的に理解できます。
