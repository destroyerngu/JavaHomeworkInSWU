package practice;

/**
 * @author Destroyerngu
 * @date 2022/3/7 - 20:44
 */
public class Arraydemo03 {
      public static void main(String[]args){
          String[][] names={
                  {"Mr. ","Mrs. ","Ms. ",},
                  {"Smith","Jones"}
          };
          System.out.println(names[0][0]+names[1][0]);
          System.out.println(names[0][2]+names[1][1]);
          System.out.println("数组长度为："+names.length);
          for(int i=0;i<names.length;i++){
              System.out.println("数组里第"+i+"个元素长度为："+names[i].length);
          }
      }
}
