package com.oimogenius.dog;

public class Main {
    public static void main(String[] args) {
        // Dogインスタンスを作成
        Dog pochi = new Dog("ポチ", 1, "柴犬", false);
        Dog chikuwa = new Dog("チクワ", 5, "チワワ", true);

        // メソッドを呼び出す
        pochi.printProfile();
        pochi.bark();
        chikuwa.printProfile();
        chikuwa.bark();
    }
}
