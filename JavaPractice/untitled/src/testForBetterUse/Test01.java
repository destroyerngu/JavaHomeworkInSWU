package testForBetterUse;

import java.util.Objects;

/**
 * @author Destroyerngu
 * @date 2022/3/14 - 20:11
 */
public class Test01 {
    private String name;
    private String id;
    private  int age;
    private String major;
    private String school;

    public Test01(String name, String id, int age, String major, String school) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.major = major;
        this.school = school;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test01)) return false;
        Test01 test01 = (Test01) o;
        return age == test01.age && Objects.equals(name, test01.name) && Objects.equals(id, test01.id) && Objects.equals(major, test01.major) && Objects.equals(school, test01.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, age, major, school);
    }*/

}
