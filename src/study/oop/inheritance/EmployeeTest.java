package study.oop.inheritance;

public class EmployeeTest {
    public static void main(String[] args) {
        RempVO rempVO = new RempVO("홍길동", 30, "010-1111-1111", "2022/10/10", "홍보부", false);
//        rempVO.name = "홍길동";
//        rempVO.age = 30;
//        rempVO.phone = "010-1111-1111";
//        rempVO.empDate = "2022/10/10";
//        rempVO.dept = "홍보부";
//        rempVO.marriage = false;

        System.out.println(rempVO.toString());

    }
}
