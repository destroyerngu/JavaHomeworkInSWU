package homework2;

import java.util.Scanner;

/**
 * @author Destroyerngu
 * @date 2022/3/17 - 19:07
 */
public class Triangle {
    //此处不能 Point p1,p2,p3,否则指针为空，不要问为什么，都是辛酸；
    Point p1=new Point();
    Point p2=new Point();
    Point p3=new Point();
    public  double getA(){
        return Math.sqrt(Math.pow(p1.getX()- p2.getX(),2)+Math.pow(p1.getY()- p2.getY(),2));
    }
    public double getB(){
        return Math.sqrt(Math.pow(p1.getX()- p3.getX(),2)+Math.pow(p1.getY()- p3.getY(),2));
    }
    public double getC(){
        return Math.sqrt(Math.pow(p2.getX()- p3.getX(),2)+Math.pow(p2.getY()- p3.getY(),2));
    }
    public double getArea(double a,double b,double c) {
        double p=0.0,area=0.0;
        p=(a+b+c)/2.0;
        area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return area;
    }
    public double getCircumference(double a, double b, double c) {
        double circumference=0.0;
        circumference=a+b+c;
        return circumference;
    }
    public void justifyTriangle(double a,double b,double c) {


        if (a+b>c&&a+c>b&&b+c>a){
            System.out.println("可以构成三角形");
        }
        else {
            System.out.println("不能构成三角形");
        }


    }
    public Triangle(Point a, Point b, Point c) {
        p1 = new Point(a.x, a.y);
        p2 = new Point(b.x, b.y);
        p3 = new Point(c.x, c.y);
    }
    public Triangle(){}

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Triangle triangle=new Triangle();
        triangle.p1.setY(sc.nextFloat());
        triangle.p1.setY(sc.nextDouble());
        triangle.p2.setX(sc.nextDouble());
        triangle.p2.setY(sc.nextDouble());
        triangle.p3.setX(sc.nextDouble());
        triangle.p3.setY(sc.nextDouble());
        double a=triangle.getA();
        double b=triangle.getB();
        double c=triangle.getC();
        triangle.justifyTriangle(a,b,c);

    }
}
