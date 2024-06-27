package com.oimogenius.loop;

public class Alphabets {
    public static void main(String[] args) {
        // アルファベット26文字が入った配列を用意
        char[] alphabets = new char[]{'a', 'b', 'c', 'd', 'e',
                'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        // パターン１：for文を使って出力
        for (int i = 0; i < alphabets.length; i++) {
            System.out.print(alphabets[i]);
        }
        // 改行
        System.out.println();

        // パターン２：拡張for文を使って出力
        for (char alphabet : alphabets) {
            System.out.print(alphabet);
        }
        // 改行
        System.out.println();

        // パターン３：while文を使って出力
        int i = 0;
        while (i < alphabets.length) {
            System.out.print(alphabets[i]);
            i++;
        }
        // 改行
        System.out.println();

        // continueとbreakの使い方
        i = 0;
        while (i < alphabets.length) {
            if (i % 5 == 0 && i != 0) {
                // インデックスが5の倍数の場合、インクリメントだけして先に進む
                i++;
                continue;
            }
            if (i > 20) {
                // インデックスが20以上の場合、ループを中断する
                break;
            }
            System.out.print(alphabets[i]);
            i++;
        }
        // 改行
        System.out.println();

        // おまけ：charをインクリメントする
        // アルファベットを出力するだけなら、これが一番簡単
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            System.out.print(alphabet);
        }
    }
}
