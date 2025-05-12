# Java プログラミング入門 サンプルコード集

このサンプルコード集は、Java プログラミングの基本概念を学ぶための実践的なコード例を提供しています。各コードは特定の学習目標に合わせて設計されており、初心者が段階的に Java プログラミングを理解できるよう構成されています。

## ファイル構成

```
java-samples/
├── basic/
│   ├── HelloWorld.java             // 基本的なHello Worldプログラム
│   ├── OutputMethods.java          // 様々な出力方法
│   └── VariableExample.java        // 変数の使用例
├── objects/
│   ├── Book.java                   // 基本的なクラス定義
│   ├── BookExample.java            // オブジェクトの作成と使用
│   ├── Calculator.java             // メソッド定義の例
│   └── CalculatorTest.java         // メソッド呼び出しの例
├── datatypes/
│   ├── BasicCalculation.java       // 基本的な演算
│   ├── TypeCastExample.java        // 型変換（キャスト）
│   └── ScannerExample.java         // キーボード入力
├── control/
│   ├── IfElseExample.java          // 条件分岐
│   ├── SwitchExample.java          // switch文
│   ├── GradeCalculator.java        // 条件分岐の実践例
│   ├── ForLoopExample.java         // for文の基本
│   ├── ForEachExample.java         // 拡張for文
│   ├── NestedLoopExample.java      // ネストしたループ
│   └── BreakContinueExample.java   // breakとcontinue
└── README.md                       // このファイル
```

## 1. 基本的なプログラム構造

### HelloWorld.java

**学習目標**: Java の基本的なプログラム構造、main()メソッド、標準出力を理解する

```java
/**
 * 最初のJavaプログラム - Hello Worldを表示する
 */
public class HelloWorld {
    public static void main(String[] args) {
        // 画面に「Hello, World!」と表示する
        System.out.println("Hello, World!");
    }
}
```

### OutputMethods.java

**学習目標**: Java での様々な出力方法（println, print, printf）を学ぶ

```java
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
```

### VariableExample.java

**学習目標**: 変数の宣言、初期化、使用方法を学ぶ

```java
/**
 * 変数の基本的な使い方を示すプログラム
 */
public class VariableExample {
    public static void main(String[] args) {
        // 変数の宣言と初期化
        int age = 20;
        double height = 175.5;
        char grade = 'A';
        boolean isStudent = true;

        // 変数の値を表示
        System.out.println("年齢: " + age + "歳");
        System.out.println("身長: " + height + "cm");
        System.out.println("成績: " + grade);
        System.out.println("学生ですか？: " + isStudent);

        // 変数の値を変更
        age = 21;
        height = 176.2;

        // 変更後の値を表示
        System.out.println("\n=== 1年後 ===");
        System.out.println("年齢: " + age + "歳");
        System.out.println("身長: " + height + "cm");

        // 変数を使った計算
        int birthYear = 2025 - age;
        System.out.println("生まれ年（おおよそ）: " + birthYear + "年");

        // 様々なデータ型の例
        byte small = 127;                      // 8ビット整数
        short medium = 32767;                  // 16ビット整数
        long large = 9223372036854775807L;     // 64ビット整数（Lを付ける）
        float price = 19.99f;                  // 32ビット浮動小数点（fを付ける）

        System.out.println("\n=== 様々なデータ型 ===");
        System.out.println("byte型: " + small);
        System.out.println("short型: " + medium);
        System.out.println("long型: " + large);
        System.out.println("float型: " + price);
    }
}
```

## 2. クラスとオブジェクト

### Book.java

**学習目標**: クラスの定義、フィールド、メソッド、コンストラクタの基本を学ぶ

```java
/**
 * 本を表すクラス
 */
public class Book {
    // フィールド（データ）
    private String title;    // タイトル
    private String author;   // 著者
    private int pages;       // ページ数

    // デフォルトコンストラクタ
    public Book() {
        title = "不明";
        author = "不明";
        pages = 0;
    }

    // パラメータ付きコンストラクタ（2つのパラメータ）
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

    // パラメータ付きコンストラクタ（3つのパラメータ）
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // 情報表示メソッド
    public void showInfo() {
        System.out.println("タイトル: " + title);
        System.out.println("著者: " + author);
        System.out.println("ページ数: " + pages);
    }

    // ゲッターメソッド
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    // セッターメソッド
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
```

### BookExample.java

**学習目標**: オブジェクトの作成、メソッド呼び出し、フィールドへのアクセスを学ぶ

