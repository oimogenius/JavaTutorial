package com.oimogenius.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // 関数型インターフェース：ラムダ式を格納できる型のようなもの
        // 代表的な関数型インターフェース：Suppler、Consumer、Function、Predicate
        // Supplier：引数なし、戻り値あり
        System.out.println("=====Supplier=====");
        Supplier<Integer> dice = () -> {
            Random random = new Random();
            // ランダムで1～6の値を生成する
            return random.nextInt(6) + 1;
        };
        // Supplierはgetメソッドで実行する
        System.out.println("サイコロ１：" + dice.get());
        System.out.println("サイコロ２：" + dice.get());

        // Consumer：引数あり、戻り値なし
        System.out.println("=====Consumer=====");
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        String apple = "Apple";
        String orange = "Orange";
        // Consumerはacceptメソッドで実行する
        printUpperCase.accept(apple);
        printUpperCase.accept(orange);
        printUpperCase.accept("yeah");

        // Function：引数あり、戻り値あり
        System.out.println("=====Function=====");
        // 処理が一行（returnの行のみ）の場合、returnは省略する
        Function<String, Integer> getLength = str -> str.length();
        // Functionはapplyメソッドで実行する
        System.out.println(apple + "の文字の長さ：" + getLength.apply(apple));
        System.out.println(orange + "の文字の長さ：" + getLength.apply(orange));

        // Predicate：引数あり、boolean型の戻り値あり
        System.out.println("=====Predicate=====");
        Predicate<String> startWithA = str -> str.startsWith("A");
        // Predicateはtestメソッドで実行する
        System.out.println(apple + "はAから始まる？：" + startWithA.test(apple));
        System.out.println(orange + "はAから始まる？：" + startWithA.test(orange));

        System.out.println("=====応用=====");
        // フルーツリスト
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("リンゴ", 3));
        fruits.add(new Fruit("オレンジ", 4));
        fruits.add(new Fruit("ブドウ", 10));

        // forEach：リスト内のデータを一つずつ操作する
        // for文、拡張for文よりも短く書くことができる
        // Consumerを引数で受け取る
        fruits.forEach(fruit -> System.out.println(fruit));
        System.out.println("-----名前でソート-----");
        // sort：リストの順番を変更する
        // Comparator.comparing()：Functionを引数で受け取る
        // f：fruitの頭文字
        fruits.sort(Comparator.comparing(f -> f.getName()));
        fruits.forEach(fruit -> System.out.println(fruit));
        System.out.println("-----サイズでソート-----");
        fruits.sort(Comparator.comparing(f -> f.getSize()));
        fruits.forEach(fruit -> System.out.println(fruit));
    }
}
