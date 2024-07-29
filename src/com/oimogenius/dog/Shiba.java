package com.oimogenius.dog;

public class Shiba extends Dog implements IPet {
    static final String BREED = "柴犬";

    public Shiba(String name, int age, boolean isHungry) {
        // 親クラスのコンストラクタを呼び出す
        super(name, age, BREED, isHungry);
    }

    @Override
    void walk() {
        // super：親クラス
        // 親クラスの処理＋独自処理を実行したい場合は、
        // superの後に処理を書く
//        super.walk();
        System.out.println("45分散歩するよ");
    }

    @Override
    public void trick() {
        System.out.println("お手！");
    }
}
