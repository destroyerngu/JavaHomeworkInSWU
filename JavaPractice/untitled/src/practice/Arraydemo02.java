package practice;

/**
 * @author Destroyerngu
 * @date 2022/3/7 - 20:29
 */
public class Arraydemo02 {
    public static void main(String[]args){
        String name[]={"zsan","lsi","sunsong","liwei","maoning","zhangting","wangwen","zhangxi","yangyi","zhangyang",
        "songtao","liming","chencheng","lixiao","zhangjia","qianjun"};
        int [] grade=new int[]{341,273,278,329,445,402,388,275,243,334,412,393,299,343,317,265};
        for (int i = 0; i < grade.length; i++) {
            for (int j = i; j < grade.length; j++) {
                int temp;
                String Stemp;
                if (grade[i]<grade[j])
                {
                    temp=grade[i];
                    grade[i]=grade[j];
                    grade[j]=temp;
                    Stemp=name[i];
                    name[i]=name[j];
                    name[j]=Stemp;
                }
            }
        }
        System.out.println("名次 "+"姓名"+"成绩");
        System.out.println("第一名      "+name[0]+"    "+grade[0]);
        System.out.println("第二名      "+name[1]+"    "+grade[1]);
        System.out.println("第三名      "+name[2]+"    "+grade[2]);
    }
}
