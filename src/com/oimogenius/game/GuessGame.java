package com.oimogenius.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        boolean isPlaying = true;

        while (isPlaying) {
            // ランダムで１～１０の値を生成する
            int answer = new Random().nextInt(10) + 1;
            // 回答権
            int count = 3;
            // 予想した数字リスト
            List<Integer> guessed = new ArrayList<>();
            System.out.println("１から１０の間の数字を思い浮かべているよ。３回以内に当ててみて！");

            while (0 < count) {
                // コンソールから入力を受け取る
                System.out.print("１～１０までの値を入力してね：");
                Scanner scanner = new Scanner(System.in);
                // 数字かどうかチェック
                if (!scanner.hasNextInt()) {
                    System.out.println("数字を入力してね");
                    continue;
                }

                // 入力された値を保存
                int input = scanner.nextInt();
                // 範囲内かどうかチェック
                if (input < 1 || 10 < input) {
                    System.out.println("入力する数字は１～１０にしてね");
                    continue;
                }
                // すでに予想した数字かチェック
                if (guessed.contains(input)) {
                    System.out.println("その数字は予想済みだよ！");
                    continue;
                }

                count--;

                // 正解の場合
                if (input == answer) {
                    System.out.println("大正解!!");
                    break;
                }
                // 回答権がなくなった場合
                if (count <= 0) {
                    System.out.println("残念！");
                    System.out.println("答え：" + answer);
                    break;
                }

                // ヒントを出す
                if (answer < input) {
                    System.out.println("もっと小さいよ");
                } else {
                    System.out.println("もっと大きいよ");
                }
                // 残り回数を表示する
                System.out.println("残り" + count + "回");
                // 予想済みリストに追加
                guessed.add(input);

            }  // 回答権のループの終わり

            System.out.print("もう一度遊ぶ？(yes/no)：");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNext("no")) {
                System.out.println("また遊んでね！");
                isPlaying = false;
            }
        }  // ゲーム全体のループの終わり

    }
}
