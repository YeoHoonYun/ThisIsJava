package yun.java.ch05_참조타입;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-14
 * Github : https://github.com/YeoHoonYun
 */
public class EnumMethodExample {
    public static void main(String[] args) {
        Week today = Week.SUNDAY;
        String name = today.name();
        System.out.println(name);

        int ordinal = today.ordinal();
        System.out.println(ordinal);

        Week day1 = Week.MONDAY;
        Week day2 = Week.WEDNESDAY;
        int result1 = day1.compareTo(day1);
        int result2 = day2.compareTo(day2);
        System.out.println(result1);
        System.out.println(result2);

        if(args.length == 1){
            String strDay = args[0];
            Week weekDay = Week.valueOf(strDay);
            if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY){
                System.out.println("주말 이군요");
            }else {
                System.out.println("평일 이군요");
            }
        }

        Week[] days = Week.values();
        for(Week day : days){
            System.out.println(day);
        }
    }
}