```java
/**
 * Bookクラスの使い方を示すプログラム
 */
public class BookExample {
    public static void main(String[] args) {
        // Bookオブジェクトの作成（インスタンス化）
        Book myBook = new Book("Java入門", "山田太郎");

        // オブジェクトのメソッドを呼び出し
        System.out.println("===== 1冊目の本 =====");
        myBook.showInfo();

        // 別のBookオブジェクトを作成
        Book anotherBook = new Book("Python入門", "鈴木次郎", 320);
        System.out.println("\n===== 2冊目の本 =====");
        anotherBook.showInfo();

        // デフォルトコンストラクタを使用
        Book unknownBook = new Book();
        System.out.println("\n===== 不明な本 =====");
        unknownBook.showInfo();

        // ゲッターメソッドを使用
        System.out.println("\n===== ゲッターの使用 =====");
        System.out.println("1冊目の本のタイトル: " + myBook.getTitle());
        System.out.println("2冊目の本の著者: " + anotherBook.getAuthor());
        System.out.println("2冊目の本のページ数: " + anotherBook.getPages());

        // セッターメソッドを使用
        System.out.println("\n===== セッターの使用 =====");
        myBook.setTitle("改訂版Java入門");
        myBook.setPages(450);
        System.out.println("変更後の1冊目の本:");
        myBook.showInfo();
    }
}
```

### Calculator.java

**学習目標**: メソッドの定義（戻り値あり/なし）、引数の扱い方を学ぶ

```java
/**
 * 計算機能を提供するクラス
 */
public class Calculator {
    // 2つの数の合計を返すメソッド
    public int add(int a, int b) {
        return a + b;
    }

    // 2つの数の差を返すメソッド
    public int subtract(int a, int b) {
        return a - b;
    }

    // 2つの数の積を返すメソッド
    public int multiply(int a, int b) {
        return a * b;
    }

    // 2つの数の商を返すメソッド
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("エラー: ゼロで割ることはできません");
            return 0;
        }
        return a / b;
    }

    // 円の面積を計算するメソッド
    public double calculateCircleArea(double radius) {
        return 3.14 * radius * radius;
    }

    // 結果を表示するメソッド（戻り値なし）
    public void showResult(String operation, double result) {
        System.out.println(operation + "の結果: " + result);
    }
}
```

### CalculatorTest.java

**学習目標**: オブジェクトの作成、メソッド呼び出し、戻り値の使い方を学ぶ

```java
/**
 * Calculatorクラスの使い方を示すプログラム
 */
public class CalculatorTest {
    public static void main(String[] args) {
        // Calculatorオブジェクトの作成
        Calculator calc = new Calculator();

        // 各メソッドの呼び出しと結果の表示
        int sum = calc.add(10, 5);
        calc.showResult("足し算", sum);

        int difference = calc.subtract(10, 5);
        calc.showResult("引き算", difference);

        int product = calc.multiply(10, 5);
        calc.showResult("掛け算", product);

        double quotient = calc.divide(10, 5);
        calc.showResult("割り算", quotient);

        // ゼロで割る場合
        calc.divide(10, 0);

        // 円の面積を計算
        double radius = 5.0;
        double area = calc.calculateCircleArea(radius);
        System.out.println("半径" + radius + "の円の面積: " + area);
    }
}
```

## 3. 基本データ型と演算

### BasicCalculation.java

**学習目標**: 基本的な演算子、算術演算、複合代入演算子を学ぶ

```java
/**
 * 基本的な演算の例を示すプログラム
 */
public class BasicCalculation {
    public static void main(String[] args) {
        // 変数の宣言と初期化
        int a = 10;
        int b = 3;

        // 基本的な算術演算
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("===== 基本的な算術演算 =====");
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " - " + b + " = " + difference);
        System.out.println(a + " * " + b + " = " + product);
        System.out.println(a + " / " + b + " = " + quotient);
        System.out.println(a + " % " + b + " = " + remainder);

        // 小数点の計算
        double x = 10.0;
        double y = 3.0;
        double result = x / y;
        System.out.println("\n===== 小数点の計算 =====");
        System.out.println(x + " / " + y + " = " + result);

        // 複合代入演算子
        int c = 5;
        System.out.println("\n===== 複合代入演算子 =====");
        System.out.println("最初のc: " + c);

        c += 3; // c = c + 3と同じ
        System.out.println("c += 3の後: " + c);

        c -= 2; // c = c - 2と同じ
        System.out.println("c -= 2の後: " + c);

        c *= 4; // c = c * 4と同じ
        System.out.println("c *= 4の後: " + c);

        c /= 3; // c = c / 3と同じ
        System.out.println("c /= 3の後: " + c);

        // インクリメント/デクリメント演算子
        int i = 5;
        System.out.println("\n===== インクリメント/デクリメント =====");
        System.out.println("i: " + i);

        i++; // iを1増加（後置）
        System.out.println("i++後: " + i);

        ++i; // iを1増加（前置）
        System.out.println("++i後: " + i);

        i--; // iを1減少（後置）
        System.out.println("i--後: " + i);

        --i; // iを1減少（前置）
        System.out.println("--i後: " + i);
    }
}
```

