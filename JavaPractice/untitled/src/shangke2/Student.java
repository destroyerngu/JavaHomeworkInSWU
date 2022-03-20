package shangke2;

/**
 * @author Destroyerngu
 * @date 2022/3/14 - 17:08
 */
public class Student {
    private int age;
    private String name;
    private String id;
    private String major;
    private String school;
    private String address;
    private String mobile;
    private String eMail;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMail() {
        return eMail;
    }

    public void setMail(String eMail) {
        this.eMail = eMail;
    }

    public Student(int age, String name, String id, String major, String school, String address, String mobile, String eMail) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.major = major;
        this.school = school;
        this.address = address;
        this.mobile = mobile;
        this.eMail = eMail;
    }
}
