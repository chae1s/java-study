package study.oop.inheritance;

public class RempVO extends Employee {
    public RempVO() {

    }

    public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage) {
        // 초기화
        super(name, age, phone, empDate, dept, marriage);
    }
}
