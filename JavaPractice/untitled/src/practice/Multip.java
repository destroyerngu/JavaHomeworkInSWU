package practice;

/**
 * @author Destroyerngu
 * @date 2022/3/7 - 17:01
 */
public class Multip {
    public static void main(String[]args){
        for (int i=1;i<=9;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(i+"*"+j+"="+(i*j)+"\t"); // "\t为水平制表符，4格
            }
            System.out.println();
        }
    }
}
