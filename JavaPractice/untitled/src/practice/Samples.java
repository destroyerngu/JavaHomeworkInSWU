package practice;

/**
 * @author Destroyerngu
 * @date 2022/3/3 - 20:38
 */
public class Samples {
    public static void main(String[]args){
        Product iphone=new Product();
        Product ipad=new Product(10,"ipad2","computer",5000);
        Product macbook=new Product(11,"apple","computer",9999);
        System.out.println("ipad price is:"+ipad.productPrice);
        System.out.println("macbook price is:"+macbook.productPrice);
    }
}
