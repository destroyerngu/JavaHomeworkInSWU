package practice;

/**
 * @author Destroyerngu
 * @date 2022/3/3 - 20:25
 */
public class CalculateCircleArea {
    public static void main(String[]args){
        Circle r1 = new Circle();
        r1.r=3;
        r1.getArea();
        System.out.println("圆的半径是"+r1.r+"圆的面积是"+r1.area);
    }
}
