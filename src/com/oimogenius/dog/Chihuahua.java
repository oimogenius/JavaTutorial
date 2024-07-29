package com.oimogenius.dog;

public class Chihuahua extends Dog implements IPet {
    static final String BREED = "チワワ";

    public Chihuahua(String name, int age, boolean isHungry) {
        super(name, age, BREED, isHungry);
    }

    @Override
    void walk() {
        System.out.println("30分散歩するよ");
    }

    // 震えるメソッド
    void shiver() {
        System.out.println("ブルブル");
    }

    @Override
    public void trick() {
        System.out.println("おすわり！");
    }

    @Override
    public void play() {
        // インターフェースのplayメソッドを呼び出す
        IPet.super.play();
        // チワワの独自処理
        System.out.println("フリスビーでも遊ぶよ！");
    }
}
