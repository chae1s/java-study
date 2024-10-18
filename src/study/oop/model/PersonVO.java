package study.oop.model;

public class PersonVO {

    private String name;
    private int age;
    private String phone;

    // 생성자메서드 -> 객체 생성 후 초기화
    public PersonVO() {
    }

    // 생성자메서드 오버로딩
    public PersonVO(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return name + "\t" + age + "\t" + phone;
    }
}
