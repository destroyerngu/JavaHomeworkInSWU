package testForBetterUse;

/**
 * @author Destroyerngu
 * @date 2022/3/14 - 20:19
 */
public class Test02 {
    public static void main(String[]args){
     Test01 one=new Test01("hhh","110",30,"student","swu");
    Test01 two=new Test01("hhh","110",30,"student","swu");
    System.out.println(one==two);
    System.out.println(one.equals(two));
    }
}
