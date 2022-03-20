package practice;

/**
 * @author Destroyerngu
 * @date 2022/3/7 - 20:17
 */
public class Enumdemo {
    public enum week{
        sun,mon,tue,thu,fri,sat;
    }
    public static void main(String[]args){
        week day1=week.mon;
        week day2=week.thu;
        int diff= day2.ordinal()-day1.ordinal();
        System.out.println(day1.ordinal());
        System.out.println(day2.ordinal());
        System.out.println(diff);
    }
}
