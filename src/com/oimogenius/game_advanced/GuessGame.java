package com.oimogenius.game_advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    // 予想済みリスト
    private List<Integer> guessed;
    // 答え
    private int answer;
    // 回答権の数
    private int count;

    // コンストラクタ
    public GuessGame() {
        // インスタンス変数の初期化
        guessed = new ArrayList<>();
        answer = new Random().nextInt(10) + 1;
        count = 3;
    }

    public boolean play() {
        System.out.println("１から１０の間の数字を思い浮かべているよ。３回以内に当ててみて！");
        while (true) {
            // 入力の受け取りとチェック処理
            int input = getUserInput();
            if (input < 0) continue;

            count--;

            // 正誤判定
            if (answer == input) {
                System.out.println("大正解！");
                break;
            }
            // 回答権がもうない場合
            if (count <= 0) {
                System.out.println("残念！");
                System.out.println("答え：" + answer);
                break;
            }

            // 外れた場合
            giveHint(input);
            guessed.add(input);
            System.out.println("残り" + count + "回");
        }
        // ゲームを続けるかどうか
        return askToPlayAgain();
    }

    // ユーザーの回答を受け取る
    private int getUserInput() {
        System.out.print("１～１０までの値を入力してね：");
        Scanner scanner = new Scanner(System.in);
        return validateAnswer(scanner);
    }

    // 受け取った回答が有効かチェック
    private int validateAnswer(Scanner scanner) {
        if (!scanner.hasNextInt()) {
            System.out.println("数字を入力してね");
            return -1;
        }
        int input = scanner.nextInt();
        if (input < 1 || 10 < input) {
            System.out.println("入力する数字は1～10にしてね");
            return -1;
        }
        // すでに予想した数字の場合
        if (guessed.contains(input)) {
            System.out.println("その数字は予想済みだよ！");
            return -1;
        }
        return input;
    }

    // ヒントを出す
    private void giveHint(int input) {
        if (answer < input) {
            System.out.println("もっと小さいよ");
        } else {
            System.out.println("もっと大きいよ");
        }
    }

    // ゲームを続けるか聞く
    private boolean askToPlayAgain() {
        System.out.print("もう一度遊ぶ？（yes/no）：");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext("no")) {
            System.out.println("また遊んでね！");
            return false;
        }
        return true;
    }
}
