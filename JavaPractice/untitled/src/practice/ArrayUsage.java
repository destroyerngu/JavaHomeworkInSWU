package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Destroyerngu
 * @date 2022/3/8 - 20:02
 */
public class ArrayUsage {
    public static void main(String[]args){
        int []a=new int[]{1,3,5,7};
        int []a1=new int[]{1,3,5,7};
        System.out.println(Arrays.equals(a,a1));
        int[]b=Arrays.copyOf(a,6);
        System.out.println(Arrays.equals(b,a1));
        System.out.println(Arrays.toString(b));//把数组转换成字符串输出
        Arrays.fill(b,2,5,1);
        System.out.println(Arrays.toString(b));
        Arrays.sort(b);//对b进行排序
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.binarySearch(b,3));//使用二分法查找3的位置
    }
}
