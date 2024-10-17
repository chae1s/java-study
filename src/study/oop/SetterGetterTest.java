package study.oop;

import study.oop.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {

        PersonVO personVO = new PersonVO();

        personVO.setName("춘배");
        personVO.setAge(10);
        personVO.setPhone("010-1111-1111");

        System.out.println(personVO.getName() + "\t" + personVO.getAge() + "\t" + personVO.getPhone());

        PersonVO personVO1 = new PersonVO("마루", 5, "010-1111-2222");

        System.out.println(personVO1.getName() + "\t" + personVO1.getAge() + "\t" + personVO1.getPhone());
    }
}
