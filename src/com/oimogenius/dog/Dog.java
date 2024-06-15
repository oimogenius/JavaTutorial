package com.oimogenius.dog;

public class Dog {
    // インスタンス変数
    // インスタンスの状態や情報を表すもの
    String name;
    int age;
    String breed;   // 品種
    boolean isHungry;   // 空腹かどうか

    // コンストラクタ
    public Dog(String name, int age, String breed, boolean isHungry) {
        // インスタンス変数の初期化
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.isHungry = isHungry;
    }

    // インスタンスメソッド
    // インスタンスの行動を表すもの

    // 吠えるメソッド（引数なし、戻り値なし）
    void bark() {
        if (isHungry) {
            // おなかが減っていたらクゥーンと出力
            System.out.println("クゥーン");
        } else {
            // それ以外はワン！と出力
            System.out.println("ワン！");
        }
    }

    // プロフィールを出力
    void printProfile() {
        System.out.println("名前：" + name +
                " 犬種：" + breed + " 年齢" + age + "才");
    }
}
