package practice;

/**
  @author Destroyerngu
 * @date 2022/3/3 - 18:14
 */
import java.util.*;
public class Hello {
    int age;
    int getAge()
    {
        return age;
    }
    public static void main(String[] args){
        Hello my=new Hello();
        my.age=20;
        System.out.println("Hi,today is:");
        System.out.println(new Date());
        System.out.println("I'm "+my.getAge()+" years old");
    }
}
