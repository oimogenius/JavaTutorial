package com.oimogenius.dog;

public class Chihuahua extends Dog {
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
}