### TypeCastExample.java

**学習目標**: 型変換（キャスト）の方法と注意点を学ぶ

```java
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
```

### ScannerExample.java

**学習目標**: キーボードからの入力方法を学ぶ

```java
import java.util.Scanner;

/**
 * Scannerクラスを使った入力の例を示すプログラム
 */
public class ScannerExample {
    public static void main(String[] args) {
        // Scannerオブジェクトの作成
        Scanner scanner = new Scanner(System.in);

        // 文字列の入力
        System.out.print("あなたの名前を入力してください: ");
        String name = scanner.nextLine();  // 1行読み込み

        // 整数の入力
        System.out.print("あなたの年齢を入力してください: ");
        int age = scanner.nextInt();  // 整数を読み込み

        // 入力バッファをクリア
        scanner.nextLine();

        // 小数の入力
        System.out.print("あなたの身長(cm)を入力してください: ");
        double height = scanner.nextDouble();  // 小数を読み込み

        // 結果の表示
        System.out.println("\n----- 入力情報 -----");
        System.out.println("名前: " + name);
        System.out.println("年齢: " + age + "歳");
        System.out.println("身長: " + height + "cm");

        // 文字列操作と組み合わせた例
        System.out.println("\n----- 文字列操作の例 -----");
        System.out.println("名前の長さ: " + name.length() + "文字");

        if (name.equals("山田太郎")) {
            System.out.println("あなたは山田太郎さんですね！");
        }

        if (name.contains("山田")) {
            System.out.println("「山田」を含む名前ですね！");
        }

        // 好きな食べ物を入力（nextLineの使用例）
        System.out.print("\nあなたの好きな食べ物を入力してください: ");
        String food = scanner.next();  // 次の単語を読み込み

        System.out.println(name + "さんの好きな食べ物は" + food + "ですね！");

        // Scannerを閉じる
        scanner.close();
    }
}
```

## 4. 制御構文 - 条件分岐

### IfElseExample.java

**学習目標**: if 文、if-else 文、if-else if-else 文、論理演算子を学ぶ

```java
/**
 * if文の例を示すプログラム
 */
public class IfElseExample {
    public static void main(String[] args) {
        // 単純なif文
        int age = 20;

        System.out.println("===== 単純なif文 =====");
        if (age >= 20) {
            System.out.println("成人です");
        }

        // if-else文
        age = 18;

        System.out.println("\n===== if-else文 =====");
        if (age >= 20) {
            System.out.println("成人です");
        } else {
            System.out.println("未成年です");
        }

        // if-else if-else文
        int score = 85;

        System.out.println("\n===== if-else if-else文 =====");
        if (score >= 90) {
            System.out.println("成績：A");
        } else if (score >= 80) {
            System.out.println("成績：B");
        } else if (score >= 70) {
            System.out.println("成績：C");
        } else if (score >= 60) {
            System.out.println("成績：D");
        } else {
            System.out.println("成績：F");
        }

        // 論理演算子を使用した条件
        int temperature = 28;
        boolean isRaining = false;

        System.out.println("\n===== 論理演算子 =====");

        // 論理AND (&&)
        if (temperature > 25 && !isRaining) {
            System.out.println("暑くて晴れた日です。水分をとりましょう。");
        }

        // 論理OR (||)
        if (temperature > 30 || isRaining) {
            System.out.println("外出に注意が必要です。");
        } else {
            System.out.println("過ごしやすい天気です。");
        }

        // 論理NOT (!)
        if (!isRaining) {
            System.out.println("傘は必要ありません。");
        }

        // 複雑な条件
        int time = 14;
        boolean isWeekend = true;

        if ((time >= 9 && time <= 17) || isWeekend) {
            System.out.println("遊びに行ける時間です。");
        } else {
            System.out.println("仕事や学校の時間です。");
        }
    }
}
```

