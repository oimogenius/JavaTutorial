package com.oimogenius.enumerations;

public enum Day {
    // コンストラクタがあるEnum
    // メンバーを定義するときに、コンストラクタを呼び出す
    SUNDAY("日"),
    MONDAY("月"),
    TUESDAY("火"),
    WEDNESDAY("水"),
    THURSDAY("木"),
    FRIDAY("金"),
    SATURDAY("土");

    // インスタンス変数
    private String displayName;

    // コンストラクタ
    Day(String displayName) {
        this.displayName = displayName;
    }

    // Enumはクラスなので、メソッドを持つことができる。
    public boolean isWeekend() {
        // インスタンスが土曜または日曜の場合、trueを返却
        return this == SATURDAY || this == SUNDAY;
    };

    public String getDisplayName() {
        return displayName;
    }
}
