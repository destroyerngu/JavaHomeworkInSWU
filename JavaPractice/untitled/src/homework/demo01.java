package homework;

/**
 * @author Destroyerngu
 * @date 2022/3/10 - 18:47
 */
import java.util.Scanner;
import java.math.*;
    public class demo01 {

        public static void main(String[] args) {
            //一维数组动态分配
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int a[]=new int[n];
            setValueOfArrayOne(a);
            printArrayOne(a);
            //最大值
            int max=getArrayOneMax(a);
            System.out.println("数组中最大的元素为："+max);
            //最小值
            int min=getArrayOneMin(a);
            System.out.println("数组中最小值："+min);
            //求数组的平均值
            double average=getArrayOne(a);
            System.out.println("数组的平均值："+average);
            //查找数组中与平均值最接近的值
            int m=theNearestNumberOfAverage(a);
            System.out.println("数组中与平均值最接近的值"+m);
            //查找数组中某一个元素
            Scanner find=new Scanner(System.in);
            int f=find.nextInt();
            System.out.print(a[f]);

        }

        private static int getArrayOneMin(int[] a) {
            int k=a[0];
            for (int i = 0; i < a.length; i++) {
                if (k>a[i])
                    k=a[i];
            }
            return k;
        }

        private static int getArrayOneMax(int[] a) {
            int k=a[0];
            for (int i = 0; i < a.length; i++) {
                if (k<a[i])
                    k=a[i];
            }
            return k;
        }


        private static int theNearestNumberOfAverage(int[] a) {
            double k=getArrayOne(a);
            double j=Math.abs((k-a[0]));
            int s=0;
            for(int i=1;i<a.length;i++){
                if(j>Math.abs(k-a[i])){
                    j=Math.abs(k-a[i]);
                    s=i;
                }
            }
            return a[s];
        }

        private static double getArrayOne(int[] a) {
            int sum=0;
            for(int i=0;i<a.length;i++){
                sum+=a[i];
            }
            return sum*1.0/a.length;
        }

        private static void printArrayOne(int[] a) {
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+"\t");
            }
        }

        private static void setValueOfArrayOne(int[] a) {
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
            }
        }

    }