### SwitchExample.java

**学習目標**: switch 文の使い方、break の役割を学ぶ

```java
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
```

### GradeCalculator.java

**学習目標**: 条件分岐を使った実践的なプログラムを学ぶ

```java
import java.util.Scanner;

/**
 * 成績計算プログラム - 条件分岐の実践例
 */
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 点数の入力
        System.out.print("テストの点数を入力してください（0-100）: ");
        int score = scanner.nextInt();

        // 点数の範囲チェック
        if (score < 0 || score > 100) {
            System.out.println("エラー: 点数は0から100の範囲で入力してください。");
        } else {
            // 成績判定
            String grade;

            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            // 結果の表示
            System.out.println("点数: " + score);
            System.out.println("成績: " + grade);

            // 合格/不合格の判定
            if (score >= 60) {
                System.out.println("合格です！おめでとうございます。");
            } else {
                System.out.println("不合格です。もう少し頑張りましょう。");

                // 追加情報
                int pointsNeeded = 60 - score;
                System.out.println("合格まであと" + pointsNeeded + "点必要です。");
            }

            // コメント
            switch (grade) {
                case "A":
                    System.out.println("素晴らしい成績です！");
                    break;
                case "B":
                    System.out.println("よくできました！");
                    break;
                case "C":
                    System.out.println("まずまずの成績です。");
                    break;
                case "D":
                    System.out.println("合格ラインですが、もう少し頑張りましょう。");
                    break;
                case "F":
                    System.out.println("次回に向けて復習しましょう。");
                    break;
            }
        }

        scanner.close();
    }
}
```

## 5. 制御構文 - 繰り返し

### ForLoopExample.java

**学習目標**: for 文の基本的な使い方と応用を学ぶ

```java
/**
 * for文の基本と応用を示すプログラム
 */
public class ForLoopExample {
    public static void main(String[] args) {
        // 基本的なfor文
        System.out.println("===== 基本的なfor文 =====");
        for (int i = 1; i <= 5; i++) {
            System.out.println("カウント: " + i);
        }

        // 合計を計算するfor文
        System.out.println("\n===== 合計を計算するfor文 =====");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;  // sum = sum + i と同じ
        }
        System.out.println("1から10までの合計: " + sum);

        // 偶数のみを処理するfor文
        System.out.println("\n===== 偶数のみを処理するfor文 =====");
        System.out.println("1から10までの偶数:");
        for (int i = 2; i <= 10; i += 2) {  // 2から始めて2ずつ増やす
            System.out.println(i);
        }

        // 奇数のみを処理するfor文
        System.out.println("\n===== 奇数のみを処理するfor文 =====");
        System.out.println("1から10までの奇数:");
        for (int i = 1; i <= 10; i += 2) {  // 1から始めて2ずつ増やす
            System.out.println(i);
        }

        // カウントダウンのfor文
        System.out.println("\n===== カウントダウンのfor文 =====");
        for (int i = 5; i >= 1; i--) {  // 5から始めて1ずつ減らす
            System.out.println("カウントダウン: " + i);
        }
        System.out.println("スタート！");

        // 配列を処理するfor文
        System.out.println("\n===== 配列を処理するfor文 =====");
        String[] fruits = {"りんご", "バナナ", "オレンジ", "ぶどう", "メロン"};
        System.out.println("果物リスト:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println((i + 1) + ". " + fruits[i]);
        }
    }
}
```

### ForEachExample.java

**学習目標**: 拡張 for 文（for-each）の使い方を学ぶ

```java
/**
 * 拡張for文の例を示すプログラム
 */
public class ForEachExample {
    public static void main(String[] args) {
        // 文字列の配列
        String[] fruits = {"りんご", "バナナ", "オレンジ", "ぶどう", "メロン"};

        // 通常のfor文で配列を処理
        System.out.println("===== 通常のfor文 =====");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("果物: " + fruits[i]);
        }

        // 拡張for文で配列を処理
        System.out.println("\n===== 拡張for文 =====");
        for (String fruit : fruits) {
            System.out.println("果物: " + fruit);
        }

        // 整数の配列と拡張for文
        System.out.println("\n===== 整数配列と拡張for文 =====");
        int[] numbers = {10, 20, 30, 40, 50};
        int total = 0;

        for (int number : numbers) {
            total += number;
            System.out.println("数値: " + number + ", 現在の合計: " + total);
        }

        System.out.println("最終合計: " + total);

        // 拡張for文の制限（インデックスが使えない）
        System.out.println("\n===== 拡張for文の制限 =====");
        System.out.println("通常のfor文では、インデックスを利用できます:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("インデックス " + i + ": " + fruits[i]);
        }

        System.out.println("\n拡張for文では、インデックスを直接扱えません:");
        int index = 0;
        for (String fruit : fruits) {
            System.out.println("インデックス " + index + ": " + fruit);
            index++;
        }
    }
}
```

