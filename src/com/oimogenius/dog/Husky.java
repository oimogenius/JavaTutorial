package com.oimogenius.dog;

public class Husky extends Dog {
    static final String BREED = "ハスキー";

    public Husky(String name, int age, boolean isHungry) {
        super(name, age, BREED, isHungry);
    }

    @Override
    void walk() {
        System.out.println("60分散歩するよ");
    }
}
