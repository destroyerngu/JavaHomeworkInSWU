package homework2;

import java.util.Random;
import java.util.Scanner;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

/**
 * @author Destroyerngu
 * @date 2022/3/17 - 18:51
 */
    public class Array {

        public static void main(String[] args) {
            Point []a=new Point[50];
            setValueArray(a);
            getValueArray(a);
            printOfArray(a);
            //求是否有两个相等的点，有则输出相应语句，无则不输出任何语句；
            justifyArray(a);
            getTheDistanceOfOthers(a);
            getTheNearestTwoPoint(a);
        }

    private static void printOfArray(Point[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("a["+i+"]="+"("+a[i].getX()+","+a[i].getY()+")"+"\n");
        }
    }


    private static void getTheNearestTwoPoint(Point[] a) {
            int i=0,j=0;
            int k=0,m=0;
            double distance=0.0;
            double x0=Math.pow(a[0].getX()-a[1].getX(), 2);
            double y0=Math.pow(a[0].getY()-a[1].getY(), 2);
            distance=Math.sqrt(x0+y0);
            for(i=0;i<a.length;i++)
            {
                for(j=i+1;j<a.length;j++)
                {
                    double x =Math.pow(a[i].getX()-a[j].getX(), 2);
                    double y =Math.pow(a[i].getY()-a[j].getY(), 2);

                    if(distance>Math.sqrt(x+y))
                    {
                        distance=Math.sqrt(x+y);
                        k=i;
                        m=j;
                    }


                }
            }
            System.out.println("求距离最近的两个点"+"a["+k+"]"+"\t"+"a["+m+"]"+"\n"+"两点距离为："+distance);
        }



        private static void getTheDistanceOfOthers(Point[] a) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            double distance=0.0;
            for(int i=0;i<a.length;i++){
                double x,y,x0,y0;
                x0=a[n].getX();
                y0=a[n].getY();
                x=a[i].getX();
                y=a[i].getY();
                distance=Math.sqrt(Math.pow(x-x0, 2)+Math.pow(y-y0, 2));
                System.out.println("a["+n+"]"+"到"+"a["+i+"]"+"的距离为："+distance);
            }


        }

        private static void justifyArray(Point[] a) {
            for(int i=0;i<a.length;i++){
                for(int j=i+1;j<a.length;j++){
                    if(a[i].equals(a[j]))
                    {	System.out.println("这个数组有两个相等的点");
                        break;
                    }

                }


            }

        }

        private static void getValueArray(Point[] a) {
            Random rd=new Random();
            for(int i=0;i<a.length;i++){
                a[i].setX(100.0*rd.nextDouble());
                a[i].setY(100.0*rd.nextDouble());
            }
        }

        public static void setValueArray(Point []a) {

            for(int i=0;i<a.length;i++){
                a[i]=new Point();
            }
        }

    }

