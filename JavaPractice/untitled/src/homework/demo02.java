package homework;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Destroyerngu
 * @date 2022/3/12 - 10:37
 */
public class demo02 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int n= sc.nextInt();
        int [][]a=new int[n][n];
        setValueArrayTwo(a);
        printArrayTwo(a);
        int max=getArrayTwoOfMax(a);
        System.out.println("The maximum is "+max);
        int min=getArrayTwoOfmin(a);
        System.out.println("The minmum is "+min);
        double average = getAverageOfArrayTwo(a);
        System.out.println("The Average is "+average);
        double averageOfTheDiagonal=getAverageOfTheDiagonal(a);
        System.out.println("The average of main diagonal’value is "+averageOfTheDiagonal);
        double averageOfTheSubDiagonal=getAverageOfTheSubDiagonal(a);
        System.out.println("The average of Sub-diagonal‘value is "+averageOfTheSubDiagonal);
        int outerRingArraySum=getOuterRingOfArraySum(a);
        System.out.println("The outer ring of the array’sum is "+outerRingArraySum);
        setValueArrayTwoUnderMainDiagonal(a);
        printArrayTwo(a);
    }

    private static void setValueArrayTwoUnderMainDiagonal(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i==j)
                    break;
                a[i][j]=0;
            }
        }
    }

    private static int getOuterRingOfArraySum(int[][] a) {
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(i==0 ||i==a.length-1)
                    sum+=a[i][j];
                else
                    if (j==0||j==a.length-1)
                        sum+=a[i][j];
            }
        }
        return sum;
    }

    private static double getAverageOfTheSubDiagonal(int[][] a) {
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i+j==a.length-1)
                    sum+=a[i][j];
            }
        }
        return sum*1.0/a.length;
    }

    private static double getAverageOfTheDiagonal(int[][] a) {
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i==j)
                    sum+=a[i][j];
            }
        }
        return sum*1.0/a.length;
    }

    private static double getAverageOfArrayTwo(int[][] a) {
        int add=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                add+=a[i][j];
            }
        }
        return add*1.0/(a.length*a.length);
    }

    private static int getArrayTwoOfmin(int[][] a) {
        int min=a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (min>a[i][j])
                    min=a[i][j];
            }
        }
        return min;
    }

    private static int getArrayTwoOfMax(int[][] a) {
        int m=a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (m<a[i][j])
                    m=a[i][j];
            }
        }
        return m;
    }


    private static void printArrayTwo(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }

    private static void setValueArrayTwo(int[][] a) {
        Random rd=new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                    a[i][j]=rd.nextInt(100);
            }
        }
    }
}
