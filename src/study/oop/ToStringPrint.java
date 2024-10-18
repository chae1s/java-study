package study.oop;

import study.oop.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {

        PersonVO personVO = new PersonVO("홍길동", 34, "010-1111-1111");

        System.out.println(personVO.getName() + "\t" + personVO.getAge() + "\t" + personVO.getPhone());

        System.out.println(personVO.toString());
    }
}
