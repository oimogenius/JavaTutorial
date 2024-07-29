package com.oimogenius.dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 抽象クラスはインスタンス化できない
//        Dog errorDog = new Dog();

        // 犬リストを作る
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Shiba("ポチ", 1, false));
        dogs.add(new Husky("ハナコ", 10, false));
        dogs.add(new Chihuahua("チクワ", 5, true));

        // ペットリストを作る
        // インターフェースも、クラスと同様に多態性を持っている
        List<IPet> pets = new ArrayList<>();
        pets.add(new Chihuahua("テワワ", 5, false));
        pets.add(new Shiba("ボチ", 10, false));

        // 拡張for文
        for (Dog dog : dogs) {
            // オーバーライドしていないので、
            // DogクラスのprintProfileが呼び出される
            dog.printProfile();
            // 各子クラスのwalkメソッドが呼び出される（多態性）
            dog.walk();

            // チワワだったら、震えるメソッドを呼び出す
//            if (dog instanceof Chihuahua) {
//                // キャスト（型変換）：(型)と書くことで、型を変換することができる
//                Chihuahua chihuahua = (Chihuahua) dog;
//                chihuahua.shiver();
//            }

            // instanceofの後ろで、変数を作ることができる
            if (dog instanceof Chihuahua chihuahua) {
                chihuahua.shiver();
            }

            // ペットだったら、芸と遊ぶメソッドを呼び出す
            if (dog instanceof IPet pet) {
                pet.trick();
                pet.play();
            }
        }
    }
}
