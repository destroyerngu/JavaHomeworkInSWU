package homework2;

import java.util.Scanner;

/**
 * @author Destroyerngu
 * @date 2022/3/17 - 20:45
 */
public class TestTriangle {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();
        triangle.p1.setX(sc.nextDouble());
        triangle.p1.setY(sc.nextDouble());
        triangle.p2.setX(sc.nextDouble());
        triangle.p2.setX(sc.nextDouble());
        triangle.p3.setX(sc.nextDouble());
        triangle.p3.setX(sc.nextDouble());
        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();
        double area = triangle.getArea(a, b, c);
        System.out.println("这个三角形的面积为：" + area);
        double circumference = triangle.getCircumference(a, b, c);
        System.out.println("这个三角形的周长为：" + circumference);
    }
}
