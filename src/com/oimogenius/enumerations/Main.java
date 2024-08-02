package com.oimogenius.enumerations;

public class Main {
    public static void main(String[] args) {
        Season season = Season.SPRING;

        switch (season) {
            case SPRING -> System.out.println("花見だ！");
            case SUMMER -> System.out.println("海水浴だ！");
            case AUTUMN -> System.out.println("紅葉狩りだ！");
            case WINTER -> System.out.println("温泉だ！");
        }

        Day today = Day.FRIDAY;
        // インスタンス変数を呼び出し
        System.out.println("今日は" + today.getDisplayName() + "曜日");
        if (today.isWeekend()) {
            System.out.println("週末だよ");
        } else {
            System.out.println("平日だよ");
        }

        // switch式は戻り値を返すことができる
        // 下の例では、戻り値をprintln()で受け取って出力している
        System.out.println(switch (today) {
            case FRIDAY -> "きゃっほう！！";
            case SATURDAY -> "いぇーい！！";
            case SUNDAY -> "フゥ";
            default -> "どよーん";
        });
    }
}
