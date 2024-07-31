package com.oimogenius.lambda;

public class Fruit {
    // インスタンス変数
    private String name;
    private int size;

    // コンストラクタ
    public Fruit(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /*
    フルーツの名前を取得するメソッド
    インスタンス変数をprivateにしているため、
    メソッド経由で値を取得できるようにしている
     */
    public String getName() {
        return name;
    }

    // フルーツのサイズを取得するメソッド
    public int getSize() {
        return size;
    }

    /*
    toString：オブジェクトクラスで定義されているメソッド
    オーバーライドすることで、このクラスをString型にしたときの文字列を設定できる
    Mod開発ではあまり使わないが、知っておくといいことがあるかも？
     */
    @Override
    public String toString() {
        return name + " サイズ：" + size;
    }
}
