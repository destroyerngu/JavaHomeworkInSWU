package shangke;

import java.util.Objects;

/**
 * @author Destroyerngu
 * @date 2022/3/14 - 15:52
 */
public class Student {
    //属性：表示数据；
    private String name;
    private String id;
    private  int age;
    private String major;
    private String school;
    // 方法：构造方法(构造对象)，普通方法(成员方法）
    // 定义构造方法;
    // 1,构造方法的名称与类的名称相同；
    // 2,构造方法无返回值，也不能为void
    // 3,构造方法可以重载；
    // 4,构造方法不能被子类继承，但可以被调用；
    // 5,如果不定义构造方法，Java会自动添加一个无参数的构造方法；
    // 定义一个无参数的构造方法
    // 内存：栈内存，堆内存；堆内存存放值，栈内存存放指针；
    public Student(){}
    public Student(String id,String name,int age,String major,String school){
        this.id=id;
        this.name=name;
        this.age=age;
        this.major=major;
        this.school=school;
    }
    public Student(String id,String name){
        this.id=id;// this.id指属性中的id
        this.name=name;
    }
    public int add(int a,int b){
        return a+b;
    }
    public void printStudentIinfo(){
        System.out.print(id+"\t"+name+"\t"+age+"\t"+major+"\t"+this.school+"\n");
    }

    public void setAge(int age){
        if (age>=20&&age<=50)
        {
            this.age=age;
        }
        else{
                this.age=20;
            }
        }

    public  int getAge(int age) {
        return this.age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(id, student.id) && Objects.equals(major, student.major) && Objects.equals(school, student.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, age, major, school);
    }
}
