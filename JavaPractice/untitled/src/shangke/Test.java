package shangke;

/**
 * @author Destroyerngu
 * @date 2022/3/14 - 16:09
 */
public class Test {
    public static void main(String[]args){
    Student st1=new Student();
//    st1.age=18;
//    st1.name="tom";
//    st1.major="computer";
//    st1.school="swu";
    Student st2=new Student("100002","jack");
    st1.setAge(-200);
    st1.printStudentIinfo();
    st2.printStudentIinfo();
//    st2.name="rose";
    st2.printStudentIinfo();
    System.out.println(st1+"\t"+st2);
//    st2=st1;
//    st1.age=30;
    st2.printStudentIinfo();
    st1.printStudentIinfo();
    System.out.println(st1+"\t"+st2);
    Student st3=new Student("100001","tom",30,"computer","swu");
    st3.printStudentIinfo();
    System.out.println(st3.equals(st1));//比较两个对象的内容；
    System.out.println(st3==st1);//比较两个对象是否指向同一对象的内存单元；
    System.out.println(st1==st2);
//    Student.age=20;
//    st1.age=45;
    st1.printStudentIinfo();
    st2.printStudentIinfo();
    st3.printStudentIinfo();
    }
}
