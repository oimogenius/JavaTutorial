package com.oimogenius.dog;

public interface IPet {
    // 定数
    // interfaceでは、なにもつけなくても、
    // 勝手に「public static final」になる
    int NUM = 10;

    // 抽象メソッド
    // interfaceでは、abstractをつけなくても抽象メソッドになる
    void trick();

    // デフォルトメソッド
    // オーバーライドしなくてもいいメソッド
    default void play() {
        System.out.println("ボールで遊ぶぞ！");
    }
}
