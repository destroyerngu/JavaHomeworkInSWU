package practice;
import java.util.Random;
import java.util.Scanner;

public class Test{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]a=new int[n][n];
        setValueOfArrayTwo(a);
        printArrayTwo(a);
    }

    private static void printArrayTwo(int[][] a) {
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }


    private static void setValueOfArrayTwo(int[][] a) {
        Random rd=new Random();
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]= rd.nextInt(100);
            }
        }
    }


}