### NestedLoopExample.java

**学習目標**: ネストしたループ（多重ループ）の使い方を学ぶ

```java
/**
 * ネストしたループの例を示すプログラム
 */
public class NestedLoopExample {
    public static void main(String[] args) {
        // 九九の表
        System.out.println("===== 九九の表 =====");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%2d x %2d = %2d  ", i, j, i * j);
            }
            System.out.println();  // 行の終わりに改行
        }

        // 長方形のパターン
        System.out.println("\n===== 長方形のパターン =====");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 10; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 三角形のパターン
        System.out.println("\n===== 三角形のパターン =====");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 逆三角形のパターン
        System.out.println("\n===== 逆三角形のパターン =====");
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 二次元配列の処理
        System.out.println("\n===== 二次元配列の処理 =====");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
```

### BreakContinueExample.java

**学習目標**: break 文と continue 文の使い方を学ぶ

```java
/**
 * breakとcontinue文の例を示すプログラム
 */
public class BreakContinueExample {
    public static void main(String[] args) {
        // break文の例
        System.out.println("===== break文の例 =====");
        for (int i = 1; i <= 10; i++) {
            System.out.println("現在の数: " + i);
            if (i == 5) {
                System.out.println("5になったのでループを終了します");
                break;  // ループを終了
            }
        }
        System.out.println("ループ終了後の処理");

        // continue文の例
        System.out.println("\n===== continue文の例 =====");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {  // iが奇数の場合
                continue;  // 次の周回に進む
            }
            System.out.println("偶数: " + i);
        }

        // while文でのbreak
        System.out.println("\n===== whileでのbreak =====");
        int count = 1;
        while (true) {  // 無限ループ
            System.out.println("カウント: " + count);
            if (count >= 5) {
                System.out.println("5に達したので終了します");
                break;  // 無限ループを終了
            }
            count++;
        }

        // while文でのcontinue
        System.out.println("\n===== whileでのcontinue =====");
        int i = 0;
        while (i < 10) {
            i++;
            if (i % 3 != 0) {  // 3の倍数でない場合
                continue;  // 次の周回に進む
            }
            System.out.println("3の倍数: " + i);
        }

        // ネストしたループでのbreak
        System.out.println("\n===== ネストしたループでのbreak =====");
        outerLoop: for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.println("行: " + row + ", 列: " + col);
                if (row == 2 && col == 2) {
                    System.out.println("特定の条件を満たしたのでループを終了します");
                    break outerLoop;  // 外側のループを含めて終了
                }
            }
        }
    }
}
```

## コンパイルと実行方法

すべてのサンプルコードは以下の手順でコンパイルと実行ができます：

1. コマンドプロンプト（Windows の場合）またはターミナル（Mac/Linux の場合）を開きます。
2. サンプルコードが保存されているディレクトリに移動します。
3. 以下のコマンドでコンパイルします：
   ```
   javac ファイル名.java
   ```
4. 以下のコマンドで実行します：
   ```
   java クラス名
   ```

例えば、HelloWorld.java をコンパイルして実行する場合：

```
javac HelloWorld.java
java HelloWorld
```

## VS Code での実行方法

Visual Studio Code では、Java ファイルを開いた状態で以下のいずれかの方法で実行できます：

1. 右上に表示される「Run」ボタンをクリック
2. 右クリックして表示されるメニューから「Run Java」を選択
3. キーボードショートカット F5 キーを押す

## 学習のステップ

サンプルコードを効果的に学ぶために、次のステップをお勧めします：

1. コードを自分で入力して実行し、結果を確認する
2. コードを少し変更して、どう動作が変わるかを観察する
3. コメントを追加して、各行が何をしているかを自分の言葉で説明する
4. サンプルコードを基に、自分でオリジナルのプログラムを作成してみる

これらのサンプルコードは、Java プログラミングの基本概念を理解するための出発点です。自分でコードを書いて試すことで、プログラミングスキルを効果的に向上させることができます。
